package com.gloomhaven.components.mock;

import com.gloomhaven.components.monster.Monster;
import com.gloomhaven.components.monster.stats.Stats;

public class MockMonster extends Monster {
	
	public MockMonster() {
		super(new Stats.Builder(2, 5).build(), "MOCK MONSTER", true, 1, MockMonsterAttackModifierDeck.getInstance());
	}

}
