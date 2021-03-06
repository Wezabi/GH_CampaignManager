package com.gloomhaven.components.monster;

import com.gloomhaven.components.monster.decks.MonsterActionCardBanditGuardDeck;

import static com.gloomhaven.constants.MonsterInitalization.MONSTER_INITILIZATION_BANDIT_GUARD_HASH_TABLE;
import static com.gloomhaven.constants.MonsterMax.GUARD_SPAWN_MAX;

public class BanditGuardGroup extends MonsterGroup<BanditGuard> {
	public BanditGuardGroup(int scenarioNumber, int scenarioLevel, int playerCount) {
		super(GUARD_SPAWN_MAX, "bandit guard", MONSTER_INITILIZATION_BANDIT_GUARD_HASH_TABLE, scenarioNumber,
				scenarioLevel, playerCount, MonsterActionCardBanditGuardDeck.getInstance());
	}

	@Override
	public void createMonster(int level, boolean isElite, int id) {
		spawnMonster(new BanditGuard(level, isElite, id));
	}
}
