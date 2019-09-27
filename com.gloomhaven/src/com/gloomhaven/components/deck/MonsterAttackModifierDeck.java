package com.gloomhaven.components.deck;

import static com.gloomhaven.constants.DefaultDecks.DEFAULT_ATTACK_MOD_CARD_DECK;

@SuppressWarnings("javadoc")
public class MonsterAttackModifierDeck extends AttackModifierCardDeck
{
    private static final MonsterAttackModifierDeck INSTANCE = new MonsterAttackModifierDeck();
    
    private MonsterAttackModifierDeck()
    {
        super("monster attack modifier deck", DEFAULT_ATTACK_MOD_CARD_DECK); //$NON-NLS-1$
    }
    
    public static MonsterAttackModifierDeck getInstance()
    {
        return INSTANCE;
    }

}
