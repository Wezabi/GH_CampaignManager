package com.gloomhaven.components.deck;

import static com.gloomhaven.constants.DefaultDecks.DEFAULT_ATTACK_MOD_CARD_DECK;

/**
 * <p>
 * A {@link DefaultMonsterAttackModifierCardDeck} class.
 * </p>
 * <p>
 * Copyright &copy 2018
 * </p>
 *
 * @author Wes Huhman
 */
public class DefaultMonsterAttackModifierCardDeck extends MonsterAttackModifierCardDeck
{
    private static final MonsterAttackModifierCardDeck INSTANCE = new DefaultMonsterAttackModifierCardDeck();
    
    private DefaultMonsterAttackModifierCardDeck()
    {
        super("monster attack modifier deck", DEFAULT_ATTACK_MOD_CARD_DECK); //$NON-NLS-1$
    }
    
	public static MonsterAttackModifierCardDeck getInstance()
    {
        return INSTANCE;
    }

}
