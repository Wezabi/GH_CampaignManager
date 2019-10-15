package com.gloomhaven.constants;

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