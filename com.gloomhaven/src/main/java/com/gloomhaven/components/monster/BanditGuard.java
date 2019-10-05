package com.gloomhaven.components.monster;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import com.gloomhaven.components.deck.MonsterAttackModifierDeck;
import com.gloomhaven.components.monster.decks.MonsterActionCardBanditGuardDeck;
import com.gloomhaven.components.monster.stats.BanditGuardStats;
import com.gloomhaven.constants.Status;

/**
 * <p>
 * A bandit guard class
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
     * @param level
     * @param isElite
     */
    public BanditGuard(int level, boolean isElite, int id)
    {
    	super(new BanditGuardStats().calculateBaseStats(level, isElite), "Bandit Guard", isElite, id, MonsterAttackModifierDeck.getInstance());
    }
}
