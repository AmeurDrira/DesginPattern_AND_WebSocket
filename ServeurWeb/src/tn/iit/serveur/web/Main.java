package tn.iit.serveur.web;

import java.io.File;

public class Main {

	public static void main(String[] args) {

		File source=new File("/Users/ameur/Downloads/mm.java");
		File des =new File("/Users/ameur/Downloads/ameur.java");
		Test.copyFile(source,des);
	}

}
