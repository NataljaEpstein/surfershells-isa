package com.accenture.surfershells.International_Stock_Analysis_Commandos;

import java.sql.Connection;
import java.util.Scanner;

public class ImportCsvVersuch11 extends Commando {

	public Connection con;

	public ImportCsvVersuch11(Connection con) {
		this.con = con;
		super.commandoName = "i";
	}

	public void importCommando(String input, Scanner scanner, Connection con) {
		if (!commandoName.equals(input)) {
			return;
		}
	}
}
