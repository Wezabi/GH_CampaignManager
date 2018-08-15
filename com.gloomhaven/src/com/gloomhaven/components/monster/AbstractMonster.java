package com.gloomhaven.components.monster;

import java.util.List;

import com.gloomhaven.components.deck.MonsterActionCard;
import com.gloomhaven.components.deck.MonsterActionCardDeck;
import com.gloomhaven.components.deck.MonsterAttackModifierDeck;
import com.gloomhaven.components.monster.decks.MonsterActionCardBanditGuardDeck;
import com.gloomhaven.constants.Modifier;
import com.gloomhaven.constants.Status;

/**
 * <p>
 * TODO
 * </p>
 * <p>
 * Copyright &copy 2018 Cerner Corporation
 * </p>
 *
 * @author Wes Huhman
 */
public abstract class AbstractMonster
{
    /**
     * Monster's base attack.
     */
    public int baseAttack = 0;
    /**
     * Monster's base health.
     */
    public int baseHealth = 0;
    /**
     * Monster's base move.
     */
    public int baseMove = 0;
    /**
     * Monster's base range.
     */
    public int baseRange = 0;
    /**
     * Monster's base retaliate.
     */
    public int baseRetaliate = 0;
    /**
     * Monster's base shield.
     */
    public int baseShield = 0;
    /**
     * Monster's current health.
     */
    public int currentHealth = 0;
    /**
     * True if monster is elite.
     */
    public boolean isElite = false;
    /**
     * List of statuses the monster has by default.
     */
    public List<Status> innateEffects = null; 
    /**
     * True if monster is flying.
     */
    public boolean isFlying = false;
    /**
     * True if retaliates at ranged.
     */
    public boolean isRangedRetaliate = false;
    /**
     * Monster's level.
     */
    public int level = 0;
    /**
     * Monster' name
     */
    public String name = ""; //$NON-NLS-1$
    /**
     * Monster's action card deck.
     */
    public MonsterActionCardDeck monsterActionCardDeck = null;
    /**
     * Monster's attack modifier deck.
     */
    public MonsterAttackModifierDeck attackModifierDeck = MonsterAttackModifierDeck.getInstance();
    
    /**
     * @return base attack
     */
    public int getBaseAttack()
    {
        return baseAttack;
    }
    
    /**
     * @return base Health
     */
    public int getBaseHealth()
    {
        return baseHealth;
    }
    
    /**
     * @return base move
     */
    public int getBaseMove()
    {
        return baseMove;
    }
    
    /**
     * @return base range
     */
    public final int getBaseRange()
    {
        return baseRange;
    }
    
    /**
     * @return base retaliate
     */
    public final int getBaseRetaliate()
    {
        return baseRetaliate;
    }
    
    /**
     * @return base shield
     */
    public final int getBaseShield()
    {
        return baseShield;
    }
    
    /**
     * @return innate effects
     */
    public final List<Status> getInnateEffects()
    {
        return innateEffects;
    }
    /**
     * @return the monster name
     */
    public final String getName()
    {
        return name;
    }
    
    /**
     * Decreases the monster health by {@code damage}.
     */
    public void takeDamage(int damage)
    {
        int shield = baseShield + monsterActionCardDeck.getActiveCard().getShieldModValue();
        int trueDamage = Math.max(0, damage-shield);
        System.out.print(name);
        if(shield>0)
            System.out.print("'s shield negates " + shield + " damage. " + name);
        System.out.println(" takes " + String.valueOf(trueDamage));
    }
    
    /**
     * Calculates the damage dealt.
     * 
     * @return the calculated damage
     */
    public int dealDamage()
    {
        Modifier mod = attackModifierDeck.draw().getValue();
        MonsterActionCard action = monsterActionCardDeck.getActiveCard();
        System.out.print(name + " deals base damage of " + String.valueOf(baseAttack) + ", "); //$NON-NLS-1$ //$NON-NLS-2$
        System.out.print(action.getAttackModValue() + " from the monster ability card, and "); //$NON-NLS-1$
        switch(mod)
        {
            case X2:
                System.out.println(" draws a CRIT for " + String.valueOf(this.baseAttack*2 + action.getAttackModValue()) + " total damage!"); //$NON-NLS-1$ //$NON-NLS-2$
                return this.baseAttack * 2 + action.getAttackModValue();
            case MISS: 
                System.out.println(" draws a MISS for zero damage!"); //$NON-NLS-1$
                return 0;
            case NONE:
                System.out.println(" Error, monster deck shouldn't be drawing this ever."); //$NON-NLS-1$
                return 0;
            default:
                System.out.println(" draws a " + String.valueOf(mod.getValue()) + " for " + String.valueOf(this.baseAttack + mod.getValue()) + " total damage."); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
                return this.baseAttack + mod.getValue() + action.getAttackModValue();
        }
    }
    /**
     * @return the calculated base attack
     */
    public abstract int calculateBaseAttack(int level, boolean isElite);
   
    /**
     * @return the calculated base health
     */
    public abstract int calculateBaseHealth(int level, boolean isElite);
    
    /**
     * @return the calculated base move
     */
    public abstract int calculateBaseMove(int level, boolean isElite);

    /**
     * @return the calculated base range 
     */
    public abstract int calculateBaseRange(int level, boolean isElite);
    
    /**
     * @return the calculated base shield
     */
    public abstract int calculateBaseShield(int level, boolean isElite);
    
    /**
     * @return the calculated base retaliate
     */
    public abstract int calculateBaseRetaliate(int level, boolean isElite);
    
    /**
     * @return the calculated innate effects
     */
    public abstract List<Status> calculateInnateEffects(int level, boolean isElite);
}
