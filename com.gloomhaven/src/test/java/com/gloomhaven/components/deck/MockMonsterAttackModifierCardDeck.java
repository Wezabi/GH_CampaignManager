package com.gloomhaven.components.deck;

import static com.gloomhaven.constants.DefaultDecks.MOCK_ATTACK_MOD_CARD_DECK;;

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
public class MockMonsterAttackModifierCardDeck extends MonsterAttackModifierCardDeck
{
    private static final MonsterAttackModifierCardDeck INSTANCE = new MockMonsterAttackModifierCardDeck();
    
    private MockMonsterAttackModifierCardDeck()
    {
        super("mock monster attack modifier deck", MOCK_ATTACK_MOD_CARD_DECK); //$NON-NLS-1$
    }
    
	public static MonsterAttackModifierCardDeck getInstance()
    {
        return INSTANCE;
    }

}
