package com.gloomhaven.components.deck;

import com.gloomhaven.components.deck.AttackModifierCard.Builder;
import com.gloomhaven.constants.Element;
import com.gloomhaven.constants.Modifier;
import com.gloomhaven.constants.Status;

public class CharacterAction
{
    
    private CharacterAction(Builder builder)
    {
        
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    public static class Builder
    {
        private int attack;
        private int move;
        private int range;
        private int target;
        private Status status;
        private boolean isJump;
        private Element createElement;
        private Element consumeElement;
        private String text;
        
        public Builder() {};
        
        public Builder createElement(Element createElement)
        {
            this.createElement = createElement;
            return this;
        }
        
        public CharacterAction build()
        {
            return new CharacterAction(this);
        }
    }
}
