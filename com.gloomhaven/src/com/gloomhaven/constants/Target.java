package com.gloomhaven.constants;

public enum Target
{
    SINGLE_MELEE (1,1),
    CLEAVE_MELEE (1,2),
    SWEEP_MELEE (1,3),
    ADJACENT_MELEE (1,6),
    SPEAR_MELEE (2,2),
    SINGLE_RANGED_R1 (1,1),
    SINGLE_RANGED_R2 (2,1),
    SINGLE_RANGED_R3 (3,1),
    SINGLE_RANGED_R4 (4,1),
    SINGLE_RANGED_R5 (5,1),
    DOUBLE_RANGED_R1 (1,2),
    DOUBLE_RANGED_R2 (2,2),
    DOUBLE_RANGED_R3 (3,2),
    DOUBLE_RANGED_R4 (4,2),
    DOUBLE_RANGED_R5 (5,2),
    TRIPLE_RANGED_R1 (1,3),
    TRIPLE_RANGED_R2 (2,3),
    TRIPLE_RANGED_R3 (3,3),
    TRIPLE_RANGED_R4 (4,3),
    TRIPLE_RANGED_R5 (5,3),
    QUADRU_RANGED_R1 (1,4),
    QUADRU_RANGED_R2 (2,4),
    QUADRU_RANGED_R3 (3,4),
    QUADRU_RANGED_R4 (4,4),
    QUADRU_RANGED_R5 (5,4),
    ALL_RANGED_R2 (2,0),
    ALL_RANGED_R3 (3,0),
    ALL_RANGED_R4 (4,0),
    ALL_RANGED_R5 (5,0);
    
    private final int range;
    private final int targets;
    Target(int range, int targets)
    {
        this.range = range;
        this.targets = targets;
    }

    public int getRange()
    {
        return range;
    }
    
    public int getTargets()
    {
        return targets;
    }
}
