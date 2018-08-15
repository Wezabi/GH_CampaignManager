package com.gloomhaven.campaign.scenario.monsters;

import com.gloomhaven.components.monster.MonsterGroupBanditGuard;;

public class MonsterParty1 extends MonsterParty
{
    public MonsterParty1(int scenarioNumber, int scenarioLevel, int playerCount)
    {
        super(scenarioNumber, scenarioLevel, playerCount);
    }
    
    @Override
    public void createMonsterParty(int scenarioNumber, int scenarioLevel, int playerCount)
    {
//        monsters.add(new MonsterBanditArcherGroup(scenarioLevel, playerCount));
        monsters.add(new MonsterGroupBanditGuard(scenarioNumber, scenarioLevel, playerCount));
//        monsters.add(new MonsterLivingBonesGroup(scenarioLevel, playerCount));
    }
}
