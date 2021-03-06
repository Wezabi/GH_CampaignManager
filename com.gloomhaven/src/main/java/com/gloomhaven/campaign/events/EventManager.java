package com.gloomhaven.campaign.events;

import java.awt.*;
import java.awt.image.*;
import java.io.*;
import javax.imageio.ImageIO;

import java.net.URISyntaxException;
import java.util.Collections;
import java.util.LinkedList;

import com.gloomhaven.campaign.CampaignManager;
import com.gloomhaven.campaign.CsvFileReader;
import com.gloomhaven.campaign.CsvFileWriter;
import com.gloomhaven.run.Main;

public class EventManager
{
    private static final int CARD_WIDTH = 400;
    private static final int CARD_HEIGHT = 600;
    private static final Dimension CAMPAIGN_PANEL_DIMENSION = new Dimension(400, 200);
    private static final Dimension EVENT_MANAGER_MENU_DIMENSION = new Dimension(400, 600);
    private static final Dimension EVENT_MANAGER_EVENT_DRAWN_MENU_DIMENSION = new Dimension(410, 700);
    private static final Dimension EVENT_MANAGER_EVENT_ADD_MENU_DIMENSION = new Dimension(400, 200);

    private LinkedList<RoadEvent> roadEventDeck = new LinkedList<>();
    private LinkedList<CityEvent> cityEventDeck = new LinkedList<>();
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    private String eventCSV;
    private File CEF_FILE;
    private File CEB_FILE;
    private File REF_FILE;
    private File REB_FILE;
    private Graphics graphics;
    private EventManagerPanel eventManagerPanel = new EventManagerPanel();
    private Integer userIntInput = -1;
    private String userStrInput = "";
    Image img;
    private static CampaignManager campaignManager;
    
    private static EventManager INSTANCE;
    
    public static EventManager getInstance()
    {
    	if(INSTANCE == null)
    	{
    		INSTANCE = new EventManager();
    	}
    	return INSTANCE;
    }
    
    private EventManager()
    {
        this.findSaveData();
    }
    
    public void runEventManager()
    {
    	System.out.println("Running event manager");

    	campaignManager = CampaignManager.getInstance();
    	campaignManager.getFrame().add(eventManagerPanel);
    	campaignManager.getFrame().setPreferredSize(EVENT_MANAGER_MENU_DIMENSION);
    	campaignManager.getFrame().pack();
    	eventManagerPanel.setVisible(false);
        eventManagerPanel.setVisible(true);
        System.out.println("|-------------------------------|");
        System.out.println("|         Event Manager         |");
        System.out.println("|-------------------------------|");
        System.out.println("| Please choose how to proceed  |");
        System.out.println("|-------------------------------|");
        System.out.println("|  1  | Draw a City Event       |");
        System.out.println("|  2  | Draw a Road Event       |");
        System.out.println("|  3  | Add a new City Event    |");
        System.out.println("|  4  | Add a new Road Event    |");
        System.out.println("|  5  | Shuffle City Events     |");
        System.out.println("|  6  | Shuffle Road Events     |");
        System.out.println("|  7  | Reinitialize Events     |");
        System.out.println("|  8  | Save                    |");
        System.out.println("|  9  | Exit                    |");
        System.out.println("|_______________________________|");
        userIntInput = -1;
        while(userIntInput < 1 || userIntInput > 9)
        {
        	switch(userIntInput)
            {
                case 1: 
                    drawCityEvent();
                    userIntInput = -1;
                    break;
                case 2:
                    drawRoadEvent();
                    userIntInput = -1;
                    break;
                case 3:
                    addCityEvent();
                    userIntInput = -1;
                    break;
                case 4:
                    addRoadEvent();
                    userIntInput = -1;
                    break;
                case 5:
                    shuffleCityEvents();
                    userIntInput = -1;
                    break;
                case 6:
                    shuffleRoadEvents();
                    userIntInput = -1;
                    break;
                case 7:
                    initialize();
                    userIntInput = -1;
                    break;
                case 8:
                    writeSaveData();
                    userIntInput = -1;
                    break;
            }
        }
        userIntInput = -1;
    	eventManagerPanel.setVisible(false);
    	campaignManager.getFrame().remove(eventManagerPanel);
    	campaignManager.getFrame().setPreferredSize(CAMPAIGN_PANEL_DIMENSION);
    	campaignManager.getFrame().pack();
        return;
    }
    
