package com.gloomhaven.components.monster;

import java.util.Hashtable;
import java.util.List;

import com.gloomhaven.components.deck.MonsterActionCard;
import com.gloomhaven.components.deck.MonsterActionCardDeck;
import com.gloomhaven.components.deck.MonsterAttackModifierDeck;
import com.gloomhaven.components.monster.stats.Stats;
import com.gloomhaven.constants.Modifier;
import com.gloomhaven.constants.Status;

public abstract class MonsterGroup<T extends Monster> {

   /**
    * List of statuses the monster has by default.
    */
   private List<Status> innateEffects = null; 
   
   /**
    * True if monster is flying.
    */
   private boolean isFlying = false;
   
   /**
    * True if retaliates at ranged.
    */
   private int retaliateRange = 1;
   
   /**
    * Monster's level.
    */
   private int level = 0;
   
   /**
    * Monster's name
    */
   public String name = ""; //$NON-NLS-1$
   
   private Stats stats;
   
   private Monster[] monsters;
   private int spawnMax;
   protected MonsterActionCard activeMonsterActionCard;
   private int spawnCurrent;
   
   public MonsterGroup(int spawnMax, String name, Hashtable<String, String> hashTable, int scenarioNumber, int scenarioLevel, int playerCount)
   {
       this.spawnMax = spawnMax;
       this.name = name;
       this.level = scenarioLevel;
       this.monsters = new Monster[spawnMax];
       decodeTableSpawns(calcTableSpawns(hashTable, scenarioNumber, playerCount));
   }
   
   /**
    * @return innate effects
    */
   public final List<Status> getInnateEffects()
   {
       return innateEffects;
   }
   
   /**
    * @return the monster name
    */
   public final String getName()
   {
       return name;
   }
   
   /**
    * @return the active monster action card
    */
   public final MonsterActionCard getActiveMonsterActionCard()
   {
	   return activeMonsterActionCard;
   }
   
   /**
    * Spawns a monster if there is maximum monster is not reached.
    * 
    * @param monster
    * 			the monster to be spawned
    */
   
   protected void spawnMonster(Monster monster)
   {
       if(monster == null)
    	   return;
       monsters[spawnCurrent++] = monster;
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
                   createMonster(0, false, spawnCurrent+1);
                   break;
               case 'A':
                   createMonster(0, true, spawnCurrent+1);
                   break;
               case 'b':
                   createMonster(1, false, spawnCurrent+1);
                   break;
               case 'B':
                   createMonster(1, true, spawnCurrent+1);
                   break;
               case 'c':
                   createMonster(2, false, spawnCurrent+1);
                   break;
               case 'C':
                   createMonster(2, true, spawnCurrent+1);
                   break;
               case 'd':
                   createMonster(3, false, spawnCurrent+1);
                   break;
               case 'D':
                   createMonster(3, true, spawnCurrent+1);
                   break;
               case 'e':
                   createMonster(4, false, spawnCurrent+1);
                   break;
               case 'E':
                   createMonster(4, true, spawnCurrent+1);
                   break;
               case 'f':
                   createMonster(5, false, spawnCurrent+1);
                   break;
               case 'F':
                   createMonster(5, true, spawnCurrent+1);
                   break;
               case 'g':
                   createMonster(6, false, spawnCurrent+1);
                   break;
               case 'G':
                   createMonster(6, true, spawnCurrent+1);
                   break;
               case 'h':
                   createMonster(7, false, spawnCurrent+1);
                   break;
               case 'H':
                   createMonster(7, true, spawnCurrent+1);
                   break;
               case 'i':
                   createMonster(8, false, spawnCurrent+1);
                   break;
               case 'I':
                   createMonster(8, true, spawnCurrent+1);
                   break;
               case 'j':
                   createMonster(9, false, spawnCurrent+1);
                   break;
               case 'J':
                   createMonster(9, true, spawnCurrent+1);
                   break;
           }
       }
   }
   abstract void createMonster(int level, boolean isElite, int id);
   
   public abstract void draw();
}
