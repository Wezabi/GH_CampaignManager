package com.gloomhaven.campaign.scenario.monsters;

import java.util.ArrayList;
import java.util.List;

import com.gloomhaven.components.monster.AbstractMonsterGroup;

public abstract class MonsterParty
{
    protected List<AbstractMonsterGroup> monsters = new ArrayList<>();
    
    
    public MonsterParty(int scenarioNumber, int scenarioLevel, int playerCount) 
    {
        this.createMonsterParty(scenarioNumber, scenarioLevel, playerCount);
    }
    
    public List<AbstractMonsterGroup> getMonsters() {
        return monsters;
    }

    public abstract void createMonsterParty(int scenarioNumber, int scenarioLevel, int players);
}
