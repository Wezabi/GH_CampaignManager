package com.gloomhaven.components.deck;

public class CharacterActionCard implements AbstractCard
{
    private CharacterAction top;
    private CharacterAction bottom;
    private int initiative;
    
    public CharacterActionCard(CharacterAction top, CharacterAction bottom, int initiative)
    {
        this.top = top;
        this.bottom = bottom;
        this.initiative = initiative;
    }
    
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
