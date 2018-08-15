package com.gloomhaven.components.deck;

import java.util.Collections;
import java.util.List;
import java.util.Stack;

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
public class MonsterActionCardDeck extends AbstractDeck<MonsterActionCard>
{
    private MonsterActionCard activeCard;
    
    /**
     * Constructs a new {@link MonsterActionCardDeck}.
     * @param name
     *          the name of the deck's monster
     * @param Cards
     *          the monster action cards to be added
     */
    public MonsterActionCardDeck(String name, List<MonsterActionCard> Cards)
    {
        super(name, Cards);
    }

    /**
     * @return the active card
     */
    public MonsterActionCard getActiveCard()
    {
        return activeCard;
    }
    
    @Override
    public MonsterActionCard draw()
    {
        if(activeDeck.isEmpty())
            shuffle();
        MonsterActionCard drawn = activeDeck.pop();
        discardDeck.push(drawn);
        if(drawn.isShuffle())
            shuffle();
        return drawn;
    }
}
