package com.gloomhaven.components.deck;

import static com.gloomhaven.constants.DefaultDecks.MOCK_MONSTER_ACTION_CARD_DECK;

import com.gloomhaven.components.deck.MonsterActionCardDeck;

public class MockMonsterActionCardDeck extends MonsterActionCardDeck {
	
    private static final MockMonsterActionCardDeck INSTANCE = new MockMonsterActionCardDeck();
    
    /**
     * Constructs a new {@link MockMonsterActionCardDeck}.
     */
    private MockMonsterActionCardDeck()
    {
        super("mock monster action card deck", MOCK_MONSTER_ACTION_CARD_DECK);
    }

    /**
     * Returns the singleton instance of the {@link MockMonsterActionCardDeck}.
     * 
     * @return The singleton instance
     */
    public static MockMonsterActionCardDeck getInstance()
    {
        return INSTANCE;
    }
}
