package com.gloomhaven.components.monster.decks;

import java.util.Arrays;
import java.util.List;

import com.gloomhaven.components.deck.MonsterActionCard;
import com.gloomhaven.components.deck.MonsterActionCardDeck;
import com.gloomhaven.constants.Modifier;
import com.gloomhaven.constants.Status;

import static com.gloomhaven.constants.DefaultDecks.GUARD_ACTION_DECK;
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
