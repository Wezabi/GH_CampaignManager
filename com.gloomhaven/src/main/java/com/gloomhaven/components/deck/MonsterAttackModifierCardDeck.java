package com.gloomhaven.components.deck;

import java.util.List;

/**
 * <p>
 * A {@link MonsterAttackModifierCardDeck} class.
 * </p>
 * <p>
 * Copyright &copy 2018
 * </p>
 *
 * @author Wes Huhman
 */
public abstract class MonsterAttackModifierCardDeck extends AttackModifierCardDeck
{
    protected MonsterAttackModifierCardDeck(String name, List<AttackModifierCard> cards)
    {
        super(name, cards); 
    }
}
