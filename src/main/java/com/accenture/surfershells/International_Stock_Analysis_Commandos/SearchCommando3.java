package com.accenture.surfershells.International_Stock_Analysis_Commandos;

import java.sql.Connection;
import java.util.Scanner;

public class SearchCommando3 extends Commando {
	
	private Connection con;
	
	public SearchCommando3 (Connection con) {
		super.commandoName = "s";
		this.con = con;
	}
		
	public void searchCommando (String input, Scanner scanner, Connection con) {
		if (!commandoName.equals(input)) {
			return;
		}
	}
}

