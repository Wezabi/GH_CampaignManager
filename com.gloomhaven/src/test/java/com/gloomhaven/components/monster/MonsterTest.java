package com.gloomhaven.components.monster;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.gloomhaven.components.mock.MockMonster;
import com.gloomhaven.constants.Modifier;

public class MonsterTest {

	private Monster monster = new MockMonster();
	
	@Test
	public void testGetID()
	{
		assertEquals(monster.getID(), 1);
	}
	
	@Test
	public void testGetName()
	{
		assertEquals(monster.getName(), "MOCK MONSTER");
	}
	
	@Test
	public void testGetCurrent()
	{
		assertEquals(monster.getCurrentHealth(), 5);
	}
	
	@Test
	public void testDamageDealt_ZeroModifier()
	{
		assertEquals(monster.dealDamage(new MonsterAction.Builder().attackMod(Modifier.ZERO).build()), 2);
	}
	
	@Test
	public void testDamageDealt_MinusOneModifier()
	{
		assertEquals(monster.dealDamage(new MonsterAction.Builder().attackMod(Modifier.MIN_1).build()), 1);
	}
	
	@Test
	public void testDamageDealt_PositiveOneModifier()
	{
		assertEquals(monster.dealDamage(new MonsterAction.Builder().attackMod(Modifier.POS_1).build()), 3);
	}
	
	@Test
	public void testTakeDamage_NonLethal()
	{
		assertEquals(monster.takeDamage(3), false);
		assertEquals(monster.getCurrentHealth(), 2);
	}
	
	@Test
	public void testTakeDamage_Lethal()
	{
		assertEquals(monster.takeDamage(5), true);
		assertEquals(monster.getCurrentHealth(), 0);
	}
}
