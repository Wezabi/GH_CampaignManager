package com.gloomhaven.components.deck;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;

import com.gloomhaven.components.monster.MonsterAction;

public class MonsterActionCardTest {
	private static final int INITIATIVE = 50;
	private static final boolean SHUFFLE = false;
	private static final List<MonsterAction> MONSTER_ACTIONS = Arrays.asList(new MonsterAction.Builder().build());
	private final MonsterActionCard monsterActionCard = new MonsterActionCard.Builder(INITIATIVE, MONSTER_ACTIONS)
			.isShuffle(SHUFFLE)
			.build();

	@Test(expected = IllegalArgumentException.class)
	public void testMonsterActionCard_negativeInitiative()
	{
		new MonsterActionCard.Builder(-9, MONSTER_ACTIONS);
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void testMonsterActionCard_nullMonsterActions()
	{
		new MonsterActionCard.Builder(9, null);
	}
	
	@Test
	public void testGetShuffle()
	{
		assertEquals(monsterActionCard.isShuffle(), SHUFFLE);
	}
	
	@Test
	public void testGetMonsterActions()
	{
		assertEquals(monsterActionCard.getMonsterActions(), MONSTER_ACTIONS);
	}
	
	@Test
	public void testGetInitiative()
	{
		assertEquals(monsterActionCard.getInitiative(), INITIATIVE);
	}
}
