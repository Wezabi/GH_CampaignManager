package com.gloomhaven.constants;

import java.util.Arrays;
import java.util.List;

import com.gloomhaven.components.deck.AttackModifierCard;
import com.gloomhaven.components.deck.MonsterActionCard;
import com.gloomhaven.components.monster.MonsterAction;
/**
 * <p>
 * TODO
 * </p>
 * <p>
 * Copyright &copy 2018 Cerner Corporation
 * </p>
 *
 * @author Wes Huhman
 */
@SuppressWarnings("javadoc")
public final class DefaultDecks
{
    public static final List<AttackModifierCard> DEFAULT_ATTACK_MOD_CARD_DECK = Arrays.asList(
        new AttackModifierCard.Builder(Modifier.MISS).isShuffle(true).build(),
        new AttackModifierCard.Builder(Modifier.X2).isShuffle(true).build(),
        new AttackModifierCard.Builder(Modifier.MIN_2).build(),
        new AttackModifierCard.Builder(Modifier.MIN_1).build(),
        new AttackModifierCard.Builder(Modifier.MIN_1).build(),
        new AttackModifierCard.Builder(Modifier.MIN_1).build(),
        new AttackModifierCard.Builder(Modifier.MIN_1).build(),
        new AttackModifierCard.Builder(Modifier.MIN_1).build(),
        new AttackModifierCard.Builder(Modifier.ZERO).build(),
        new AttackModifierCard.Builder(Modifier.ZERO).build(),
        new AttackModifierCard.Builder(Modifier.ZERO).build(),
        new AttackModifierCard.Builder(Modifier.ZERO).build(),
        new AttackModifierCard.Builder(Modifier.ZERO).build(),
        new AttackModifierCard.Builder(Modifier.ZERO).build(),
        new AttackModifierCard.Builder(Modifier.POS_1).build(),
        new AttackModifierCard.Builder(Modifier.POS_1).build(),
        new AttackModifierCard.Builder(Modifier.POS_1).build(),
        new AttackModifierCard.Builder(Modifier.POS_1).build(),
        new AttackModifierCard.Builder(Modifier.POS_1).build(),
        new AttackModifierCard.Builder(Modifier.POS_2).build()
	);
    
    public static final List<AttackModifierCard> MOCK_ATTACK_MOD_CARD_DECK = Arrays.asList(
            new AttackModifierCard.Builder(Modifier.ZERO).build(),
            new AttackModifierCard.Builder(Modifier.ZERO).build(),
            new AttackModifierCard.Builder(Modifier.ZERO).build(),
            new AttackModifierCard.Builder(Modifier.ZERO).build(),
            new AttackModifierCard.Builder(Modifier.ZERO).build(),
            new AttackModifierCard.Builder(Modifier.ZERO).build()
    	);
        
    public static final List<MonsterActionCard> GUARD_ACTION_DECK = Arrays.asList(
		new MonsterActionCard.Builder(15, Arrays.asList(
				new MonsterAction.Builder().shieldMod(Modifier.POS_1).build(),
				new MonsterAction.Builder().attackMod(Modifier.ZERO).status(Status.POISON).build()))
		.isShuffle(true)
		.build(),
		new MonsterActionCard.Builder(15, Arrays.asList(
				new MonsterAction.Builder().shieldMod(Modifier.POS_1).build(),
				new MonsterAction.Builder().retaliateMod(Modifier.POS_2).build()))
		.isShuffle(true)
		.build(),
		new MonsterActionCard.Builder(30, Actions.INCREASED_MOVE).build(),
		new MonsterActionCard.Builder(35, Arrays.asList(
				new MonsterAction.Builder().moveMod(Modifier.MIN_1).build(),
				new MonsterAction.Builder().attackMod(Modifier.ZERO).rangeMod(Modifier.POS_2).build()))
		.build(),
		new MonsterActionCard.Builder(50, Actions.DEFAULT_ATTACK).build(),
		new MonsterActionCard.Builder(50, Actions.DEFAULT_ATTACK).build(),
		new MonsterActionCard.Builder(55, Arrays.asList(
				new MonsterAction.Builder().moveMod(Modifier.MIN_1).build(),
				new MonsterAction.Builder().attackMod(Modifier.ZERO).build(),
				new MonsterAction.Builder().status(Status.STRENGTHEN_SELF).build()))
		.build(),
		new MonsterActionCard.Builder(70, Actions.INCREASED_ATTACK).build()
	);
    
    public static final List<MonsterActionCard> MOCK_MONSTER_ACTION_CARD_DECK = Arrays.asList(
    		new MonsterActionCard.Builder(50, Actions.DEFAULT_ATTACK).build()
    	);
}