package com.gloomhaven.components.deck;

/**
 * <p>
 * A {@link CharacterActionCard} class.
 * </p>
 * <p>
 * Copyright &copy 2018
 * </p>
 *
 * @author Wes Huhman
 */
public class CharacterActionCard implements AbstractCard
{
    private CharacterAction top;
    private CharacterAction bottom;
    private int initiative;
    
    /**
     * Constructs a new {@link CharacterActionCard}.
     * 
     * @param top
     * 			the top action
     * @param bottom
     *			the bottom action
     * @param initiative
     * 			the initiative
     */ 
    public CharacterActionCard(CharacterAction top, CharacterAction bottom, int initiative)
    {
        this.top = top;
        this.bottom = bottom;
        this.initiative = initiative;
    }
    
    /**
     * Returns the initiative.
     * 
     * @return the initiative
     */
    public int getInitiative()
    {
        return initiative;
    }

	@Override
	public boolean isShuffle()
	{
		return false;
	}
}
