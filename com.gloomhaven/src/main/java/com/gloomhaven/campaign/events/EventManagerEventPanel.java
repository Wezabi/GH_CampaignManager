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

public class EventManagerEventPanel extends JPanel implements ActionListener
{
    private Image img;
    private int w;
    private int h;
    private static final Dimension EVENT_MANAGER_EVENT_PANEL_DIMENSION = new Dimension(200, 600);
    private static final Dimension EVENT_MANAGER_EVENT_BUTTON_PANEL_DIMENSION = new Dimension(200, 50);
    private static final Dimension EVENT_MANAGER_EVENT_IMAGE_PANEL_DIMENSION = new Dimension(200, 600);
    private static final Dimension CAMPAIGN_BUTTON_SIZE_PREFFERED = new Dimension(120, 50);
    private static final Dimension CAMPAIGN_BUTTON_SIZE_MIN = new Dimension(50, 25);
    private static final Dimension CAMPAIGN_BUTTON_SIZE_MAX = new Dimension(100, 50);
    private JPanel choosePanel = new JPanel();
    private JLabel imageLabel = new JLabel();
    private JButton continueButton = new JButton("Continue");
    private JButton keepButton = new JButton("Keep Event");
    private JButton removeButton = new JButton("Remove Event");
    
    public EventManagerEventPanel()
    {
    	this.setLayout(new BoxLayout(this, BoxLayout.PAGE_AXIS));
    	this.setPreferredSize(EVENT_MANAGER_EVENT_PANEL_DIMENSION);
    	this.formatButtons();
    	choosePanel.add(continueButton);
    	choosePanel.add(keepButton);
    	choosePanel.add(removeButton);
    	this.add(imageLabel, BorderLayout.CENTER);
    	this.add(choosePanel, BorderLayout.CENTER);
    	choosePanel.setPreferredSize(EVENT_MANAGER_EVENT_BUTTON_PANEL_DIMENSION);
    	imageLabel.setPreferredSize(EVENT_MANAGER_EVENT_IMAGE_PANEL_DIMENSION);
    }
    
    private void formatButtons()
    {
		
    	continueButton.setBackground(Color.red);
    	continueButton.setForeground(Color.black);
    	continueButton.setMinimumSize(CAMPAIGN_BUTTON_SIZE_MIN);
    	continueButton.setPreferredSize(CAMPAIGN_BUTTON_SIZE_PREFFERED);
    	continueButton.setMaximumSize(CAMPAIGN_BUTTON_SIZE_MAX);
    	continueButton.addActionListener(this);

    	
    	keepButton.setBackground(Color.red);
    	keepButton.setForeground(Color.black);
    	keepButton.setMinimumSize(CAMPAIGN_BUTTON_SIZE_MIN);
    	keepButton.setPreferredSize(CAMPAIGN_BUTTON_SIZE_PREFFERED);
    	keepButton.setMaximumSize(CAMPAIGN_BUTTON_SIZE_MAX);
    	keepButton.setEnabled(false);
    	keepButton.addActionListener(this);

    	
    	removeButton.setBackground(Color.red);
    	removeButton.setForeground(Color.black);
    	removeButton.setMinimumSize(CAMPAIGN_BUTTON_SIZE_MIN);
    	removeButton.setPreferredSize(CAMPAIGN_BUTTON_SIZE_PREFFERED);
    	removeButton.setMaximumSize(CAMPAIGN_BUTTON_SIZE_MAX);
    	removeButton.setEnabled(false);
    	removeButton.addActionListener(this);

	}
	
	@Override
	protected void paintComponent(Graphics g)
	{
	    super.paintComponent(g);
	    g.setColor(Color.RED);
	    g.drawImage(img, -w, -h, this);
	    repaint();
	}
	
	public void setImage(Image img)
	{
	    this.img = img;
	}
	
	public void setHeight(int h)
	{
	    this.h = h;
	}
	
	public void setWidth(int w)
	{
	    this.w = w;
	}
	
	public void eventRead()
	{
		continueButton.setEnabled(false);
		removeButton.setEnabled(true);
		keepButton.setEnabled(true);
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
	    			EventManager.getInstance().setUserStrInput("c");
	    			break;
	    		case "Keep Event":
	    			EventManager.getInstance().setUserStrInput("k");
	    			break;
	    		case "Remove Event":
	    			EventManager.getInstance().setUserStrInput("r");
	    			break;
	    		default:
	    			System.out.println("Wes you spelled something wrong in EventManagerEventPanel");
	    			return;
	    	}
	    }
	}
}
