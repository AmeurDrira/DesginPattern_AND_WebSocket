package tn.iit.communication;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class Serveur {
	static final int port = 8888;
	static final String chemin = "/Users/ameur/wwww/";

	@SuppressWarnings("resource")
	public static void main(String[] args) throws Exception {
		ServerSocket s = new ServerSocket(port);
		File file;
		while (true) {
			Socket soc = s.accept();
			BufferedReader plec = new BufferedReader(new InputStreamReader(soc.getInputStream()));
			PrintWriter pred = new PrintWriter(new BufferedWriter(new OutputStreamWriter(soc.getOutputStream())));
			String url = plec.readLine();
			System.out.println(url);
			String newStr = url.substring(url.indexOf(' ') + 1, url.lastIndexOf(' '));
			System.out.println(newStr);

			file = new File(chemin + newStr);

			if (!file.exists()) {
				pred.println("404 NOT FOUND\r\n");
				pred.flush();
			} else

			{
				FileReader theInput = new FileReader(chemin + newStr);
				BufferedReader plec2 = new BufferedReader(theInput);
				String ligne = plec2.readLine();
				pred.println("HTTP 200 OK\r\n");

				while (ligne != null) {
					pred.println(ligne);
					ligne = plec2.readLine();
				}

				pred.flush();
			}
			soc.close();
		}
	}
}
