package com.gloomhaven.campaign.scenario.characters;

import java.util.List;
import java.util.ArrayList;

import com.gloomhaven.components.character.Character;
import com.gloomhaven.components.deck.AttackModifierCard;

public class CharacterParty
{
    private List<Character> characters = new ArrayList<>();
    private String name = "heroes";
    private int partyReputation = 0;
    //TODO: private List<PartyAchievments> partyAchievments = new ArrayList<>();
    
    private CharacterParty(Builder builder)
    {
        this.characters = builder.characters;
        this.name = builder.name;
        this.partyReputation = builder.partyReputation;
    }
    
    public List<Character> getCharacters()
    {
        return characters;
    }
    
    public String getName()
    {
        return name;
    }
    
    public int getPartyReputation()
    {
        return partyReputation;
    }
    
    public int getMonsterLevel()
    {
        int i = 0;
        for(Character character : characters)
        {
            i += character.getLevel();
        }
        return (i / (2 * characters.size()));
    }
    
    public static class Builder
    {
        private List<Character> characters = new ArrayList<>();
        private String name;
        private int partyReputation;
        //TODO: private List<PartyAchievments> party Achievements;
        
        public Builder(Character character)
        {
            this.characters.add(character);
        }
        
        public Builder name(String name)
        {
            this.name = name;
            return this;
        }
        
        public Builder addCharacter(Character character)
        {
            this.characters.add(character);
            return this;
        }
        
        public Builder partyReputation(int partyReputation)
        {
            this.partyReputation = partyReputation;
            return this;
        }
        
        public CharacterParty build()
        {
            return new CharacterParty(this);
        }
    }
}
