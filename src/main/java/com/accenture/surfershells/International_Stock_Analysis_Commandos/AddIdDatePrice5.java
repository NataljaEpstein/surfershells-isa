package com.accenture.surfershells.International_Stock_Analysis_Commandos;

import java.sql.Connection;
import java.util.Scanner;

public class AddIdDatePrice5 extends Commando {

	public Connection con;

	public AddIdDatePrice5(Connection con) {
		this.con = con;
		super.commandoName = "add";
	}

	public void addIdDatePrice5(String input, Scanner scanner, Connection con) {
		if (!commandoName.equals(input)) {
			return;
		}
	}
}
