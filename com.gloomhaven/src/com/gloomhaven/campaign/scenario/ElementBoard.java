package com.gloomhaven.campaign.scenario;

import java.util.ArrayList;
import java.util.List;

import com.gloomhaven.constants.Element;
import com.gloomhaven.constants.ElementStrength;

public class ElementBoard
{
    private static final ElementBoard INSTANCE = new ElementBoard();
    private ElementStrength board[] = new ElementStrength[6];
    
    private ElementBoard() 
    {
        for(int i = 0; i<6; i++)
        {
            board[i] = ElementStrength.INNERT;
        }
    };
    
    public static ElementBoard getInstance()
    {
        return INSTANCE;
    }
    
    public void roundPass()
    {
        for(int i = 0; i<6; i++)
        {
            if(board[i].equals(ElementStrength.STRONG))
                board[i] = ElementStrength.WANING;
            else if(board[i].equals(ElementStrength.WANING))
                board[i] = ElementStrength.INNERT;
        }
        return;
    }
    
    public void setElement(Element element)
    {
        switch(element.getName())
        {
            case("Fire"):
                board[0] = ElementStrength.STRONG;
                return;
            case("Ice"):
                board[1] = ElementStrength.STRONG;
                return;
            case("Earth"):
                board[2] = ElementStrength.STRONG;
                return;
            case("Wind"):
                board[3] = ElementStrength.STRONG;
                return;
            case("Light"):
                board[4] = ElementStrength.STRONG;
                return;
            case("Dark"):
                board[5] = ElementStrength.STRONG;
                return;
            default:
                System.out.println("Yeah this element value of NONE of ANY is a TODO");
                return;
        }
    }
    
    public boolean isElementEatable(Element element)
    {
        switch(element.getName())
        {
            case("Fire"):
                return board[0].getName() != "Innert" ? true : false;
            case("Ice"):
                return board[1].getName() != "Innert" ? true : false;
            case("Earth"):
                return board[2].getName() != "Innert" ? true : false;
            case("Wind"):
                return board[3].getName() != "Innert" ? true : false;
            case("Light"):
                return board[4].getName() != "Innert" ? true : false;
            case("Dark"):
                return board[5].getName() != "Innert" ? true : false;
            default:
               System.out.println("Nothing is edible");
               return false;
        }
    }
    
    public void eatElement(Element element)
    {
        switch(element.getName())
        {
            case("Fire"):
                board[0] = ElementStrength.INNERT;
                return;
            case("Ice"):
                board[1] = ElementStrength.INNERT;
                return;
            case("Earth"):
                board[2] = ElementStrength.INNERT;
                return;
            case("Wind"):
                board[3] = ElementStrength.INNERT;
                return;
            case("Light"):
                board[4] = ElementStrength.INNERT;
                return;
            case("Dark"):
                board[5] = ElementStrength.INNERT;
                return;
            default:
                System.out.println("Yeah this element value of NONE of ANY is a TODO");
                return;
        }
    }
}
