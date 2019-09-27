package com.gloomhaven.campaign.scenario.monsters;

import java.util.ArrayList;
import java.util.List;

import com.gloomhaven.components.monster.MonsterGroup;;

public class MonsterParty2 extends MonsterParty
{
    private List<MonsterGroup> monsters = new ArrayList<>();

    public MonsterParty2(int scenarioNumber, int scenarioLevel, int playerCount)
    {
        super(scenarioNumber, scenarioLevel, playerCount);
    }
    
    @Override
    public void createMonsterParty(int scenarioNumber, int scenarioLevel, int players)
    {
        // TODO: Scenario two monsters
    }

	@Override
	public List<MonsterGroup> getMonsters() 
	{
		return monsters;
	}
}
