package com.gloomhaven.components.monster;

import com.gloomhaven.components.deck.DefaultMonsterAttackModifierCardDeck;
import com.gloomhaven.components.monster.stats.BanditGuardStats;

/**
 * <p>
 * A bandit guard class.
 * </p>
 * <p>
 * Copyright &copy 2018
 * </p>
 *
 * @author Wes Huhman
 */
public class BanditGuard extends Monster
{
    /**
     * Constructs a new {@link BanditGuard}.
     * 
     * @param level
     * 			the level of the monster
     * @param isElite
     *			{@code true} if the monster is elite, otherwise {@code false}
     */ 
    public BanditGuard(int level, boolean isElite, int id)
    {
    	super(new BanditGuardStats().calculateBaseStats(level, isElite), "Bandit Guard", isElite, id, DefaultMonsterAttackModifierCardDeck.getInstance());
    }
}
