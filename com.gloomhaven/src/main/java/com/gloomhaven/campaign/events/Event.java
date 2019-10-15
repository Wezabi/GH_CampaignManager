package com.gloomhaven.campaign.events;

import java.awt.Image;

public class Event
{
    private int eventNumber;
    private Image picture = null;
    
    public Event(int eventNumber)
    {
        this.eventNumber = eventNumber;
    }
    
    public int getEventNumber()
    {
        return eventNumber;
    }
}
