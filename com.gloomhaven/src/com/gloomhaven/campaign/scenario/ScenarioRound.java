package com.gloomhaven.campaign.scenario;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Hashtable;
import java.util.Map;

import com.gloomhaven.components.monster.Monster;
import com.gloomhaven.components.monster.MonsterGroup;
import com.gloomhaven.components.monster.Monster;
import com.gloomhaven.campaign.scenario.characters.CharacterParty;
import com.gloomhaven.campaign.scenario.monsters.MonsterParty;
import com.gloomhaven.components.character.Character;

public class ScenarioRound
{
    private MonsterParty monsterParty;
    private CharacterParty characterParty;
    private ElementBoard elementBoard;
    private Hashtable<String, Integer> initiativeOrder = new Hashtable<String, Integer>();
    private int roundNumber = 1;
    
    public ScenarioRound(MonsterParty monsterParty, CharacterParty characterParty)
    {
        this.monsterParty = monsterParty;
        this.characterParty = characterParty;
        this.elementBoard = ElementBoard.getInstance();
    }
    
    public void roundBegin()
    {
        System.out.println("Round " + roundNumber + " begins.");
        elementBoard.roundPass();
        for(MonsterGroup<Monster> monsterGroup : monsterParty.getMonsters())
        {
            monsterGroup.draw();
        }
        setInitiativeOrder();
        displayTurns();
        
        //TODO: Round shit
        
        roundNumber++;
    }
    
    public int getRound()
    {
        return roundNumber;
    }
    
    private void setInitiativeOrder()
    {
        for(MonsterGroup<Monster> monsterGroup : monsterParty.getMonsters())
        {
            initiativeOrder.put(monsterGroup.getName(), monsterGroup.getActiveMonsterActionCard().getInitiative());
        }
        for(Character character : characterParty.getCharacters())
        {
            initiativeOrder.put(character.getCharacterClass(), (int )((Math.random()) * 100 + 1));
        }
    }
    
    private void displayTurns()
    {
        System.out.println("INITIATIVE ORDER FOR ROUND " + roundNumber);
        ArrayList<Map.Entry<String, Integer>> l = sortValue(initiativeOrder);
        for(Map.Entry<?, Integer> e : l)
        {
            System.out.println(e);
        }
        System.out.println();
    }
    public ArrayList sortValue(Hashtable<?, Integer> t)
    {

        //Transfer as List and sort it
        ArrayList<Map.Entry<?, Integer>> l = new ArrayList(t.entrySet());
        Collections.sort(l, new Comparator<Map.Entry<?, Integer>>()
        {
            public int compare(Map.Entry<?, Integer> o1, Map.Entry<?, Integer> o2) 
            {
                return o1.getValue().compareTo(o2.getValue());
            }
        });
        return l;
    }
}
