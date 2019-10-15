package com.gloomhaven.components.monster.decks;

import com.gloomhaven.components.deck.MonsterActionCardDeck;

import static com.gloomhaven.constants.DefaultDecks.GUARD_ACTION_DECK;

/**
 * <p>
 * The singleton instance of a {@link MonsterActionCardBanditGuardDeck}.
 * </p>
 * <p>
 * Copyright &copy 2018
 * </p>
 *
 * @author Wes Huhman
 */
public class MonsterActionCardBanditGuardDeck extends MonsterActionCardDeck
{
    private static final MonsterActionCardBanditGuardDeck INSTANCE = new MonsterActionCardBanditGuardDeck();
    
    /**
     * Constructs a new {@link MonsterActionCardBanditGuardDeck}.
     */
    private MonsterActionCardBanditGuardDeck()
    {
        super("bandit action card deck", GUARD_ACTION_DECK);
    }

    /**
     * Returns the singleton instance of the {@link MonsterActionCardBanditGuardDeck}.
     * 
     * @return The singleton instance
     */
    public static MonsterActionCardBanditGuardDeck getInstance()
    {
        return INSTANCE;
    }
}
