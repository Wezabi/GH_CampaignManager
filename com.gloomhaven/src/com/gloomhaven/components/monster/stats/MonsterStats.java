package com.gloomhaven.components.monster.stats;

public interface MonsterStats {
	
	Stats calculateBaseStats(int level, boolean isElite);
}
