package com.gloomhaven.components.deck;

import static com.gloomhaven.utilities.ArgumentChecker.rejectIfNull;

import com.gloomhaven.constants.Element;
import com.gloomhaven.constants.Modifier;
import com.gloomhaven.constants.Status;

/**
 * <p>
 * A builder pattern for a {@link AttackModifierCard} class.
 * </p>
 * <p>
 * Copyright &copy 2018
 * </p>
 *
 * @author Wes Huhman
 */
public class AttackModifierCard implements AbstractCard
{
    private boolean isRemoved = false;
    private boolean isRolling = false;
    private boolean isShuffle = false;
    private Element createElement = Element.NONE;
    private Modifier modifier;
    private Status status = Status.NONE;
    
    private AttackModifierCard(Builder builder)
    {
        this.createElement = builder.createElement;
        this.isShuffle = builder.isShuffle;
        this.isRolling = builder.isRolling;
        this.isRemoved = builder.isRemoved;
        this.status = builder.status;
        this.modifier = builder.modifier;
    }
    
    public Modifier getModifier()
    {
        return modifier;
    }
    
    public Element getCreateElement()
    {
        return createElement;
    }
    
    public Status getStatus()
    {
        return status;
    }
    
    @Override
	public boolean isShuffle()
    {
        return isShuffle;
    }
    
    public boolean isRolling()
    {
        return isRolling;
    }
    
    public boolean isRemoved()
    {
        return isRemoved;
    }
    
    public static class Builder
    {
        private boolean isRemoved;
        private boolean isRolling;
        private boolean isShuffle;
        private Element createElement;
        private Modifier modifier;
        private Status status;
        
        public Builder(Modifier value)
        {
            this.modifier = rejectIfNull(value, "value");
        }
        
        public Builder createElement(Element createElement)
        {
            this.createElement = createElement;
            return this;
        }
        
        public Builder status(Status status)
        {
            this.status = status;
            return this;
        }
        
        public Builder isShuffle(boolean isShuffle)
        {
            this.isShuffle = isShuffle;
            return this;
        }
        
        public Builder isRolling(boolean isRolling)
        {
            this.isRolling = isRolling;
            return this;
        }
        
        public Builder isRemoved(boolean isRemoved)
        {
            this.isRemoved = isRemoved;
            return this;
        }
        
        public AttackModifierCard build()
        {
            return new AttackModifierCard(this);
        }
    }
}
