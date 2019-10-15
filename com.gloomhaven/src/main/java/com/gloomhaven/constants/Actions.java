package com.gloomhaven.constants;

import java.util.Arrays;
import java.util.List;

import com.gloomhaven.components.monster.MonsterAction;

/**
 * <p>
 * A compilation of common {@link Actions}.
 * </p>
 * <p>
 * Copyright &copy 2018
 * </p>
 *
 * @author Wes Huhman
 */
public class Actions {
	
	public static final List<MonsterAction> DEFAULT_ATTACK = Arrays.asList(new MonsterAction.Builder().moveMod(Modifier.ZERO).build(), new MonsterAction.Builder().attackMod(Modifier.ZERO).build());
	public static final List<MonsterAction> INCREASED_ATTACK = Arrays.asList(new MonsterAction.Builder().moveMod(Modifier.MIN_1).build(), new MonsterAction.Builder().attackMod(Modifier.POS_1).build());
	public static final List<MonsterAction> INCREASED_MOVE = Arrays.asList(new MonsterAction.Builder().moveMod(Modifier.POS_1).build(), new MonsterAction.Builder().attackMod(Modifier.MIN_1).build());

}
