package com.gloomhaven.components.deck;

import java.util.Collections;
import java.util.List;

/**
 * <p>
 * A {@link MonsterActionCardDeck} class.
 * </p>
 * <p>
 * Copyright &copy 2018
 * </p>
 *
 * @author Wes Huhman
 */
public class MonsterActionCardDeck extends AbstractDeck<MonsterActionCard>
{
    private MonsterActionCard activeCard;
    
    /**
     * Constructs a new {@link MonsterActionCardDeck}.
     * 
     * @param name
     *          the name of the deck's monster
     * @param cards
     *          the monster action cards to be added
     */
    public MonsterActionCardDeck(String name, List<MonsterActionCard> cards)
    {
        super(name, cards);
    }

    /**
     * Returns the active card.
     * 
     * @return the active card
     */
    public MonsterActionCard getActiveCard()
    {
        return activeCard;
    }
    
    @Override
    public MonsterActionCard draw()
    {
        activeCard  = activeDeck.pop();
        discardDeck.push(activeCard);
        if(activeCard.isShuffle() || activeDeck.isEmpty())
        {
        	addDiscardToActive();
        	shuffle();
        }
        return getActiveCard();
    }

	@Override
	public void shuffle() 
	{
		System.out.println(deckName + " is being shuffled."); 
        Collections.shuffle(activeDeck);
	}
}
