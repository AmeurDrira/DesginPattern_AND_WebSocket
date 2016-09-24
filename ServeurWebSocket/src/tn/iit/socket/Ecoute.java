package tn.iit.socket;

import java.io.IOException;
import java.net.Socket;

public class Ecoute {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Socket s; 

		for ( int i=1; i<65535 ; i++)
		{
			try{
				s = new Socket("127.0.0.1",i);
				System.out.println("port" + i);
			}
			catch(IOException e)
			{
				System.exit(0);
			}
			
		}
		System.out.println("fin");


	}

}
