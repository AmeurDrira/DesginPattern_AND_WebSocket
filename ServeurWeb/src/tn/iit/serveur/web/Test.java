package tn.iit.serveur.web;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Test {

	public static boolean copyFile(File source, File dest) {

	try {
			FileInputStream sourceFile = new FileInputStream(source);

		try {
				FileOutputStream destinationFile = null;

			try {
					destinationFile = new FileOutputStream(dest);
					int nbLecture;

					while ((nbLecture = sourceFile.read()) != -1) 
					{
						destinationFile.write(nbLecture);
						
					}
				} finally{
						destinationFile.close();
					}
			} finally 
				{
					sourceFile.close();
				}
		} catch (IOException e) {
			e.printStackTrace();
			return false;
		}

		return true;
	}

}
