package tn.iit.navigateur;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.URL;
import java.net.UnknownHostException;

public class ReadHtmlPage {

	@SuppressWarnings("resource")
	public static void main(String[] args) throws UnknownHostException, IOException {
		BufferedReader in = null;
		int port=0;
		Socket socket;

		URL url = null;
		//http://localhost:8888/AdminLTE-2.3.0/index2.html
		//http://www.commentcamarche.net/forum/affich-12745091-java-recuperation-args
		url = new URL("http://localhost:8888/AdminLTE-2.3.0/index2.html");
		port = url.getPort();
		if(port==-1)		
			port=80;
		
		socket = new Socket(url.getHost(), port);
		System.out.println("Demande de connexion");
		PrintWriter pwd = new PrintWriter(socket.getOutputStream());
		pwd.println("GET " + url.getFile() + " " + "HTTP/1.0");
		pwd.println("");
		pwd.flush();
		in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
		String s = in.readLine();

		while (s != null) {

			System.out.println(s);
			s = in.readLine();
		}
		in.close();
	}

}
