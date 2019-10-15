package com.gloomhaven.components.monster;

import com.gloomhaven.components.deck.MockMonsterAttackModifierCardDeck;
import com.gloomhaven.components.monster.stats.Stats;

public class MockMonster extends Monster {
	
	public MockMonster() {
		super(new Stats.Builder(2, 5).build(), "MOCK MONSTER", true, 1, MockMonsterAttackModifierCardDeck.getInstance());
	}

}
