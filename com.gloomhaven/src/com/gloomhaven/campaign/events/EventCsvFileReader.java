package com.gloomhaven.campaign.events;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedList;
public class EventCsvFileReader
{
    public LinkedList<RoadEvent> readCsvFileRoadEvent(String fileName) 
    {
        BufferedReader br = null;
        String line = "";
        String cvsSplitBy= ",";
        LinkedList<RoadEvent> roadEventList = new LinkedList<RoadEvent>();
        try
        {
            br = new BufferedReader(new FileReader(fileName));
            while ((line = br.readLine()) != null)
            {
                String[] a = line.split(cvsSplitBy);
                if(a[0].matches("^r$"))
                    roadEventList.add(new RoadEvent(Integer.valueOf(a[1])));
            }
        } catch (FileNotFoundException e ) {
            e.printStackTrace();
        } catch (IOException e ) {
            e.printStackTrace();
        } finally {
            if (br != null) {
                try {
                    br.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
        return roadEventList;
    }
    
    public LinkedList<CityEvent> readCsvFileCityEvent(String fileName) 
    {
        BufferedReader br = null;
        String line = "";
        String cvsSplitBy= ",";
        LinkedList<CityEvent> CityEventList = new LinkedList<CityEvent>();
        try
        {
            br = new BufferedReader(new FileReader(fileName));
            while ((line = br.readLine()) != null)
            {
                String[] a = line.split(cvsSplitBy);
                if(a[0].matches("^c$"))
                    CityEventList.add(new CityEvent(Integer.valueOf(a[1])));
            }
        } catch (FileNotFoundException e ) {
            e.printStackTrace();
        } catch (IOException e ) {
            e.printStackTrace();
        } finally {
            if (br != null) {
                try {
                    br.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
        return CityEventList;
    }
}