package com.gloomhaven.components.monster;

import java.util.ArrayList;
import java.util.Hashtable;

import com.gloomhaven.components.deck.MonsterActionCard;
import com.gloomhaven.components.deck.MonsterActionCardDeck;
import com.gloomhaven.components.deck.MonsterAttackModifierDeck;

public abstract class AbstractMonsterGroup<T extends AbstractMonster>
{
    private String name;
    private AbstractMonster[] monsterList;
    private int spawnMax;
    protected MonsterActionCard actionCard;
    private int spawnCurrent;
    protected int level;
    
    public AbstractMonsterGroup(int spawnMax, String name, Hashtable<String, String> hashTable, int scenarioNumber, int scenarioLevel, int playerCount)
    {
        this.spawnMax = spawnMax;
        this.name = name;
        this.level = scenarioLevel;
        monsterList = new AbstractMonster[spawnMax];
        decodeTableSpawns(calcTableSpawns(hashTable, scenarioNumber, playerCount));
    }
    
    public AbstractMonster getMonsterAt(int target)
    {
        return monsterList[target];
    }
    
    public abstract void draw();
    
    public MonsterActionCard getActionCard()
    {
        return actionCard;
    }
    
    public String getName()
    {
        return name;
    }
    
    protected void spawnMonster(int number, T monster)
    {
        if(monster == null)
            System.out.println("ERROR: This method should be overriden");
        monsterList[number] = monster;
        return;
    }
    
    private String calcTableSpawns(Hashtable<String, String> hashTable, int scenarioNumber, int playerCount)
    {
        return hashTable.get(String.valueOf(scenarioNumber + "_" + playerCount));
    }
    
    private void decodeTableSpawns(String spawnCode)
    {
        for(int i=0; i<spawnCode.length(); i++)
        {
            switch(spawnCode.charAt(i))
            {
                case 'a':
                    createMonster(0, false);
                    break;
                case 'A':
                    createMonster(0, true);
                    break;
                case 'b':
                    createMonster(1, false);
                    break;
                case 'B':
                    createMonster(1, true);
                    break;
                case 'c':
                    createMonster(2, false);
                    break;
                case 'C':
                    createMonster(2, true);
                    break;
                case 'd':
                    createMonster(3, false);
                    break;
                case 'D':
                    createMonster(3, true);
                    break;
                case 'e':
                    createMonster(4, false);
                    break;
                case 'E':
                    createMonster(4, true);
                    break;
                case 'f':
                    createMonster(5, false);
                    break;
                case 'F':
                    createMonster(5, true);
                    break;
                case 'g':
                    createMonster(6, false);
                    break;
                case 'G':
                    createMonster(6, true);
                    break;
                case 'h':
                    createMonster(7, false);
                    break;
                case 'H':
                    createMonster(7, true);
                    break;
                case 'i':
                    createMonster(8, false);
                    break;
                case 'I':
                    createMonster(8, true);
                    break;
                case 'j':
                    createMonster(9, false);
                    break;
                case 'J':
                    createMonster(9, true);
                    break;
            }
        }
    }
    abstract void createMonster(int number, boolean isElite);
}
