package com.gloomhaven.components.monster;

import com.gloomhaven.components.monster.decks.MonsterActionCardBanditGuardDeck;

import static com.gloomhaven.constants.MonsterInitalization.MONSTER_INITILIZATION_BANDIT_GUARD_HASH_TABLE;
import static com.gloomhaven.constants.MonsterMax.GUARD_SPAWN_MAX;

/**
 * <p>
 * A bandit guard group class.
 * </p>
 * <p>
 * Copyright &copy 2018
 * </p>
 *
 * @author Wes Huhman
 */
public class BanditGuardGroup extends MonsterGroup<BanditGuard>
{
    private static final MonsterActionCardBanditGuardDeck ACTION_CARD_DECK = MonsterActionCardBanditGuardDeck.getInstance();
    
    /**
     * Constructs a new {@link BanditGuardGroup}.
     * 
     * @param scenarioNumber
     * 			the scenario number
     * @param scenarioLevel
     *			the scenario level
     * @param playerCount
     *			the number of players
     */ 
    public BanditGuardGroup(int scenarioNumber, int scenarioLevel, int playerCount)
    {
        super(GUARD_SPAWN_MAX, "bandit guard", MONSTER_INITILIZATION_BANDIT_GUARD_HASH_TABLE, scenarioNumber, scenarioLevel, playerCount);
    }
    
    @Override
    public void createMonster(int level, boolean isElite, int id)
    {
        spawnMonster(new BanditGuard(level, isElite, id));
    }
    
    @Override
    public void draw()
    {
    	activeMonsterActionCard = ACTION_CARD_DECK.draw();
    }
}
