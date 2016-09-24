package tn.iit.compteur;

import java.io.*;

public class Main2 {
	public static void main(String[] args){
		String chaine="";
		String t="";
		int i=0;
			
		try{
			FileReader input=new FileReader("/Users/ameur/Downloads/mm.txt"); 			
			BufferedReader bufferreader=new BufferedReader(input);
			String ligne;
			while ((ligne=bufferreader.readLine())!=null)
			{	
				if(ligne!="bonjour")
		      {
				System.out.println(ligne);
				chaine+=ligne+"\n";
				i++;
				System.out.println("ok");
				
			}
				
			}
			bufferreader.close(); 
			
		}		
		catch (Exception e){
			System.out.println(e.toString());
		}
	
		//création ou ajout dans le fichier texte
		try {
			
			FileWriter fw = new FileWriter ("/Users/ameur/Downloads/mmNew.txt");			
			BufferedWriter bw = new BufferedWriter (fw);			
			PrintWriter fichierSortie = new PrintWriter (bw); 
			//fichierSortie.println (chaine+"\n test de lecture et écriture !!"); 
			fichierSortie.println (i);
			fichierSortie.close();
			System.out.println("Ecriture avec succer"); 
		}
		catch (Exception e){
			System.out.println(e.toString());
		}		
	}
}