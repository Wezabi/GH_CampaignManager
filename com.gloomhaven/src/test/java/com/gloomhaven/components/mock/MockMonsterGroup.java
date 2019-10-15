package com.gloomhaven.components.mock;

import com.gloomhaven.components.monster.MonsterGroup;
import static com.gloomhaven.constants.MonsterInitalization.MOCK_MONSTER_INITILIZATION_BANDIT_GUARD_HASH_TABLE;

public class MockMonsterGroup extends MonsterGroup<MockMonster> {
	
	public MockMonsterGroup(int scenarioNumber, int scenarioLevel, int playerCount) {
		super(6, "bandit guard", MOCK_MONSTER_INITILIZATION_BANDIT_GUARD_HASH_TABLE, scenarioNumber,
				scenarioLevel, playerCount, MockMonsterActionCardDeck.getInstance());
	}

	public void createMonster(int level, boolean isElite, int id) 
	{
	
	}
}
