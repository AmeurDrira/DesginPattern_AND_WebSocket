
package tn.iit.observer;

public class DisplayAiguille implements DisplayObserver {
	
	public void afficheTempsEcoule(int h,int m,int s) {
		System.out.println("afficheTempsEcoule");
		System.out.println(h+":"+m+":"+s);
		
	}
	

}
