package com.gloomhaven.components.monster;

import com.gloomhaven.components.deck.MonsterActionCard;
import com.gloomhaven.components.monster.decks.MonsterActionCardBanditGuardDeck;

import static com.gloomhaven.constants.MonsterInitalization.MONSTER_INITILIZATION_BANDIT_GUARD_HASH_TABLE;
import static com.gloomhaven.constants.MonsterMax.GUARD_SPAWN_MAX;

import java.util.Hashtable;


public class MonsterGroupBanditGuard extends AbstractMonsterGroup<MonsterBanditGuard>
{
    private static final MonsterActionCardBanditGuardDeck ACTION_CARD_DECK = MonsterActionCardBanditGuardDeck.getInstance();
    
    public MonsterGroupBanditGuard(int scenarioNumber, int scenarioLevel, int playerCount)
    {
        super(GUARD_SPAWN_MAX, "bandit guard", MONSTER_INITILIZATION_BANDIT_GUARD_HASH_TABLE, scenarioNumber, scenarioLevel, playerCount);
    }
    
    @Override
    public void createMonster(int number, boolean isElite)
    {
        spawnMonster(number, new MonsterBanditGuard(level, isElite));
    }
    
    @Override
    public void draw()
    {
        actionCard = ACTION_CARD_DECK.draw();
    }
}
