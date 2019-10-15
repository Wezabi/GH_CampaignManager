package com.gloomhaven.components.monster;

import com.gloomhaven.constants.Element;
import com.gloomhaven.constants.Modifier;
import com.gloomhaven.constants.Status;
import com.gloomhaven.constants.Target;

public class MonsterAction {
	
	private boolean isJump = false;
	private Element consumeElement = Element.NONE;
	private Element createElement = Element.NONE;
	private Modifier attackMod = Modifier.NONE;
	private Modifier lootMod = Modifier.NONE;
	private Modifier moveMod = Modifier.NONE;
	private Modifier rangeMod = Modifier.NONE;
	private Modifier retaliateMod = Modifier.NONE;
	private Modifier shieldMod = Modifier.NONE;
	private Status status = Status.NONE;
	private Target target = Target.SINGLE_MELEE;
    
	private MonsterAction(Builder builder)
	{
		isJump = builder.isJump;
		consumeElement = builder.consumeElement;
		createElement = builder.createElement;
        attackMod = builder.attackMod;
        lootMod = builder.lootMod;
        moveMod = builder.moveMod;
        rangeMod = builder.rangeMod;
        retaliateMod = builder.retaliateMod;
        shieldMod = builder.shieldMod;
        status = builder.status;
        target = builder.target;
	}
	 
	public Modifier getAttackMod()
	{
		return attackMod;
	}
    
    public Element getConsumeElement()
    {
    	return consumeElement;
    }
     
    public Element getCreateElement()
    {
        return createElement;
    }
     
    public boolean isJump()
    {
        return isJump;
    }
 
    public Modifier getLootMod()
    {
        return lootMod;
    }
    
    public Modifier getMoveMod()
    {
        return moveMod;
    }
     
    public Modifier getShieldMod()
    {
        return shieldMod;
    }
 
    public Modifier getRangeMod()
    {
        return rangeMod;
    }
     
    public Modifier getRetaliateMod()
    {
        return retaliateMod;
    }
    
    public Status getStatus()
    {
        return status;
    }
    
    public Target getTarget()
    {
    	return target;
    }
    
    public static class Builder
    {
    	private boolean isJump = false;
	   	private Element consumeElement = Element.NONE;
	   	private Element createElement = Element.NONE;
	   	private Modifier attackMod = Modifier.NONE;
	   	private Modifier lootMod = Modifier.NONE;
	   	private Modifier moveMod = Modifier.NONE;
	   	private Modifier rangeMod = Modifier.NONE;
	   	private Modifier retaliateMod = Modifier.NONE;
	   	private Modifier shieldMod = Modifier.NONE;
	   	private Status status = Status.NONE;
	   	private Target target = Target.SINGLE_MELEE;
        
        public Builder isJump(boolean isJump)
        {
            this.isJump = isJump;
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

        public Builder attackMod(Modifier mod)
        {
            this.attackMod = mod;
            return this;
        }
        
        public Builder lootMod(Modifier mod)
        {
            this.lootMod = mod;
            return this;
        }
        
        public Builder moveMod(Modifier mod)
        {
            this.moveMod = mod;
            return this;
        }
        
        public Builder rangeMod(Modifier mod)
        {
            this.rangeMod = mod;
            return this;
        }
        
        public Builder retaliateMod(Modifier mod)
        {
            this.retaliateMod = mod;
            return this;
        }
        
        public Builder shieldMod(Modifier mod)
        {
            this.shieldMod = mod;
            return this;
        }
        
        public Builder status(Status status)
        {
            this.status = status;
            return this;
        }
        
        public Builder target(Target target)
        {
        	this.target = target;
        	return this;
        }
        
        public MonsterAction build()
        {
            return new MonsterAction(this);
        }
    }
}
