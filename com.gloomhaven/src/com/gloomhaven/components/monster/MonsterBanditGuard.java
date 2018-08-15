package com.gloomhaven.components.monster;

import java.util.List;

import com.gloomhaven.components.deck.MonsterActionCard;
import com.gloomhaven.components.deck.MonsterActionCardDeck;
import com.gloomhaven.components.monster.decks.MonsterActionCardBanditGuardDeck;
import com.gloomhaven.constants.Modifier;
import com.gloomhaven.constants.Status;

/**
 * <p>
 * TODO
 * </p>
 * <p>
 * Copyright &copy 2018 Cerner Corporation
 * </p>
 *
 * @author Wes Huhman
 */
public class MonsterBanditGuard extends AbstractMonster
{
    /**
     * Constructs a new {@link MonsterBanditGuard}.
     * @param Level
     * @param isElite
     */
    public MonsterBanditGuard(int Level, boolean isElite)
    {
        baseAttack = calculateBaseAttack(level, isElite);
        baseHealth = calculateBaseHealth(level, isElite);
        baseMove = calculateBaseMove(level, isElite);
        baseShield = calculateBaseShield(level, isElite);
        baseRange = calculateBaseRange(level, isElite);
        baseRetaliate = calculateBaseRetaliate(level, isElite);
        innateEffects = calculateInnateEffects(level, isElite);
    }
    
    @Override
    public int calculateBaseAttack(int level, boolean isElite)
    {
        switch(level)
        {
            case(0):
                return isElite == true ? 2 : 3;
            case(1):
                return isElite == true ? 2 : 3;
            case(2):
                return isElite == true ? 3 : 4;
            case(3):
                return isElite == true ? 3 : 4;
            case(4):
                return isElite == true ? 3 : 4;
            case(5):
                return isElite == true ? 4 : 5;
            case(6):
                return isElite == true ? 4 : 5;
            default:
                return isElite == true ? 4 : 5;
        }
    }

    @Override
    public int calculateBaseHealth(int level, boolean isElite)
    {
        switch(level)
        {
            case(0):
                return isElite == true ? 5 : 9;
            case(1):
                return isElite == true ? 6 : 9;
            case(2):
                return isElite == true ? 6 : 10;
            case(3):
                return isElite == true ? 9 : 10;
            case(4):
                return isElite == true ? 10 : 11;
            case(5):
                return isElite == true ? 11 : 12;
            case(6):
                return isElite == true ? 14 : 14;
            default:
                return isElite == true ? 16 : 14;
        }
    }

    @Override
    public int calculateBaseMove(int level, boolean isElite)
    {
        switch(level)
        {
            case(0):
                return isElite == true ? 2 : 2;
            case(1):
                return isElite == true ? 3 : 2;
            case(2):
                return isElite == true ? 3 : 2;
            case(3):
                return isElite == true ? 3 : 3;
            case(4):
                return isElite == true ? 4 : 3;
            case(5):
                return isElite == true ? 4 : 3;
            case(6):
                return isElite == true ? 4 : 4;
            default:
                return isElite == true ? 5 : 3;
        }
    }
    @Override
    public int calculateBaseShield(int level, boolean isElite)
    {
        switch(level)
        {
            case(0):
                return isElite == true ? 0 : 0;
            case(1):
                return isElite == true ? 0 : 1;
            case(2):
                return isElite == true ? 0 : 1;
            case(3):
                return isElite == true ? 0 : 2;
            case(4):
                return isElite == true ? 0 : 2;
            case(5):
                return isElite == true ? 0 : 2;
            case(6):
                return isElite == true ? 0 : 2;
            default:
                return isElite == true ? 0 : 3;
        }
    }
    
    @Override
    public int calculateBaseRange(int level, boolean isElite)
    {
        switch(level)
        {
            case(0):
                return isElite == true ? 0 : 0;
            case(1):
                return isElite == true ? 0 : 0;
            case(2):
                return isElite == true ? 0 : 0;
            case(3):
                return isElite == true ? 0 : 0;
            case(4):
                return isElite == true ? 0 : 0;
            case(5):
                return isElite == true ? 0 : 0;
            case(6):
                return isElite == true ? 0 : 0;
            default:
                return isElite == true ? 0 : 0;
        }
    }
    @Override
    public int calculateBaseRetaliate(int level, boolean isElite)
    {
        switch(level)
        {
            case(0):
                return isElite == true ? 0 : 0;
            case(1):
                return isElite == true ? 0 : 0;
            case(2):
                return isElite == true ? 0 : 0;
            case(3):
                return isElite == true ? 0 : 0;
            case(4):
                return isElite == true ? 0 : 0;
            case(5):
                return isElite == true ? 0 : 0;
            case(6):
                return isElite == true ? 0 : 0;
            default:
                return isElite == true ? 0 : 0;
        }
    }
    
    public List<Status> calculateInnateEffects(int level, boolean isElite)
    {
        if(level >= 4 && isElite)
                innateEffects.add(Status.MUDDLE);
        return innateEffects;
    }
    @Override
    public void takeDamage(int damage)
    {
        
    }
}
