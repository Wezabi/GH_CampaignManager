package com.gloomhaven.components.deck;

import static com.gloomhaven.constants.DefaultDecks.DEFAULT_ATTACK_MOD_CARD_DECK;

/**
 * <p>
 * A {@link MonsterAttackModifierCardDeck} class.
 * </p>
 * <p>
 * Copyright &copy 2018
 * </p>
 *
 * @author Wes Huhman
 */
public class MonsterAttackModifierCardDeck extends AttackModifierCardDeck
{
    private static final MonsterAttackModifierCardDeck INSTANCE = new MonsterAttackModifierCardDeck();
    
    private MonsterAttackModifierCardDeck()
    {
        super("monster attack modifier deck", DEFAULT_ATTACK_MOD_CARD_DECK); //$NON-NLS-1$
    }
    
    /**
     * Returns the singleton instance of the {@link MonsterAttackModifierCardDeck}.
     * 
     * @return the singleton instance of the {@link MonsterAttackModifierCardDeck}
     */
    public static MonsterAttackModifierCardDeck getInstance()
    {
        return INSTANCE;
    }

}
