package com.gloomhaven.components.deck;

import java.util.Stack;
import java.util.List;

/**
 * <p>
 * A deck of cards.
 * </p>
 * <p>
 * Gloomhaven
 * </p>
 *
 * @author Wes Huhman
 */
public abstract class AbstractDeck<T extends AbstractCard>
{
    protected String deckName;
    protected Stack<T> activeDeck;
    protected Stack<T> discardDeck;
    
    AbstractDeck(String name)
    {
        this(name, null);
    }
    
    /**
     * Constructs a new {@link AbstractDeck}.
     * @param name
     *          the name of the deck
     * @param cards
     *          the list of cards initialized to active deck
     */
    public AbstractDeck(String name, List<T> cards)
    {
        this.deckName = name;
        this.activeDeck = new Stack<>();
        this.discardDeck = new Stack<>();
        if(cards != null)
        {
            this.addCards(cards);
        }
    }
    
    /**
     * Returns the deck name.
     * 
     * @return the deck name
     */
    public String getName()
    {
        return deckName;
    }
    
    /**
     * Adds an AttackModifierCard to the deck.  Shuffles.
     * 
     * @param card
     *          The card to be added
     */
    public void addCard(T card)
    {
        this.activeDeck.push(card);
    }
    
    /**
     * Adds the list of AttackModifierCards to the deck.  Shuffles.
     * 
     * @param cardList
     *          The list of cards to be added
     */
    public void addCards(List<T> cardList)
    {
        for(T card : cardList)
        {
            addCard(card);
        }
    }
    
    /**
     * Pushes discard to active.
     */
    public void addDiscardToActive()
    {
    	while(!(discardDeck.isEmpty()))
    	{
    		activeDeck.push(discardDeck.pop());
    	}		
    }
    
    /**
     * Draw a card from the active deck.
     * 
     * @return the card drawn
     */
    abstract AbstractCard draw();

    
    /**
     * Shuffles the active deck.
     */
    abstract void shuffle();
}
