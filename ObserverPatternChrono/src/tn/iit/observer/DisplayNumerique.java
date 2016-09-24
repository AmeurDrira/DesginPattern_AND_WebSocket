package tn.iit.observer;


public class DisplayNumerique implements DisplayObserver {


	public void afficheTempsEcoule(int h,int m,int s) {
		System.out.println("DisplayNumerique");
		System.out.println(h+":"+m+":"+s);
		
	}

}