    public void initialize()
    {
        cityEventDeck.clear();
        roadEventDeck.clear();
    	for(int i = 1; i<31; i++)
        {
            cityEventDeck.add(new CityEvent(i));
            roadEventDeck.add(new RoadEvent(i));
        }
        shuffleCityEvents();
        shuffleRoadEvents();
    }
    
    public void addCityEvent()
    {
    	userIntInput = -1;
    	EventManagerAddPanel eventManagerAddPanel = new EventManagerAddPanel();
		CampaignManager.getInstance().getFrame().add(eventManagerAddPanel);
		CampaignManager.getInstance().getFrame().setVisible(true);
		CampaignManager.getInstance().getFrame().remove(eventManagerPanel);
		eventManagerAddPanel.setVisible(true);
		CampaignManager.getInstance().getFrame().setPreferredSize(EVENT_MANAGER_EVENT_ADD_MENU_DIMENSION);
		CampaignManager.getInstance().getFrame().pack();
		
    	while(userIntInput < 0 || userIntInput > 81) 
    	{
    		Thread.yield();
    	}
    	if(userIntInput != 0)
    	{
			cityEventDeck.add(new CityEvent(userIntInput));
			shuffleCityEvents();
    	}
		CampaignManager.getInstance().getFrame().remove(eventManagerAddPanel);
		CampaignManager.getInstance().getFrame().add(eventManagerPanel);
		CampaignManager.getInstance().getFrame().setVisible(true);
		CampaignManager.getInstance().getFrame().setPreferredSize(EVENT_MANAGER_MENU_DIMENSION);
		CampaignManager.getInstance().getFrame().pack();
		userIntInput = -1;
		eventManagerPanel.setVisible(false);
		eventManagerPanel.setVisible(true);
    }
    
    public void addRoadEvent()
    {
    	userIntInput = -1;
    	EventManagerAddPanel eventManagerAddPanel = new EventManagerAddPanel();
		CampaignManager.getInstance().getFrame().add(eventManagerAddPanel);
		CampaignManager.getInstance().getFrame().setVisible(true);
		CampaignManager.getInstance().getFrame().remove(eventManagerPanel);
		eventManagerAddPanel.setVisible(true);
		CampaignManager.getInstance().getFrame().setPreferredSize(EVENT_MANAGER_EVENT_ADD_MENU_DIMENSION);
		CampaignManager.getInstance().getFrame().pack();
		
    	while(userIntInput < 0 || userIntInput > 81) 
    	{
    		Thread.yield();
    	}
    	if(userIntInput != 0)
    	{
			roadEventDeck.add(new RoadEvent(userIntInput));
			shuffleRoadEvents();
    	}
		CampaignManager.getInstance().getFrame().remove(eventManagerAddPanel);
		CampaignManager.getInstance().getFrame().add(eventManagerPanel);
		CampaignManager.getInstance().getFrame().setVisible(true);
		CampaignManager.getInstance().getFrame().setPreferredSize(EVENT_MANAGER_MENU_DIMENSION);
		CampaignManager.getInstance().getFrame().pack();
		userIntInput = -1;
		eventManagerPanel.setVisible(false);
		eventManagerPanel.setVisible(true);
    }
    
