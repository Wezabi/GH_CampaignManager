package com.gloomhaven.campaign.scenario.monsters;

import java.util.ArrayList;
import java.util.List;

import com.gloomhaven.components.monster.MonsterGroup;

public abstract class MonsterParty
{
    public MonsterParty(int scenarioNumber, int scenarioLevel, int playerCount) 
    {
        this.createMonsterParty(scenarioNumber, scenarioLevel, playerCount);
    }
    
    public abstract List<MonsterGroup> getMonsters();

    public abstract void createMonsterParty(int scenarioNumber, int scenarioLevel, int players);
}
