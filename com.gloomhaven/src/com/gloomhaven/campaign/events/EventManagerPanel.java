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
    	drawCityEventButton.setBackground(Color.red);
    	drawCityEventButton.setForeground(Color.black);
    	drawCityEventButton.setMinimumSize(CAMPAIGN_BUTTON_SIZE_MIN);
    	drawCityEventButton.setPreferredSize(CAMPAIGN_BUTTON_SIZE_PREFFERED);
    	drawCityEventButton.setMaximumSize(CAMPAIGN_BUTTON_SIZE_MAX);
    	drawCityEventButton.addActionListener(this);

    	
    	drawRoadEventButton.setBackground(Color.red);
    	drawRoadEventButton.setForeground(Color.black);
    	drawRoadEventButton.setMinimumSize(CAMPAIGN_BUTTON_SIZE_MIN);
    	drawRoadEventButton.setPreferredSize(CAMPAIGN_BUTTON_SIZE_PREFFERED);
    	drawRoadEventButton.setMaximumSize(CAMPAIGN_BUTTON_SIZE_MAX);
    	drawRoadEventButton.addActionListener(this);
    	
    	addCityEventButton.setBackground(Color.red);
    	addCityEventButton.setForeground(Color.black);
    	addCityEventButton.setMinimumSize(CAMPAIGN_BUTTON_SIZE_MIN);
    	addCityEventButton.setPreferredSize(CAMPAIGN_BUTTON_SIZE_PREFFERED);
    	addCityEventButton.setMaximumSize(CAMPAIGN_BUTTON_SIZE_MAX);
    	addCityEventButton.addActionListener(this);
    	
    	addRoadEventButton.setBackground(Color.red);
    	addRoadEventButton.setForeground(Color.black);
    	addRoadEventButton.setMinimumSize(CAMPAIGN_BUTTON_SIZE_MIN);
    	addRoadEventButton.setPreferredSize(CAMPAIGN_BUTTON_SIZE_PREFFERED);
    	addRoadEventButton.setMaximumSize(CAMPAIGN_BUTTON_SIZE_MAX);
    	addRoadEventButton.addActionListener(this);
    	
    	shuffleCityEventsButton.setBackground(Color.red);
    	shuffleCityEventsButton.setForeground(Color.black);
    	shuffleCityEventsButton.setMinimumSize(CAMPAIGN_BUTTON_SIZE_MIN);
    	shuffleCityEventsButton.setPreferredSize(CAMPAIGN_BUTTON_SIZE_PREFFERED);
    	shuffleCityEventsButton.setMaximumSize(CAMPAIGN_BUTTON_SIZE_MAX);
    	shuffleCityEventsButton.addActionListener(this);
    	
    	shuffleRoadEventsButton.setBackground(Color.red);
    	shuffleRoadEventsButton.setForeground(Color.black);
    	shuffleRoadEventsButton.setMinimumSize(CAMPAIGN_BUTTON_SIZE_MIN);
    	shuffleRoadEventsButton.setPreferredSize(CAMPAIGN_BUTTON_SIZE_PREFFERED);
    	shuffleRoadEventsButton.setMaximumSize(CAMPAIGN_BUTTON_SIZE_MAX);
    	shuffleRoadEventsButton.addActionListener(this);
    	
    	reinitializeDecksButton.setBackground(Color.red);
    	reinitializeDecksButton.setForeground(Color.black);
    	reinitializeDecksButton.setMinimumSize(CAMPAIGN_BUTTON_SIZE_MIN);
    	reinitializeDecksButton.setPreferredSize(CAMPAIGN_BUTTON_SIZE_PREFFERED);
    	reinitializeDecksButton.setMaximumSize(CAMPAIGN_BUTTON_SIZE_MAX);
    	reinitializeDecksButton.addActionListener(this);
    	
    	saveButton.setBackground(Color.red);
    	saveButton.setForeground(Color.black);
    	saveButton.setMinimumSize(CAMPAIGN_BUTTON_SIZE_MIN);
    	saveButton.setPreferredSize(CAMPAIGN_BUTTON_SIZE_PREFFERED);
    	saveButton.setMaximumSize(CAMPAIGN_BUTTON_SIZE_MAX);
    	saveButton.addActionListener(this);
    	
    	exitButton.setBackground(Color.red);
    	exitButton.setForeground(Color.black);
    	exitButton.setMinimumSize(CAMPAIGN_BUTTON_SIZE_MIN);
    	exitButton.setPreferredSize(CAMPAIGN_BUTTON_SIZE_PREFFERED);
    	exitButton.setMaximumSize(CAMPAIGN_BUTTON_SIZE_MAX);
    	exitButton.addActionListener(this);
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