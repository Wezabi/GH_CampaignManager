package com.gloomhaven.campaign;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import com.gloomhaven.campaign.events.EventManager;

public class CampaignPanel extends JPanel implements ActionListener
{
    private Image img;
    private int w;
    private int h;
    private static final Dimension CAMPAIGN_PANEL_DIMENSION = new Dimension(400, 200);
    private static final Dimension CAMPAIGN_BUTTON_SIZE_PREFFERED = new Dimension(100, 50);
    private static final Dimension CAMPAIGN_BUTTON_SIZE_MIN = new Dimension(50, 25);
    private static final Dimension CAMPAIGN_BUTTON_SIZE_MAX = new Dimension(100, 50);
    private JPanel buttonPane = new JPanel();
    private JButton eventManagerButton = new JButton("Run Event Manager");
    private JButton runActiveSimulationButton = new JButton("Run the standard sim");
    private JButton exitButton = new JButton("Exit");
    
    public CampaignPanel()
    {
    	this.setLayout(new BoxLayout(this, BoxLayout.PAGE_AXIS));
    	this.setBackground(Color.black);
    	this.setPreferredSize(CAMPAIGN_PANEL_DIMENSION);
    	this.formatButtons();
    	buttonPane.add(eventManagerButton);
    	buttonPane.add(runActiveSimulationButton);
    	buttonPane.add(exitButton);
    	this.add(buttonPane, BorderLayout.CENTER);
    }
    
    private void formatButtons()
    {
    	eventManagerButton.setBackground(Color.red);
    	eventManagerButton.setForeground(Color.black);
    	eventManagerButton.setMinimumSize(CAMPAIGN_BUTTON_SIZE_MIN);
    	eventManagerButton.setPreferredSize(CAMPAIGN_BUTTON_SIZE_PREFFERED);
    	eventManagerButton.setMaximumSize(CAMPAIGN_BUTTON_SIZE_MAX);
    	eventManagerButton.addActionListener(this);

    	
    	runActiveSimulationButton.setBackground(Color.red);
    	runActiveSimulationButton.setForeground(Color.black);
    	runActiveSimulationButton.setMinimumSize(CAMPAIGN_BUTTON_SIZE_MIN);
    	runActiveSimulationButton.setPreferredSize(CAMPAIGN_BUTTON_SIZE_PREFFERED);
    	runActiveSimulationButton.setMaximumSize(CAMPAIGN_BUTTON_SIZE_MAX);
    	runActiveSimulationButton.setEnabled(false);
    	runActiveSimulationButton.addActionListener(this);

    	
    	exitButton.setBackground(Color.red);
    	exitButton.setForeground(Color.black);
    	exitButton.setMinimumSize(CAMPAIGN_BUTTON_SIZE_MIN);
    	exitButton.setPreferredSize(CAMPAIGN_BUTTON_SIZE_PREFFERED);
    	exitButton.setMaximumSize(CAMPAIGN_BUTTON_SIZE_MAX);
    	exitButton.addActionListener(this);

    }
    
    @Override
    protected void paintComponent(Graphics g)
    {
        super.paintComponent(g);
        g.setColor(Color.RED);
        g.drawImage(img, -w, -h, this);
    }

    //so our panel is the correct size when pack() is called on Jframe
//    @Override
//    public Dimension getPreferredSize() {
//        return new Dimension(400, 700);
//    }
    
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

	@Override
	public void actionPerformed(ActionEvent e) 
	{
		{
			System.out.println("Nice");
			Object button = e.getSource();
		    if(button instanceof JButton)
		    {
		    	String text = ((JButton) button).getText();
		    	switch(text)
		    	{
		    		case "Run Event Manager":
		    			System.out.println("run event manager button pressed");
		    			CampaignManager.getInstance().setUserInput(1);
		    			break;
		    		case "Exit":
		    			System.out.println("exit campaign manager button pressed");
		    			CampaignManager.getInstance().setUserInput(3);
		    			return;
		    		default:
		    			System.out.println("Ruh roh");
		    			return;
		    	}
		    }
		}	
	}
}
