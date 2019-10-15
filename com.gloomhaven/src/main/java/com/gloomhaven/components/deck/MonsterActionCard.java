package com.gloomhaven.components.deck;

import static com.gloomhaven.utilities.ArgumentChecker.rejectIfNonPositive;
import static com.gloomhaven.utilities.ArgumentChecker.rejectIfNull;

import java.util.List;

import com.gloomhaven.components.monster.MonsterAction;

/**
 * <p>
 * A {@link MonsterActionCard} class.
 * </p>
 * <p>
 * Copyright &copy 2018
 * </p>
 *
 * @author Wes Huhman
 */
public class MonsterActionCard implements AbstractCard
{
    private boolean isShuffle = false;
    private int initiative;
    private List<MonsterAction> monsterActions;
    
    private MonsterActionCard(Builder builder)
    {
        initiative = builder.initiative;
        isShuffle = builder.isShuffle;
        monsterActions = builder.monsterActions;
    }
    
    public int getInitiative()
    {
        return initiative;
    }
    
    @Override
	public boolean isShuffle()
    {
        return isShuffle;
    }

    public List<MonsterAction> getMonsterActions()
    {
    	return monsterActions;
    }
    
    public static class Builder
    {
        private boolean isShuffle;
        private int initiative;
        private List<MonsterAction> monsterActions;
        
        public Builder(int initiative, List<MonsterAction> monsterActions)
        {
            this.initiative = rejectIfNonPositive(initiative, "initiative");
            this.monsterActions = rejectIfNull(monsterActions, "monsterActions");
        }
        
        public Builder isShuffle(boolean isShuffle)
        {
            this.isShuffle = isShuffle;
            return this;
        }
        
        public MonsterActionCard build()
        {
            return new MonsterActionCard(this);
        }
    }
}
