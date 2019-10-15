package com.gloomhaven.components.monster.stats;

/**
 * <p>
 * An interface for {@code MonsterState}.
 * </p>
 * <p>
 * Copyright &copy 2018
 * </p>
 *
 * @author Wes Huhman
 */
public interface MonsterStats {
	
	/**
	 * Calculates the base stats of a monster.
	 * 
	 * @param level
	 * 		the level of the monster
	 * @param isElite
	 * 		{@code true} if the monster is elite, otherwise {@code false}
	 * @return the {@code Stats} of the monster
	 */
	Stats calculateBaseStats(int level, boolean isElite);
}
