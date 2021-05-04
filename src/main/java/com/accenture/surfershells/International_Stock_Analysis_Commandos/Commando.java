package com.accenture.surfershells.International_Stock_Analysis_Commandos;

public class Commando {

	public String commandoName;
	
	public boolean shouldExecute(String input) 
	{
		if (commandoName.equals(input)) 
		{
			return true;
		}
		return false;
	}
}
