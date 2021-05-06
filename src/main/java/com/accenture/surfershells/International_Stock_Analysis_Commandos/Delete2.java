package com.accenture.surfershells.International_Stock_Analysis_Commandos;

import java.sql.Connection;
import java.util.Scanner;

public class Delete2 extends Commando {
	public Connection con;

	public Delete2(Connection con) {
		this.con = con;
		super.commandoName = "d";
	}

	public void deleteCommando(String input, Scanner scanner, Connection con) {
		if (!commandoName.equals(input)) {
			return;
		}
	}
}