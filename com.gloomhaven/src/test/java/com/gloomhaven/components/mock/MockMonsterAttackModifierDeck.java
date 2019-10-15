package com.gloomhaven.components.mock;

import static com.gloomhaven.constants.DefaultDecks.MOCK_ATTACK_MOD_CARD_DECK;

import com.gloomhaven.components.deck.AttackModifierCardDeck;

public class MockMonsterAttackModifierDeck extends AttackModifierCardDeck {

    private static final MockMonsterAttackModifierDeck INSTANCE = new MockMonsterAttackModifierDeck();
    
    private MockMonsterAttackModifierDeck()
    {
        super("monster attack modifier deck", MOCK_ATTACK_MOD_CARD_DECK); //$NON-NLS-1$
    }
    
    public static MockMonsterAttackModifierDeck getInstance()
    {
        return INSTANCE;
    }
}
