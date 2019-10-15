package com.gloomhaven.components.monster;

import java.util.List;

import com.gloomhaven.components.deck.AttackModifierCardDeck;
import com.gloomhaven.components.deck.MonsterAttackModifierCardDeck;
import com.gloomhaven.components.monster.stats.Stats;
import com.gloomhaven.constants.Modifier;
import com.gloomhaven.constants.Status;

/**
 * <p>
 * An abstract Monster class.
 * </p>
 * <p>
 * Copyright &copy 2018
 * </p>
 *
 * @author Wes Huhman
 */
public abstract class Monster
{
	private int ID; 
	private String name; 
	private Stats stats;
    private int currentHealth = 0;
    private boolean isElite = false;
    private List<Status> statuses = null; 
    private AttackModifierCardDeck monsterAttackModifierDeck; 

    /**
     * Constructs a new {@link Monster}.
     * 
     * @param stats
     *			the monster's stats
     * @param name
     *			the monster's name
     * @param isElite
     *			{@code true} if the monster is elite, otherwise {@code false}
     * @param ID
     * 			the monster's ID
     * @param monsterAttackModifierDeck
     *          the monster attack modifier deck
     */ 
    public Monster(Stats stats, String name, boolean isElite, int ID, MonsterAttackModifierCardDeck monsterAttackModifierDeck)
    {
    	this.name = name;
    	this.ID = ID;
    	this.isElite = isElite;
    	this.stats = stats;
    	this.currentHealth = stats.getBaseHealth();
    	this.monsterAttackModifierDeck = monsterAttackModifierDeck;
    }
    
    /**
     * Returns the monster ID.
     * 
     * @return the monster ID
     */
    public final int getID()
    {
    	return ID;
    }
    
    /**
     * Returns the monster name.
     * 
     * @return the monster name
     */
    public final String getName()
    {
        return name;
    }
    
    /**
     * @return the monster's current health
     */
    public final int getCurrentHealth()
    {
    	return currentHealth;
    }
    
	/**
     * Decreases the monster health by {@code damage}. 
     */
    public boolean takeDamage(int damage)
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
        {
        	System.out.print(" and dies!");
        	return true;
        }
        return false;
    }
    
    /**
     * Calculates the damage and statuses dealt.
     * 
     * @return the calculated damage
     */
    public int dealDamage(MonsterAction monsterAction)
    {
    	//TODO: Status check on monsterAction
    	//TODO: Check monsterAction has a valid attackmod
        Modifier mod = monsterAttackModifierDeck.draw().getModifier();
        int modValue = mod.getValue();
        int baseAttack = stats.getBaseAttack();
        String attackModString = monsterAction.getAttackMod().getName();
        int attackModValue = monsterAction.getAttackMod().getValue();
        System.out.print(name + " deals base damage of " + String.valueOf(baseAttack ) + ", "); //$NON-NLS-1$ //$NON-NLS-2$
		System.out.print(attackModString + " from the monster ability card, and "); //$NON-NLS-1$
		switch(mod)
        {
            case X2:
                System.out.println(" draws a CRIT for " + String.valueOf(baseAttack*2 + attackModValue) + " total damage!"); //$NON-NLS-1$ //$NON-NLS-2$
                return baseAttack * 2 + attackModValue;
            case MISS: 
                System.out.println(" draws a MISS for zero damage!"); //$NON-NLS-1$
                return 0;
            case NONE:
                System.out.println(" Error, monster deck shouldn't be drawing this ever."); //$NON-NLS-1$
                return 0;
            default:
                System.out.println(" draws a " + String.valueOf(modValue) + " for " + String.valueOf(baseAttack + modValue + attackModValue) + " total damage."); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
                return baseAttack + modValue + attackModValue;
        }
    }
}
