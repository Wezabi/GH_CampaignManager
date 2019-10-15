package com.gloomhaven.constants;

/**
 * <p>
 * An enumerator for defining a {@code Modifier}.
 * </p>
 * <p>
 * Copyright &copy 2018
 * </p>
 *
 * @author Wes Huhman
 */
public enum Modifier
{
    MIN_2 (-2, "subtracts two"),
    MIN_1 (-1, "subtracts one"),
    ZERO (0, "adds zero"),
    POS_1(1, "adds one"),
    POS_2(2, "adds two"),
    POS_3 (3, "adds three"),
    X2 (-3, "adds critial"),
    MISS (-4, "misses all"),
    NONE (-5, "has no modifier");
    
    private final int value;
    private final String name;
    Modifier(int value, String name)
    {
        this.value = value;
        this.name = name;
    }
    
    public boolean isNone()
    {
        return value == -5 ? true : false;
    }
    public int getValue()
    {
        return value;
    }
    public String getName()
    {
        return name;
    }
}