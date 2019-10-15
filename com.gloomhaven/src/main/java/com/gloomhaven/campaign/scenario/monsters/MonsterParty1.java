package com.gloomhaven.campaign.scenario.monsters;

import java.util.ArrayList;
import java.util.List;

import com.gloomhaven.components.monster.BanditGuardGroup;
import com.gloomhaven.components.monster.MonsterGroup;

public class MonsterParty1 extends MonsterParty
{
    private List<MonsterGroup> monsters = new ArrayList<>();

    public MonsterParty1(int scenarioNumber, int scenarioLevel, int playerCount)
    {
        super(scenarioNumber, scenarioLevel, playerCount);
    }
    
    @Override
    public void createMonsterParty(int scenarioNumber, int scenarioLevel, int playerCount)
    {
//        monsters.add(new MonsterBanditArcherGroup(scenarioLevel, playerCount));
        monsters.add(new BanditGuardGroup(scenarioNumber, scenarioLevel, playerCount));
//        monsters.add(new MonsterLivingBonesGroup(scenarioLevel, playerCount));
    }

	@Override
	public List<MonsterGroup> getMonsters() {
		return monsters;
	}
}
