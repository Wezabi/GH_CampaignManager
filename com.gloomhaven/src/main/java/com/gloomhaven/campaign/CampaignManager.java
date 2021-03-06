package com.gloomhaven.campaign;

import java.awt.Component;
import java.awt.event.WindowEvent;
import java.io.BufferedReader;
import java.io.InputStreamReader;

import javax.swing.JFrame;

import com.gloomhaven.campaign.events.EventManager;

public class CampaignManager 
{
	private JFrame campaignFrame;
	private EventManager eventManager;
	private CampaignPanel campaignPanel;
	private int userInput = 0;
	
	private static CampaignManager INSTANCE;
	
	public static CampaignManager getInstance()
	{
		if(INSTANCE == null)
		{
		  	INSTANCE = new CampaignManager();
		}
		return INSTANCE;
	}
	
	private CampaignManager()
	{
		this.campaignFrame = new JFrame();
		this.eventManager = EventManager.getInstance();
		this.campaignPanel = new CampaignPanel();
		this.campaignFrame.add(this.campaignPanel);
        this.campaignPanel.setVisible(true);
	}
	
	public void runCampaignManagerMenu()
	{
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Welcome to Gloomhaven Simulator");
		System.out.println("|-------------------------------|");
		System.out.println("| Please choose how to proceed  |");
		System.out.println("|-------------------------------|");
		System.out.println("|  1  | Run Event Manager       |");
		System.out.println("|  2  | Run the standard sim    |");
		System.out.println("|  3  | Exit Gloomhaven Sim     |");
		System.out.println("|_______________________________|");
	    while(userInput < 2 || userInput > 2)
	    {
	    	switch(userInput)
	        {
	            case 1: 
	            	campaignFrame.remove(campaignPanel);
	            	eventManager.runEventManager();
	            	campaignFrame.add(campaignPanel);
	            	campaignPanel.setVisible(false);
	            	campaignPanel.setVisible(true);
	    	        userInput = -1;
	                break;
	            case 2:
	                System.out.println("Proceeding to standard run");
	    	        userInput = -1;
	                break;
	            case 3:
	            	campaignFrame.remove(campaignPanel);
	            	campaignFrame.dispatchEvent(new WindowEvent(campaignFrame, WindowEvent.WINDOW_CLOSING));
	    	        userInput = -1;
	                return;
	        };
	    }
    }
	
	public void setUserInput(int userInput)
	{
    	this.userInput = userInput;
    }
	
	public JFrame getFrame()
	{
		return campaignFrame;
	}
}
