package com.gloomhaven.campaign.scenario.monsters;

public class MonsterPartyFactory
{
    public static MonsterParty getMonsterParty(int scenarioNumber, int scenarioLevel, int playerCount)
    {
        switch(scenarioNumber)
        {
            case 1:
                return new MonsterParty1(scenarioNumber, scenarioLevel, playerCount);
            case 2:
                return new MonsterParty2(scenarioNumber, scenarioLevel, playerCount);
            default:
                return null;
        }
    }
}
