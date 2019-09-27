package com.gloomhaven.components.deck;

import static com.gloomhaven.constants.DefaultDecks.DEFAULT_ATTACK_MOD_CARD_DECK;

@SuppressWarnings("javadoc")
public class CharacterAttackModifierDeck extends AttackModifierCardDeck
{
    public CharacterAttackModifierDeck(String character)
    {
        super(character + " attack modifier deck", DEFAULT_ATTACK_MOD_CARD_DECK);
    }
}
