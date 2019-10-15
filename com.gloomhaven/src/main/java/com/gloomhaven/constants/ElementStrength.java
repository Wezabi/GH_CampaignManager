package com.gloomhaven.constants;

/**
 * <p>
 * An enumerator for defining strength of {@code Element}.
 * </p>
 * <p>
 * Copyright &copy 2018
 * </p>
 *
 * @author Wes Huhman
 */
public enum ElementStrength
{
    INNERT ("Innert"),
    WANING ("Waning"),
    STRONG ("Strong");
    
    private final String name;
    ElementStrength(String name)
    {
        this.name = name;
    }
    
    public String getName()
    {
        return name;
    }
}