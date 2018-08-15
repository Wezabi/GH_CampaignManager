package com.gloomhaven.constants;

public enum Element
{
    NONE (0, "None"),
    FIRE (1, "Fire"),
    ICE (2, "Ice"),
    EARTH(3, "Earth"),
    WIND(4, "Wind"),
    LIGHT (5, "Light"),
    DARK (6, "Dark"),
    ANY (7, "Any");
    
    private final int value;
    private final String name;
    Element(int value, String name)
    {
        this.name = name;
        this.value = value;
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
