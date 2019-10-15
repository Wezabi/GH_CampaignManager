package com.gloomhaven.components.deck;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.gloomhaven.constants.Element;
import com.gloomhaven.constants.Modifier;
import com.gloomhaven.constants.Status;

public class AttackModifierCardTest {
	
	private static final boolean REMOVED = false;
	private static final boolean ROLLING = false;
	private static final boolean SHUFFLE = false;
	private static final Element ELEMENT = Element.ANY;
	private static final Modifier MODIFER = Modifier.ZERO;
	private static final Status STATUS = Status.DISARM;
	private final AttackModifierCard attackModifierCard = new AttackModifierCard.Builder(MODIFER)
			.isRemoved(REMOVED)
			.isRolling(ROLLING)
			.isShuffle(SHUFFLE)
			.createElement(ELEMENT)
			.status(STATUS)
			.build();

	@Test(expected = IllegalArgumentException.class)
	public void testAttackModifierCard_nullModifier()
	{
		new AttackModifierCard.Builder(null);
	}
	
	@Test
	public void testGetRemoved()
	{
		assertEquals(attackModifierCard.isRemoved(), REMOVED);
	}
	
	@Test
	public void testGetRolling()
	{
		assertEquals(attackModifierCard.isRolling(), ROLLING);
	}
	
	@Test
	public void testGetShuffle()
	{
		assertEquals(attackModifierCard.isShuffle(), SHUFFLE);
	}
	
	@Test
		public void testGetModifier()
		{
			assertEquals(attackModifierCard.getModifier(), MODIFER);
		}
	
	@Test
	public void testGetCreateElement()
	{
		assertEquals(attackModifierCard.getCreateElement(), ELEMENT);
	}
	
	@Test
	public void testGetStatus()
	{
		assertEquals(attackModifierCard.getStatus(), STATUS);
	}
}
