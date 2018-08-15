package com.gloomhaven.constants;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.gloomhaven.components.deck.AttackModifierCard;
import com.gloomhaven.components.deck.MonsterActionCard;

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
    public static final List<AttackModifierCard> DEFAULT_ATTACK_MOD_CARD_DECK = new ArrayList<AttackModifierCard>()
        {
            {
                add(new AttackModifierCard.Builder(Modifier.MISS).isShuffle(true).build());
                add(new AttackModifierCard.Builder(Modifier.X2).isShuffle(true).build());
                add(new AttackModifierCard.Builder(Modifier.MIN_2).build());
                add(new AttackModifierCard.Builder(Modifier.MIN_1).build());
                add(new AttackModifierCard.Builder(Modifier.MIN_1).build());
                add(new AttackModifierCard.Builder(Modifier.MIN_1).build());
                add(new AttackModifierCard.Builder(Modifier.MIN_1).build());
                add(new AttackModifierCard.Builder(Modifier.MIN_1).build());
                add(new AttackModifierCard.Builder(Modifier.ZERO).build());
                add(new AttackModifierCard.Builder(Modifier.ZERO).build());
                add(new AttackModifierCard.Builder(Modifier.ZERO).build());
                add(new AttackModifierCard.Builder(Modifier.ZERO).build());
                add(new AttackModifierCard.Builder(Modifier.ZERO).build());
                add(new AttackModifierCard.Builder(Modifier.ZERO).build());
                add(new AttackModifierCard.Builder(Modifier.POS_1).build());
                add(new AttackModifierCard.Builder(Modifier.POS_1).build());
                add(new AttackModifierCard.Builder(Modifier.POS_1).build());
                add(new AttackModifierCard.Builder(Modifier.POS_1).build());
                add(new AttackModifierCard.Builder(Modifier.POS_1).build());
                add(new AttackModifierCard.Builder(Modifier.POS_2).build());
            }
        };
        
    public static final List<MonsterActionCard> GUARD_ACTION_DECK = new ArrayList<MonsterActionCard>() 
    {
        {
            add(new MonsterActionCard.Builder(15).shieldMod(Modifier.POS_1).retaliateMod(Modifier.POS_2).isShuffle(true).build());
            add(new MonsterActionCard.Builder(15).shieldMod(Modifier.POS_1).attackMod(Modifier.ZERO).status(Status.POISON).isShuffle(true).build());
            add(new MonsterActionCard.Builder(30).moveMod(Modifier.POS_1).attackMod(Modifier.MIN_1).build());
            add(new MonsterActionCard.Builder(35).moveMod(Modifier.MIN_1).attackMod(Modifier.ZERO).rangeMod(Modifier.POS_2).build());
            add(new MonsterActionCard.Builder(50).moveMod(Modifier.ZERO).attackMod(Modifier.ZERO).build());
            add(new MonsterActionCard.Builder(50).moveMod(Modifier.ZERO).attackMod(Modifier.ZERO).build());
            add(new MonsterActionCard.Builder(55).moveMod(Modifier.MIN_1).attackMod(Modifier.ZERO).status(Status.STRENGTHEN_SELF).build());
            add(new MonsterActionCard.Builder(70).moveMod(Modifier.MIN_1).attackMod(Modifier.POS_1).build());
        }
    };
}