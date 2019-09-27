package com.gloomhaven.campaign.events;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

import com.gloomhaven.campaign.CampaignManager;

public class EventManagerPanel extends JPanel implements ActionListener
{
    private Image img;
    private int w;
    private int h;
    private static final Dimension CAMPAIGN_PANEL_DIMENSION = new Dimension(200, 600);
    private static final Dimension CAMPAIGN_BUTTON_SIZE_PREFFERED = new Dimension(200, 50);
    private static final Dimension CAMPAIGN_BUTTON_SIZE_MIN = new Dimension(50, 25);
    private static final Dimension CAMPAIGN_BUTTON_SIZE_MAX = new Dimension(200, 100);
    private JPanel buttonPane = new JPanel();
    private JPanel eventPane = new JPanel();
    private JButton drawCityEventButton = new JButton("Draw a City Event");
    private JButton drawRoadEventButton = new JButton("Draw a Road Event");
    private JButton addCityEventButton = new JButton("Add a City Event");
    private JButton addRoadEventButton = new JButton("Add a Road Event");
    private JButton shuffleCityEventsButton = new JButton("Shuffle City Events");
    private JButton shuffleRoadEventsButton = new JButton("Shuffle Road Events");
    private JButton reinitializeDecksButton = new JButton("Reinitialize Events");
    private JButton saveButton = new JButton("Save Event Manager");
    private JButton exitButton = new JButton("Exit Event Manager");
    
    public EventManagerPanel()
    {
    	this.setLayout(new BoxLayout(this, BoxLayout.PAGE_AXIS));
    	this.setPreferredSize(CAMPAIGN_PANEL_DIMENSION);
    	this.formatButtons();
    	buttonPane.add(drawCityEventButton);
    	buttonPane.add(drawRoadEventButton);
    	buttonPane.add(addCityEventButton);
    	buttonPane.add(addRoadEventButton);
    	buttonPane.add(shuffleCityEventsButton);
    	buttonPane.add(shuffleRoadEventsButton);
    	buttonPane.add(reinitializeDecksButton);
    	buttonPane.add(saveButton);
    	buttonPane.add(exitButton);
    	this.add(buttonPane, BorderLayout.CENTER);
    }
    
    public void drawEvent()
    {
    	
    }
    
    private void formatButtons()
    {
    	formatButton(drawCityEventButton, Color.red, Color.black, CAMPAIGN_BUTTON_SIZE_MIN, CAMPAIGN_BUTTON_SIZE_PREFFERED, CAMPAIGN_BUTTON_SIZE_MAX);
    	formatButton(drawRoadEventButton, Color.red, Color.black, CAMPAIGN_BUTTON_SIZE_MIN, CAMPAIGN_BUTTON_SIZE_PREFFERED, CAMPAIGN_BUTTON_SIZE_MAX);
    	formatButton(addCityEventButton, Color.red, Color.black, CAMPAIGN_BUTTON_SIZE_MIN, CAMPAIGN_BUTTON_SIZE_PREFFERED, CAMPAIGN_BUTTON_SIZE_MAX);
    	formatButton(addRoadEventButton, Color.red, Color.black, CAMPAIGN_BUTTON_SIZE_MIN, CAMPAIGN_BUTTON_SIZE_PREFFERED, CAMPAIGN_BUTTON_SIZE_MAX);
    	formatButton(shuffleCityEventsButton, Color.red, Color.black, CAMPAIGN_BUTTON_SIZE_MIN, CAMPAIGN_BUTTON_SIZE_PREFFERED, CAMPAIGN_BUTTON_SIZE_MAX);
    	formatButton(shuffleRoadEventsButton, Color.red, Color.black, CAMPAIGN_BUTTON_SIZE_MIN, CAMPAIGN_BUTTON_SIZE_PREFFERED, CAMPAIGN_BUTTON_SIZE_MAX);
    	formatButton(reinitializeDecksButton, Color.red, Color.black, CAMPAIGN_BUTTON_SIZE_MIN, CAMPAIGN_BUTTON_SIZE_PREFFERED, CAMPAIGN_BUTTON_SIZE_MAX);
    	formatButton(saveButton, Color.red, Color.black, CAMPAIGN_BUTTON_SIZE_MIN, CAMPAIGN_BUTTON_SIZE_PREFFERED, CAMPAIGN_BUTTON_SIZE_MAX);
    	formatButton(exitButton, Color.red, Color.black, CAMPAIGN_BUTTON_SIZE_MIN, CAMPAIGN_BUTTON_SIZE_PREFFERED, CAMPAIGN_BUTTON_SIZE_MAX);
    }

	private void formatButton(JButton toFormat, Color backgroundColor, Color foreGroundColor, Dimension minSize, Dimension preferredSize, Dimension maxiumumSize) {
		toFormat.setBackground(backgroundColor);
		toFormat.setForeground(foreGroundColor);
		toFormat.setMinimumSize(minSize);
		toFormat.setPreferredSize(preferredSize);
		toFormat.setMaximumSize(maxiumumSize);
		toFormat.addActionListener(this);
	}
    

    //so our panel is the correct size when pack() is called on Jframe
    @Override
    public Dimension getPreferredSize() 
    {
        return new Dimension(400, 600);
    }
    
	@Override
	public void actionPerformed(ActionEvent e) 
	{
		Object button = e.getSource();
	    if(button instanceof JButton)
	    {
	    	String text = ((JButton) button).getText();
	    	switch(text)
	    	{
	    		case "Draw a City Event":
	    			EventManager.getInstance().setUserIntInput(1);
	    			break;
	    		case "Draw a Road Event":
	    			EventManager.getInstance().setUserIntInput(2);
	    			break;
	    		case "Add a City Event":
	    			EventManager.getInstance().setUserIntInput(3);
	    			return;
	    		case "Add a Road Event":
	    			EventManager.getInstance().setUserIntInput(4);
	    			return;
	    		case "Shuffle City Events":
	    			EventManager.getInstance().setUserIntInput(5);
	    			return;
	    		case "Shuffle Road Events":
	    			EventManager.getInstance().setUserIntInput(6);
	    			return;
	    		case "Reinitialize Events":
	    			EventManager.getInstance().setUserIntInput(7);
	    			return;
	    		case "Save Event Manager":
	    			EventManager.getInstance().setUserIntInput(8);
	    			return;
	    		case "Exit Event Manager":
	    			EventManager.getInstance().setUserIntInput(9);
	    			return;
	    		default:
	    			System.out.println("Ruh roh");
	    			return;
	    	}
	    }
	}
}
