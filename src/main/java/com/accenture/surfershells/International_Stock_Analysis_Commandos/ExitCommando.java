package com.accenture.surfershells.International_Stock_Analysis_Commandos;

import java.util.Scanner;

public class ExitCommando extends Commando {

		public void exit(String input, Scanner scanner) 
		{
			if ("exit".equals(input)) 
			{
				System.out.println("Good bye!");
				scanner.close();
				System.exit(0);
			}
		}
}
