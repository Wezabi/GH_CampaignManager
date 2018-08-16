package com.gloomhaven.campaign.events;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
 
/**
 * @author ashraf
 *
 */
public class EventCsvFileWriter 
{
     
    //Delimiter used in CSV file
    private static final String COMMA_DELIMITER = ",";
    private static final String NEW_LINE_SEPARATOR = "\n";
     
    //CSV file header
    private static final String FILE_HEADER = "city/road,number";
 
    public static void writeCsvFileAllEvents(String fileName, List<CityEvent> cityEvents, List<RoadEvent> roadEvents) {
         
        FileWriter fileWriter = null;
        try {
            fileWriter = new FileWriter(fileName);
 
            fileWriter.append(FILE_HEADER.toString());
            fileWriter.append(NEW_LINE_SEPARATOR);
             
            if(roadEvents != null)
            {
                for (RoadEvent event : roadEvents) 
                {
                    fileWriter.append(String.valueOf('r'));
                    fileWriter.append(COMMA_DELIMITER);
                    fileWriter.append(String.valueOf(event.getEventNumber()));
                    fileWriter.append(NEW_LINE_SEPARATOR);
                }
            }
            
            if(cityEvents != null)
            {
                for (CityEvent event : cityEvents) 
                {
                fileWriter.append(String.valueOf('c'));
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(String.valueOf(event.getEventNumber()));
                fileWriter.append(NEW_LINE_SEPARATOR);
                }
            }
            System.out.println("CSV file was created successfully !!!");
             
        } catch (Exception e) {
            System.out.println("Error in CsvFileWriter !!!");
            e.printStackTrace();
        } finally {
             
            try {
                fileWriter.flush();
                fileWriter.close();
            } catch (IOException e) {
                System.out.println("Error while flushing/closing fileWriter !!!");
                    e.printStackTrace();
                }
            }
        }
    }