package com.gloomhaven.components.character;

import com.gloomhaven.components.deck.CharacterActionCard;
import com.gloomhaven.components.deck.CharacterActionCardDeck;
import com.gloomhaven.components.deck.CharacterAttackModifierDeck;
import com.gloomhaven.components.item.Item;

import java.util.Collection;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("javadoc")
public abstract class Character
{
    private int checkmarks;
    private int experience;
    private int gold;
    private int level;
    private int perksUnlocked;
    private int personalQuest;
    private String characterClass;
    private ArrayList<Boolean> perksChosen;
    private Collection<Item> itemInventory;
    private CharacterAttackModifierDeck modifierDeck;
    private List<CharacterActionCard> actionCard;
    private List<CharacterActionCard> actionPool;
    private CharacterActionCardDeck actionDeck;
    private Pair<CharacterActionCard> actionPair;
    private CharacterActionCard activeActionCardSecond;
    
    //TODO: Deck Hero attacks
    
    public Character(int level, int personalQuest, String characterClass)
    {
        this.level = level;
        this.personalQuest = personalQuest;
        this.gold = level*15;
        this.experience = calcExp(level);
        this.characterClass = characterClass;
    }
    
    
    
    final public int calcExp(int level)
    {
        if(level > 1)
        {
            return(calcExp(level-1) + ((level-1)*5) + 45);
        }
            return 45;
    }
    
    final public int getLevel()
    {
        return level;
    }
    
    final public String getCharacterClass()
    {
        return characterClass;
    }
    
    final public Pair<CharacterActionCard> getActionPair()
    {
        return actionPair;
    }
    
    final public void setActionPair(CharacterActionCard first, CharacterActionCard second)
    {
        actionPair.setFirst(first);
        actionPair.setSecond(second);
    }
    
    final public int getInitiative()
    {
        return getActionPair().getFirst().getInitiative();
    }
    final public void revealRoom()
    {
        //TODO: Map get instance of room
    }
}
