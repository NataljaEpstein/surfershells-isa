package com.accenture.surfershells.International_Stock_Analysis_Commandos;

import java.sql.Connection;
import java.util.Scanner;

public class ExitCommando extends Commando {
	
	public Connection con;

	public ExitCommando() {
		super.commandoName = "exit";
	}

		public void exit(String input, Scanner scanner) 
		{
			if (!commandoName.equals(input))
			{
				System.out.println("Good bye!");
				scanner.close();
				System.exit(0);
			}
		}
}
