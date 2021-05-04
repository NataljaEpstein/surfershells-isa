package com.accenture.surfershells.International_Stock_Analysis_Commandos;

import java.io.BufferedReader;

public class Import extends Commando {
	
	BufferedReader csvReader = new BufferedReader(new FileReader(pathToCsv));
	while ((row = csvReader.readLine()) != null) {
	    String[] data = row.split(",");
	    // do something with the data
	}
	csvReader.close();
}