    public void drawCityEvent()
    {
    	try 
    	{
    		EventManagerEventPanel eventManagerEventPanel = new EventManagerEventPanel();
    		CampaignManager.getInstance().getFrame().add(eventManagerEventPanel);
    		CampaignManager.getInstance().getFrame().setVisible(true);
    		CampaignManager.getInstance().getFrame().remove(eventManagerPanel);
    		eventManagerEventPanel.setVisible(false);
    		CampaignManager.getInstance().getFrame().setPreferredSize(EVENT_MANAGER_EVENT_DRAWN_MENU_DIMENSION);
    		CampaignManager.getInstance().getFrame().pack();
	        System.out.println("Drawing city event...");
	        CityEvent event = cityEventDeck.getFirst();
	        System.out.println(event.getEventNumber());
	        int w = Math.max(1, calcWidth(event.getEventNumber()));
	        int h = Math.max(1, calcHeight(event.getEventNumber()));
	        eventManagerEventPanel.setWidth(w);
	        eventManagerEventPanel.setHeight(h);
            BufferedImage img = ImageIO.read(CEF_FILE);
            BufferedImage bi = new BufferedImage(w, h, BufferedImage.TYPE_INT_ARGB);
            graphics = bi.getGraphics();
            eventManagerEventPanel.setImage(img);
            eventManagerEventPanel.paintComponent(graphics);
            eventManagerEventPanel.setVisible(true);
            while(!((userStrInput.matches("^[c]$")))){}
            eventManagerEventPanel.eventRead();
        	CampaignManager.getInstance().getFrame().setVisible(false);
            img = ImageIO.read(CEB_FILE);
            bi = new BufferedImage(w, h, BufferedImage.TYPE_INT_ARGB);
            graphics = bi.getGraphics();
            eventManagerEventPanel.setImage(img);
            eventManagerEventPanel.paintComponent(graphics);
            CampaignManager.getInstance().getFrame().setVisible(true);
            while(!((userStrInput.matches("^[r]$") || (userStrInput.matches("^[k]$"))))){}
	        if(userStrInput.matches("^[r]$"))
	        {
	        	cityEventDeck.removeFirst();
	        }
	        else
	        {
	        	cityEventDeck.addLast(event);
	        	cityEventDeck.removeFirst();
	        }
    		CampaignManager.getInstance().getFrame().remove(eventManagerEventPanel);
    		CampaignManager.getInstance().getFrame().add(eventManagerPanel);
    		CampaignManager.getInstance().getFrame().setVisible(true);
    		CampaignManager.getInstance().getFrame().setPreferredSize(EVENT_MANAGER_MENU_DIMENSION);
    		CampaignManager.getInstance().getFrame().pack();
    		eventManagerPanel.setVisible(false);
    		eventManagerPanel.setVisible(true);
        } 
    	catch (IOException e) {}
    }
    
