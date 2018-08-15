package com.gloomhaven.run;

import java.io.IOException;

import javax.swing.JFrame;

import com.gloomhaven.campaign.CampaignManager;

@SuppressWarnings("nls")
public class Main 
{
    public static void main(String[] args) throws IOException
    {
        CampaignManager campaignManager = CampaignManager.getInstance();
        
        
    	campaignManager.getFrame().setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    	campaignManager.getFrame().setVisible(true);
    	campaignManager.getFrame().pack();
        campaignManager.runCampaignManagerMenu();
        
        
//        MonsterAttackModifierDeck deckMonster = MonsterAttackModifierDeck.getInstance();
//        AttackModifierCard attackModifierCard;
//        
//        for(int i = 0; i < 100; i++)
//        {
//            attackModifierCard = deckMonster.draw();
//            System.out.println("Draw number " + i + ": " + deckMonster.getName() + " drew a " + attackModifierCard.getValue() + " attack modifier.");
//            System.out.println("  The " + deckMonster.getName() + " has " + deckMonster.getActiveDeckSize() + " cards left to draw.");
//        }
//        Character playerOne = new Tinkerer(2,3);
//        Character playerTwo = new Brute(5,3);
//        Character playerThree = new Scoundrel(3,3);
//        Character playerFour = new Spellweaver(3,3);
//
//        CharacterParty characterParty = new CharacterParty.Builder(playerOne).addCharacter(playerTwo).addCharacter(playerThree).addCharacter(playerFour).build();
//        MonsterParty monsterParty = MonsterPartyFactory.getMonsterParty(1, characterParty.getMonsterLevel(), characterParty.getCharacters().size());
//        ScenarioRound roundTracker = new ScenarioRound(monsterParty, characterParty);
//        
//        while(roundTracker.getRound() < 10)
//        {
//            roundTracker.roundBegin();
//        }
//        System.out.println("The end");
    }
}