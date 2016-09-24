package tn.iit.communication;

import java.io.BufferedWriter;
import java.io.File;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class Proxy {
	static final int port = 9999;
	static final String chemin = "/Users/ameur/wwww/";
	static final String sites = "/youtube";
	static String adresse;

	public static boolean autoriser(String domaine) {
		return sites.contains(domaine);
	}

	@SuppressWarnings("resource")
	public static void main(String[] args) throws Exception {
		ServerSocket s = new ServerSocket(port);
		File file;
		while (true) {
			Socket soc = s.accept();
			adresse = soc.getInetAddress().toString();
			
			PrintWriter pred = new PrintWriter(new BufferedWriter(new OutputStreamWriter(soc.getOutputStream())));
			System.out.println(adresse);

			if (!autoriser(adresse)) {
				pred.println("404 NOT FOUND\r\n");
				pred.println("adreese non autoriser FOUND\r\n");
				pred.flush();
			} else {
				pred.println("FOUND\r\n");
				pred.println("autoriser FOUND\r\n");
				pred.flush();
			}

			/*
			 * BufferedReader plec = new BufferedReader(new
			 * InputStreamReader(soc.getInputStream()));
			 * 
			 * String url = plec.readLine(); System.out.println(url); String
			 * newStr = url.substring(url.indexOf(' ') + 1, url.lastIndexOf('
			 * ')); System.out.println(newStr);
			 * 
			 * file = new File(chemin + newStr);
			 * 
			 * if (!file.exists()) { pred.println("404 NOT FOUND\r\n");
			 * pred.flush(); } else
			 * 
			 * { FileReader theInput = new FileReader(chemin + newStr);
			 * BufferedReader plec2 = new BufferedReader(theInput); String ligne
			 * = plec2.readLine(); pred.println("HTTP 200 OK\r\n");
			 * 
			 * while (ligne != null) { pred.println(ligne); ligne =
			 * plec2.readLine(); }
			 * 
			 * pred.flush(); }
			 */
			soc.close();
		}
	}
}