    public void drawRoadEvent()
    {
    	try 
    	{
    		EventManagerEventPanel eventManagerEventPanel = new EventManagerEventPanel();
    		CampaignManager.getInstance().getFrame().add(eventManagerEventPanel);
    		CampaignManager.getInstance().getFrame().setVisible(true);
    		CampaignManager.getInstance().getFrame().remove(eventManagerPanel);
    		eventManagerEventPanel.setVisible(false);
    		CampaignManager.getInstance().getFrame().setPreferredSize(EVENT_MANAGER_EVENT_DRAWN_MENU_DIMENSION);
    		CampaignManager.getInstance().getFrame().pack();
	        System.out.println("Drawing road event...");
	        RoadEvent event = roadEventDeck.getFirst();
	        System.out.println(event.getEventNumber());
	        int w = Math.max(1, calcWidth(event.getEventNumber()));
	        int h = Math.max(1, calcHeight(event.getEventNumber()));
	        eventManagerEventPanel.setWidth(w);
	        eventManagerEventPanel.setHeight(h);
            BufferedImage img = ImageIO.read(REF_FILE);
            BufferedImage bi = new BufferedImage(w, h, BufferedImage.TYPE_INT_ARGB);
            graphics = bi.getGraphics();
            eventManagerEventPanel.setImage(img);
            eventManagerEventPanel.paintComponent(graphics);
            eventManagerEventPanel.setVisible(true);
            while(!((userStrInput.matches("^[c]$")))){}
            eventManagerEventPanel.eventRead();
        	CampaignManager.getInstance().getFrame().setVisible(false);
            img = ImageIO.read(REB_FILE);
            bi = new BufferedImage(w, h, BufferedImage.TYPE_INT_ARGB);
            graphics = bi.getGraphics();
            eventManagerEventPanel.setImage(img);
            eventManagerEventPanel.paintComponent(graphics);
            CampaignManager.getInstance().getFrame().setVisible(true);
            while(!((userStrInput.matches("^[r]$") || (userStrInput.matches("^[k]$"))))){}
	        if(userStrInput.matches("^[r]$"))
	        {
	            roadEventDeck.removeFirst();
	        }
	        else
	        {
	            roadEventDeck.addLast(event);
	            roadEventDeck.removeFirst();
	        }
    		CampaignManager.getInstance().getFrame().remove(eventManagerEventPanel);
    		CampaignManager.getInstance().getFrame().add(eventManagerPanel);
    		CampaignManager.getInstance().getFrame().setVisible(true);
    		CampaignManager.getInstance().getFrame().setPreferredSize(EVENT_MANAGER_MENU_DIMENSION);
    		CampaignManager.getInstance().getFrame().pack();
    		eventManagerPanel.setVisible(false);
    		eventManagerPanel.setVisible(true);
        } 
    	catch (IOException e) {}
    }
    
    public void shuffleCityEvents()
    {
        Collections.shuffle(cityEventDeck);
    }
    
    public void shuffleRoadEvents()
    {
        Collections.shuffle(roadEventDeck);
    }
    
    private int calcWidth(int num)
    {
        return num % 10 == 0 ? 9 * CARD_WIDTH : (((num % 10) - 1) * CARD_WIDTH);
    }
    
    private int calcHeight(int num)
    {
        return num % 10 == 0 ? (((num / 10) - 1) * CARD_HEIGHT) : ((num / 10) * CARD_HEIGHT);
    }
    
    public void findSaveData()
    {
        String base;
		try 
		{
			base = new File(Main.class.getProtectionDomain().getCodeSource().getLocation().toURI()).getParentFile().getPath();
			this.eventCSV = base + "\\Event.csv";
			this.CEF_FILE = new File(base + "\\cityEvent_Front.jpg");
			this.CEB_FILE = new File(base + "\\cityEvent_Back.jpg");
			this.REF_FILE = new File(base + "\\roadEvent_Front.jpg");
			this.REB_FILE = new File(base + "\\roadEvent_Back.jpg");
		} 
		catch (URISyntaxException e)
		{
			e.printStackTrace();
		}
        if(!readSaveData())
        {   
            initialize();
            writeSaveData();
        }
        else
        {
            System.out.println("Event Manager data successfully read from " + eventCSV);
        }
    }
    
    public EventManagerPanel getEventManagerPanel()
    {
    	return eventManagerPanel;
    }
    
    public void setUserStrInput(String userStrInput)
    {
    	this.userStrInput = userStrInput;
    }
    
    public void setUserIntInput(int userIntInput)
	{
    	this.userIntInput = userIntInput;
    }
    
    public boolean readSaveData()
    {
        CsvFileReader reader = new CsvFileReader();
        cityEventDeck = reader.readCsvFileCityEvent(eventCSV);
        roadEventDeck = reader.readCsvFileRoadEvent(eventCSV);
        return (roadEventDeck.isEmpty() || cityEventDeck.isEmpty() ? false : true);
    }
    
    public void writeSaveData()
    {
        CsvFileWriter.writeCsvFileAllEvents(eventCSV, cityEventDeck, roadEventDeck);
    }
    
    public void clearSaveData()
    {
        CsvFileWriter.writeCsvFileAllEvents(eventCSV, null, null);
    }
}
