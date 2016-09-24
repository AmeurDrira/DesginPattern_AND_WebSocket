package tn.iit.compteur;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Test {

	public static void main(String[] args) throws IOException {

		int i = 0;
		String str;

		FileReader theInput = new FileReader("/Users/ameur/Downloads/mm.txt");
		FileWriter theOutput = new FileWriter("/Users/ameur/Downloads/fichier.txt");

		BufferedReader plec = new BufferedReader(theInput);

		PrintWriter pred = new PrintWriter(theOutput);

		while ((str = plec.readLine()) != null) {

			if (str.contains("bonjour"))
				i++;

		}

		System.out.println("I = " + i);

		pred.close();
		plec.close();
	}
}
