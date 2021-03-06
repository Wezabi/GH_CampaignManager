package com.gloomhaven.components.monster.stats;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import com.gloomhaven.constants.Status;

/**
 * <p>
 * The stats for a {@code BanditGuard}.
 * </p>
 * <p>
 * Copyright &copy 2018
 * </p>
 *
 * @author Wes Huhman
 */
public class BanditGuardStats implements MonsterStats{

	public Stats calculateBaseStats(int level, boolean isElite) 
	{
		return new Stats.Builder(calculateBaseAttack(level, isElite), calculateBaseHealth(level, isElite))
				.baseMove(calculateBaseMove(level, isElite))
				.baseShield(calculateBaseShield(level, isElite))
				.innateEffects(calculateInnateEffects(level, isElite))
				.build();
	}
    
    private int calculateBaseAttack(int level, boolean isElite)
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

    private int calculateBaseHealth(int level, boolean isElite)
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

    private int calculateBaseMove(int level, boolean isElite)
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
    
    private int calculateBaseShield(int level, boolean isElite)
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
    
    private List<Status> calculateInnateEffects(int level, boolean isElite)
    {
        if(level >= 4 && isElite)
        	return Arrays.asList(Status.MUDDLE);
        return Collections.emptyList();
    }
}
