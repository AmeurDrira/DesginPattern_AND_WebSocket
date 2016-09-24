package tn.iit.observer;


public class Sonnerie2 implements SonnerieObserver {

	public void ding(int h) {
		System.out.println("Sonnerie2");
		for (int i=0;i<h;i++){
			System.out.print("pip ");
		}
		System.out.println();
		
	}

}
