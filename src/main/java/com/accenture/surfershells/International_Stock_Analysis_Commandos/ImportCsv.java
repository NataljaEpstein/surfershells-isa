package com.accenture.surfershells.International_Stock_Analysis_Commandos;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ImportCsv {
	
	public static final String delimiter = ";";
	
	public static void importCsv (String csvFile) {
		try {BufferedReader bufferedReader = new BufferedReader (new FileReader (new File(csvFile)));
			bufferedReader.readLine(); // überspringt 1. Zeile
			
			// File stockDataFile = new File(csvFile);
			// FileReader filereader = new FileReader (stockDataFile);
			// BufferedReader bufferedReader = new BufferedReader (filereader);
			// Erklärung wie der Buffered Reader aufgebaut ist
			
			String line = null; // Variable line mit dem Wert null
			String [] stocks; // String array stocks
			
			while ((line = bufferedReader.readLine()) != null) {
				stocks = line.split(delimiter);
				
				for (String stock : stocks) {
			 		System.out.println(stock + " ");
				}
				System.out.println();
			}
			bufferedReader.close();
		}catch (FileNotFoundException e) {
			System.out.println("Error: File " + csvFile + " not found");
		}catch (IOException ioe) {
			System.out.println("Error: File " + csvFile + " could not read");
		}
	}
}
