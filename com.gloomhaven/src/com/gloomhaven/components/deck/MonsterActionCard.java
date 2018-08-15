package com.gloomhaven.components.deck;

import com.gloomhaven.components.deck.MonsterActionCard.Builder;
import com.gloomhaven.constants.Element;
import com.gloomhaven.constants.Modifier;
import com.gloomhaven.constants.Status;
import com.gloomhaven.constants.Target;

@SuppressWarnings("javadoc")
public class MonsterActionCard
{
    private boolean isJump = false;
    private boolean isShuffle = false;
    private Element consumeElement = Element.NONE;
    private Element createElement = Element.NONE;
    private int initiative;
    private Modifier attackMod = Modifier.NONE;
    private Modifier lootMod = Modifier.NONE;
    private Modifier moveMod = Modifier.NONE;
    private Modifier rangeMod = Modifier.NONE;
    private Modifier retaliateMod = Modifier.NONE;
    private Modifier shieldMod = Modifier.NONE;
    private Status status = Status.NONE;
    private Target target = Target.SINGLE_MELEE;
    
    private MonsterActionCard(Builder builder)
    {
        this.attackMod = builder.attackMod;
        this.consumeElement = builder.consumeElement;
        this.createElement = builder.createElement;
        this.initiative = builder.initiative;
        this.isJump = builder.isJump;
        this.isShuffle = builder.isShuffle;
        this.lootMod = builder.lootMod;
        this.moveMod = builder.moveMod;
        this.rangeMod = builder.rangeMod;
        this.retaliateMod = builder.retaliateMod;
        this.shieldMod = builder.shieldMod;
        this.status = builder.status;
    }
    
    public int getAttackModValue()
    {
        return attackMod.getValue();
    }
    
    public String getAttackModName()
    {
        return attackMod.getName();
    }
    
    public String getConsuerElement()
    {
        return consumeElement.getName();
    }
    public String getCreateElement()
    {
        return createElement.getName();
    }
    
    public int getInitiative()
    {
        return initiative;
    }
    
    public Target getTarget()
    {
        return target;

    }
    public boolean isJump()
    {
        return isJump;
    }

    public boolean isShuffle()
    {
        return isShuffle;
    }
    
    public int getLootModValue()
    {
        return lootMod.getValue();
    }
    
    public int getMoveModValue()
    {
        return moveMod.getValue();
    }
    
    public int getShieldModValue()
    {
        return shieldMod.getValue();
    }

    public int getRangeModValue()
    {
        return rangeMod.getValue();
    }
    
    public int getRetaliateModValue()
    {
        return retaliateMod.getValue();
    }
    
    public String getStatus()
    {
        return status.getName();
    }
    
    public static class Builder
    {
        private boolean isJump;
        private boolean isShuffle;
        private Element consumeElement;
        private Element createElement;
        private int initiative;
        private Modifier attackMod;
        private Modifier lootMod;
        private Modifier moveMod;
        private Modifier rangeMod;
        private Modifier retaliateMod;
        private Modifier shieldMod;
        private Status status;
        private Target target;
        
        public Builder(int initiative)
        {
            this.initiative = initiative;
        }
        
        public Builder isJump(boolean isJump)
        {
            this.isJump = isJump;
            return this;
        }
        
        public Builder isShuffle(boolean isShuffle)
        {
            this.isShuffle = isShuffle;
            return this;
        }
        
        public Builder consumeElement(Element element)
        {
            this.consumeElement = element;
            return this;
        }
        
        public Builder createElement(Element element)
        {
            this.createElement = element;
            return this;
        }

        public Builder target (Target target)
        {
            this.target = target;
            return this;
        }
        public Builder attackMod(Modifier mod)
        {
            this.attackMod = mod;
            return this;
        }
        
        public Builder lootMod(Modifier mod)
        {
            this.attackMod = mod;
            return this;
        }
        public Builder moveMod(Modifier mod)
        {
            this.attackMod = mod;
            return this;
        }
        public Builder rangeMod(Modifier mod)
        {
            this.rangeMod = mod;
            return this;
        }
        public Builder retaliateMod(Modifier mod)
        {
            this.attackMod = mod;
            return this;
        }
        public Builder shieldMod(Modifier mod)
        {
            this.attackMod = mod;
            return this;
        }
        public Builder status(Status status)
        {
            this.status = status;
            return this;
        }
        
        public MonsterActionCard build()
        {
            return new MonsterActionCard(this);
        }
    }
}
