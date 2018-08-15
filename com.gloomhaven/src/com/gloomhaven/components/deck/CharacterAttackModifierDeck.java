package com.gloomhaven.components.deck;

import com.gloomhaven.constants.Modifier;

import static com.gloomhaven.constants.DefaultDecks.DEFAULT_ATTACK_MOD_CARD_DECK;

@SuppressWarnings("javadoc")
public class CharacterAttackModifierDeck extends AttackModifierDeck
{
    private AttackModifierDeck deck;
    
    public CharacterAttackModifierDeck(String character)
    {
        super(character + " attack modifier deck", DEFAULT_ATTACK_MOD_CARD_DECK);
    }
}
