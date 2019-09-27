package com.gloomhaven.components.deck;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertNotNull;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;

import com.gloomhaven.components.monster.MonsterAction;

public class MonsterActionCardDeckTest {

	private static final String DECK_NAME = "DECK_NAME";
	private static final int INITIATIVE = 10;

	@Test
	public void testMonsterActionCardDeck()
	{
		assertEquals(new MonsterActionCardDeck(DECK_NAME, null).getName(), DECK_NAME);
	}
	
	@Test
	public void testGetActiveCard()
	{
		List<MonsterActionCard> monsterActionCards = Arrays.asList(createActionlessMonsterActionCard(INITIATIVE));
		MonsterActionCardDeck monsterActionCardDeck = new MonsterActionCardDeck(DECK_NAME, monsterActionCards);

		assertEquals(monsterActionCardDeck.getActiveCard(), monsterActionCards);
	}
	
	@Test
	public void testDraw()
	{
		MonsterActionCard actualMonsterActionCard = createActionlessMonsterActionCard(INITIATIVE);
		List<MonsterActionCard> monsterActionCards = Arrays.asList(actualMonsterActionCard);
		MonsterActionCardDeck monsterActionCardDeck = new MonsterActionCardDeck(DECK_NAME, monsterActionCards);
		
		assertSame(monsterActionCardDeck.draw(), actualMonsterActionCard);
	}
	
	@Test
	public void testDraw_EmptyActive()
	{
		List<MonsterActionCard> monsterActionCards = Arrays.asList(createActionlessMonsterActionCard(INITIATIVE), createActionlessMonsterActionCard(INITIATIVE), createActionlessMonsterActionCard(INITIATIVE));
		MonsterActionCardDeck monsterActionCardDeck = new MonsterActionCardDeck(DECK_NAME, monsterActionCards);
		monsterActionCardDeck.draw();
		monsterActionCardDeck.draw();
		monsterActionCardDeck.draw();
		assertNotNull(monsterActionCardDeck.getActiveCard());
	}
	
	private static MonsterActionCard createActionlessMonsterActionCard(int initiative)
	{
		return new MonsterActionCard.Builder(initiative, Arrays.asList(new MonsterAction.Builder().build())).build();
	}
}
