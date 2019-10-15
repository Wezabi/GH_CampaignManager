package com.gloomhaven.components.monster;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import com.gloomhaven.components.monster.decks.MonsterActionCardBanditGuardDeck;
import com.gloomhaven.components.monster.stats.BanditGuardStats;
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
public class BanditGuard extends Monster
{
	
    /**
     * Constructs a new {@link BanditGuard}.
     * @param level
     * @param isElite
     */
    public BanditGuard(int level, boolean isElite, int id)
    {
    	super(MonsterActionCardBanditGuardDeck.getInstance(), new BanditGuardStats().calculateBaseStats(level, isElite), "Bandit Guard", isElite, id);
    }
}
