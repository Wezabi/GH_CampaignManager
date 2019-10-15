package com.gloomhaven.components.mock;

import static com.gloomhaven.constants.DefaultDecks.MOCK_MONSTER_ACTION_CARD_DECK;
import static com.gloomhaven.constants.MonsterInitalization.MONSTER_INITILIZATION_BANDIT_GUARD_HASH_TABLE;

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
