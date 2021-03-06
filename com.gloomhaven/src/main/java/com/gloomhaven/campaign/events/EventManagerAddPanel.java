package com.gloomhaven.campaign.events;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class EventManagerAddPanel extends JPanel implements ActionListener
{
    private Image img;
    private int w;
    private int h;
    private static final Dimension EVENT_MANAGER_ADD_PANEL_DIMENSION = new Dimension(200, 200);
    private static final Dimension CAMPAIGN_BUTTON_SIZE_PREFFERED = new Dimension(120, 50);
    private static final Dimension CAMPAIGN_BUTTON_SIZE_MIN = new Dimension(50, 25);
    private static final Dimension CAMPAIGN_BUTTON_SIZE_MAX = new Dimension(100, 50);
    private JTextField textBox = new JTextField();
    private JPanel buttonPanel = new JPanel();
    private JButton continueButton = new JButton("Continue");
    private JButton exitButton = new JButton("Exit");
    
    public EventManagerAddPanel()
    {
    	this.setLayout(new BoxLayout(this, BoxLayout.PAGE_AXIS));
    	this.setPreferredSize(EVENT_MANAGER_ADD_PANEL_DIMENSION);
    	this.formatButtons();
    	buttonPanel.add(continueButton);
    	buttonPanel.add(exitButton);
    	this.add(textBox, BorderLayout.CENTER);
    	this.add(buttonPanel, BorderLayout.CENTER);
    }
    
    private void formatButtons()
    {
    	continueButton.setBackground(Color.red);
    	continueButton.setForeground(Color.black);
    	continueButton.setMinimumSize(CAMPAIGN_BUTTON_SIZE_MIN);
    	continueButton.setPreferredSize(CAMPAIGN_BUTTON_SIZE_PREFFERED);
    	continueButton.setMaximumSize(CAMPAIGN_BUTTON_SIZE_MAX);
    	continueButton.addActionListener(this);
    	
    	exitButton.setBackground(Color.red);
    	exitButton.setForeground(Color.black);
    	exitButton.setMinimumSize(CAMPAIGN_BUTTON_SIZE_MIN);
    	exitButton.setPreferredSize(CAMPAIGN_BUTTON_SIZE_PREFFERED);
    	exitButton.setMaximumSize(CAMPAIGN_BUTTON_SIZE_MAX);
    	exitButton.addActionListener(this);
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
	    		case "Continue":
	    			if(textBox.getText().matches("^[\\d]{1,2}$"))
	    			{
	    				EventManager.getInstance().setUserIntInput(Integer.valueOf(textBox.getText()));
	    			}
	    			else
	    			{
	    				textBox.setText("Error- Please enter the one or two digit number");
	    			}
	    			break;
	    		case "Exit":
	    			EventManager.getInstance().setUserIntInput(0);
	    			break;
	    		default:
	    			System.out.println("Wes you spelled something wrong in EventManagerAddPanel");
	    			return;
	    	}
	    }
	}
}
