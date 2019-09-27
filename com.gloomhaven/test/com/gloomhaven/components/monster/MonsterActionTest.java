package com.gloomhaven.components.monster;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.gloomhaven.constants.Element;
import com.gloomhaven.constants.Modifier;
import com.gloomhaven.constants.Status;
import com.gloomhaven.constants.Target;

public class MonsterActionTest {

	MonsterAction.Builder monsterActionBuilder = new MonsterAction.Builder();
	
	@Test
	public void testIsJump()
	{
		assertEquals(monsterActionBuilder.isJump(true).build().isJump(), true);
	}
	
	@Test
	public void testConsumeElement()
	{
		assertEquals(monsterActionBuilder.consumeElement(Element.ANY).build().getConsumeElement(), Element.ANY);
	}
	
	@Test
	public void testCreateElement()
	{
		assertEquals(monsterActionBuilder.createElement(Element.ANY).build().getCreateElement(), Element.ANY);
	}
	
	@Test
	public void testAttackMod()
	{
		assertEquals(monsterActionBuilder.attackMod(Modifier.ZERO).build().getAttackMod(), Modifier.ZERO);
	}
	
	@Test
	public void testLootMod()
	{
		assertEquals(monsterActionBuilder.lootMod(Modifier.ZERO).build().getLootMod(), Modifier.ZERO);
	}
	
	@Test
	public void testMoveMod()
	{
		assertEquals(monsterActionBuilder.moveMod(Modifier.ZERO).build().getMoveMod(), Modifier.ZERO);
	}
	
	@Test
	public void testRangeMod()
	{
		assertEquals(monsterActionBuilder.rangeMod(Modifier.ZERO).build().getRangeMod(), Modifier.ZERO);
	}
	
	@Test
	public void testRetaliateMod()
	{
		assertEquals(monsterActionBuilder.retaliateMod(Modifier.ZERO).build().getRetaliateMod(), Modifier.ZERO);
	}
	
	@Test
	public void testShieldMod()
	{
		assertEquals(monsterActionBuilder.shieldMod(Modifier.ZERO).build().getShieldMod(), Modifier.ZERO);
	}
	
	@Test
	public void testStatus()
	{
		assertEquals(monsterActionBuilder.status(Status.BLESS).build().getStatus(), Status.BLESS);
	}
	
	@Test
	public void testTarget()
	{
		assertEquals(monsterActionBuilder.target(Target.ADJACENT_MELEE).build().getTarget(), Target.ADJACENT_MELEE);
	}
}
