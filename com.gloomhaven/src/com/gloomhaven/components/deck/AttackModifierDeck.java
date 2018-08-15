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
public class AttackModifierDeck extends AbstractDeck<AttackModifierCard>
{
    /**
     * Constructs a new {@link AttackModifierDeck}.
     * 
     * @param name
     *          the name of the deck
     * @param Cards
     *          the list of cards
     */
    public AttackModifierDeck(String name, List<AttackModifierCard> Cards)
    {
        super(name, Cards);
    }
    
    /**
     * @return the size of the active card pile
     */
    public int getActiveDeckSize()
    {
        return activeDeck.size();
    }
    
    @Override
    public AttackModifierCard draw()
    {
        if(activeDeck.isEmpty())
            shuffle();
        AttackModifierCard drawn = activeDeck.pop();
        discardDeck.push(drawn);
        if(drawn.isShuffle())
            shuffle();
        return drawn;
    }
}
