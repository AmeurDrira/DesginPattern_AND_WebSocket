package tn.iit.communication;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.URL;
import java.net.UnknownHostException;
import java.util.Scanner;

public class Client {

	@SuppressWarnings("resource")
	public static void main(String[] args) throws UnknownHostException, IOException {
		BufferedReader in = null;
		int port = 0;
		
		URL url = null;
		Socket socket;
		//http://localhost:8888/index.html
		//http://127.0.0.1:8888/index1.html
		Scanner sc = new Scanner(System.in);
		System.out.println("Veuillez saisir Votre Url :");
		String str = sc.nextLine();
		url = new URL(str.substring(str.indexOf(' ')+1, str.length()));
		port = url.getPort();
		if(port==-1)		
			port=80;
		socket = new Socket(url.getHost(),port);		
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
