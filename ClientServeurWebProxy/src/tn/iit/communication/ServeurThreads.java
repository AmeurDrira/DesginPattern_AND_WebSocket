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

public class ServeurThreads implements Runnable {

	Socket soc;
	static final int port = 8888;

	static final String chemin = "/Users/ameur/wwww/";
	File file;
	BufferedReader plec;
	PrintWriter pred = null;
	String url = null;

	public ServeurThreads(Socket soc) {
		this.soc = soc;
	}

	public static void main(String[] args) throws Exception {

		ServerSocket s = new ServerSocket(port);
		while (true) {
			Socket soc = s.accept();
			new Thread(new ServeurThreads(soc)).start();
			
		}
	}

	public void run() {
		try {

			plec = new BufferedReader(new InputStreamReader(soc.getInputStream()));

			pred = new PrintWriter(new BufferedWriter(new OutputStreamWriter(soc.getOutputStream())));

			url = plec.readLine();

			System.out.println(url);
			String newStr = url.substring(url.indexOf(' ') + 1, url.lastIndexOf(' '));
			System.out.println(newStr);

			file = new File(chemin + newStr);

			if (!file.exists()) {
				pred.println("404 NOT FOUND\r\n");
				pred.flush();
			} else

			{
				FileReader theInput;

				theInput = new FileReader(chemin + newStr);

				BufferedReader plec2 = new BufferedReader(theInput);
				String ligne = null;

				ligne = plec2.readLine();

				pred.println("HTTP 200 OK\r\n");

				while (ligne != null) {
					pred.println(ligne);

					ligne = plec2.readLine();

				}

				pred.flush();
				soc.close();

			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
