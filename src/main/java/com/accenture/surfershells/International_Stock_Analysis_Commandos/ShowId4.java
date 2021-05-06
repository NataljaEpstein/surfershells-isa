package com.accenture.surfershells.International_Stock_Analysis_Commandos;

import java.sql.Connection;
import java.util.Scanner;

import com.accenture.beaches.SurferBeach;

public class ShowId4 extends Commando {
	public Connection con;

	public ShowId4(Connection con) {
		this.con = con;
		super.commandoName = "show";
	}

	public void showIdCommando(String input, Scanner scanner, Connection con) {
		if (!commandoName.equals(input)) {
			return;
		}
		
		System.out.println("Please enter the name of a surfer beach.");
		String surferBeachName = scanner.nextLine();
		
		System.out.println("Please enter the country of a surfer beach.");
		String surferBeachCountry = scanner.nextLine();
		
		SurferBeach surferBeach = new SurferBeach(surferBeachName, surferBeachCountry);
		surferBeaches.add(surferBeach);
	}
}
