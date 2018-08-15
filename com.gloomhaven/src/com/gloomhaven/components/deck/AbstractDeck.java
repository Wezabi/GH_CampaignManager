package com.gloomhaven.components.deck;

import java.util.Collections;
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
 * @param <T> 
 */
public abstract class AbstractDeck<T>
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
     * @param Cards
     *          the list of cards initialized to active deck
     */
    public AbstractDeck(String name, List<T> Cards)
    {
        this.deckName = name;
        this.activeDeck = new Stack<T>();
        this.discardDeck = new Stack<T>();
        if(Cards != null)
        {
            this.addCards(Cards);
            Collections.shuffle(this.activeDeck);
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
    final public void addCard(T card)
    {
        this.activeDeck.push(card);
        return;
    }
    /**
     * Adds the list of AttackModifierCards to the deck.  Shuffles.
     * 
     * @param cardList
     *          The list of cards to be added
     */
    final public void addCards(List<T> cardList)
    {
        for(T card : cardList)
        {
            addCard(card);
        }
        return;
    }
    /**
     * Draw a card from the active deck.
     * 
     * @return the card drawn
     */
    public T draw()
    {
        if(activeDeck.isEmpty())
            shuffle();
        T drawn = activeDeck.pop();
        discardDeck.push(drawn);
        return drawn;
    }
    
    /**
     * Pushes discard to active and shuffles.
     */
    final public void shuffle()
    {
        System.out.println(deckName + " is being shuffled."); 
        while(!(discardDeck.isEmpty()))
        {
            activeDeck.push(discardDeck.pop());
        }
        Collections.shuffle(activeDeck);
        return;
    }
}
