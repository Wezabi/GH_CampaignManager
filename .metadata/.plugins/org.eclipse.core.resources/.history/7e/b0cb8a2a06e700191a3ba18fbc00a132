package com.gloomhaven.components.monster;

import java.util.Hashtable;
import java.util.List;

import com.gloomhaven.components.deck.MonsterActionCard;
import com.gloomhaven.components.deck.MonsterActionCardDeck;
import com.gloomhaven.components.deck.MonsterAttackModifierDeck;
import com.gloomhaven.components.monster.decks.MonsterActionCardBanditGuardDeck;
import com.gloomhaven.components.monster.stats.Stats;
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
public abstract class Monster
{
	private int ID; //$NON-NLS-1$
	private String name; //$NON-NLS-1$
	protected Stats stats;
    private int currentHealth = 0;
    private boolean isElite = false;
    private List<Status> statuses = null; 
    
    /**
     * Monster's action card deck.
     */
    private MonsterActionCardDeck monsterActionCardDeck;
    
    /**
     * Monster's attack modifier deck.
     */
    private static MonsterAttackModifierDeck ATTACK_MODIFIER_DECK = MonsterAttackModifierDeck.getInstance();

    
    public Monster(MonsterActionCardDeck monsterActionCardDeck, Stats stats, String name, boolean isElite, int ID)
    {
    	this.monsterActionCardDeck = monsterActionCardDeck;
    	this.name = name;
    	this.ID = ID;
    	this.currentHealth = stats.getBaseHealth();
    	this.isElite = isElite;
    	this.stats = stats;
    }
    
    /**
     * @return the monster ID
     */
    public final int getID()
    {
    	return ID;
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
    	int shield = stats.getBaseShield();
    	// Add action shield
        int trueDamage = Math.max(0, damage-shield);
        currentHealth = currentHealth - trueDamage;
        System.out.print(name);
        if(shield>0)
            System.out.print("'s shield negates " + shield + " damage. " + name);
        System.out.println(" takes " + String.valueOf(trueDamage));
        if(currentHealth<1)
        	System.out.print(" and dies!");
    }
    
    /**
     * Calculates the damage dealt.
     * 
     * @return the calculated damage
     */
    public int dealDamage(MonsterAction monsterAction)
    {
        Modifier mod = ATTACK_MODIFIER_DECK.draw().getModifier();
        int modValue = mod.getValue();
        int baseAttack = stats.getBaseAttack();
        System.out.print(name + " deals base damage of " + String.valueOf(baseAttack + ", ")); //$NON-NLS-1$ //$NON-NLS-2$
        System.out.print(monsterAction.getAttackMod().getValue() + " from the monster ability card, and "); //$NON-NLS-1$
        switch(mod)
        {
            case X2:
                System.out.println(" draws a CRIT for " + String.valueOf(baseAttack*2 + monsterAction.getAttackMod().getValue()) + " total damage!"); //$NON-NLS-1$ //$NON-NLS-2$
                return baseAttack * 2 + monsterAction.getAttackMod().getValue();
            case MISS: 
                System.out.println(" draws a MISS for zero damage!"); //$NON-NLS-1$
                return 0;
            case NONE:
                System.out.println(" Error, monster deck shouldn't be drawing this ever."); //$NON-NLS-1$
                return 0;
            default:
                System.out.println(" draws a " + String.valueOf(modValue) + " for " + String.valueOf(baseAttack + modValue) + " total damage."); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
                return baseAttack + modValue + monsterAction.getAttackMod().getValue();
        }
    }
}
