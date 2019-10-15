package com.gloomhaven.constants;

/**
 * <p>
 * An enumerator for defining a {@code Status}.
 * </p>
 * <p>
 * Copyright &copy 2018
 * </p>
 *
 * @author Wes Huhman
 */
public enum Status
{
    NONE(0, "None", false),
    DISARM(1, "Disarm", false),
    IMMOBILIZE(2, "Immobilize", false),
    STUN(3, "Stun", false),
    POISON(4, "Poison", false),
    WOUND(5, "Wound", false),
    MUDDLE(6, "Muddle", false),
    STRENGTHEN(7, "Strengthen", false),
    CURSE(8, "Curse", false),
    BLESS(9, "Bless", false),
    INVISIBLE(10, "Invisible", false),
    
    DISARM_SELF(1, "Disarm", true),
    IMMOBILIZE_SELF(2, "Immobilize", true),
    STUN_SELF(3, "Stun", true),
    POISON_SELF(4, "Poison", true),
    WOUND_SELF(5, "Wound", true),
    MUDDLE_SELF(6, "Muddle", true),
    STRENGTHEN_SELF(7, "Strengthen", true),
    CURSE_SELF(8, "Curse", true),
    BLESS_SELF(9, "Bless", true),
    INVISIBLE_SELF(10, "Invisible", true);
    
    private final int value;
    private final String name;
    private final boolean isSelf;
    Status(int value, String name, boolean isSelf)
    {
        this.value = value;
        this.name = name;
        this.isSelf = isSelf;
    }
    
    public int getValue()
    {
        return value;
    }
    
    public String getName()
    {
        return name;
    }
    
    public boolean isSelf()
    {
        return isSelf;
    }
}
