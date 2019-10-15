package com.gloomhaven.components.deck;

import java.util.Collections;
import java.util.List;

/**
 * <p>
 * An {@link AttackModifierCardDeck} class.
 * </p>
 * <p>
 * Copyright &copy 2018
 * </p>
 *
 * @author Wes Huhman
 */
public class AttackModifierCardDeck extends AbstractDeck<AttackModifierCard>
{
    /**
     * Constructs a new {@link AttackModifierCardDeck}.
     * 
     * @param name
     *          the name of the deck
     * @param cards
     *          the list of cards
     */
    public AttackModifierCardDeck(String name, List<AttackModifierCard> cards)
    {
        super(name, cards);
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
        AttackModifierCard drawn = activeDeck.pop();
        discardDeck.push(drawn);
        if(activeDeck.isEmpty())
        {
        	addDiscardToActive();
        	shuffle();
        }
        return drawn;
    }

    @Override
	public void shuffle()
    {
    	System.out.println(deckName + " is being shuffled."); 
    	Collections.shuffle(activeDeck);
    }
}
