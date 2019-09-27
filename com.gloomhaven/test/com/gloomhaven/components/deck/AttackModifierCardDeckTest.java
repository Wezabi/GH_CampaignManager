package com.gloomhaven.components.deck;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertSame;

import org.junit.Test;

import com.gloomhaven.constants.Modifier;

public class AttackModifierCardDeckTest {
	
	private static final String DECK_NAME = "DECK_NAME";

	@Test
	public void testAttackModifierDeck()
	{
		assertEquals(new AttackModifierCardDeck(DECK_NAME, null).getName(), DECK_NAME);
	}
	
	@Test
	public void testGetActiveDeckSize()
	{
		List<AttackModifierCard> attackModifierCards = Arrays.asList(createAttackModifierCard(Modifier.ZERO), createAttackModifierCard(Modifier.ZERO), createAttackModifierCard(Modifier.ZERO));
		AttackModifierCardDeck attackModifierDeck = new AttackModifierCardDeck(DECK_NAME, attackModifierCards);

		assertEquals(attackModifierDeck.getActiveDeckSize(), attackModifierCards.size());
	}
	
	@Test
	public void testDraw()
	{
		AttackModifierCard actualAttackModifierCard = createAttackModifierCard(Modifier.ZERO);
		List<AttackModifierCard> attackModifierCards = Arrays.asList(actualAttackModifierCard);
		AttackModifierCardDeck attackModifierDeck = new AttackModifierCardDeck(DECK_NAME, attackModifierCards);

		assertSame(attackModifierDeck.draw(), actualAttackModifierCard);
	}
	
	@Test
	public void testDraw_EmptyActive()
	{
		List<AttackModifierCard> attackModifierCards = Arrays.asList(createAttackModifierCard(Modifier.ZERO), createAttackModifierCard(Modifier.MIN_1), createAttackModifierCard(Modifier.POS_1));
		AttackModifierCardDeck attackModifierDeck = new AttackModifierCardDeck(DECK_NAME, attackModifierCards);
		attackModifierDeck.draw();
		attackModifierDeck.draw();
		attackModifierDeck.draw();
		assertEquals(attackModifierDeck.getActiveDeckSize(), 3);
	}
	
	private static AttackModifierCard createAttackModifierCard(Modifier mod)
	{
		return new AttackModifierCard.Builder(mod).build();
	}
}
