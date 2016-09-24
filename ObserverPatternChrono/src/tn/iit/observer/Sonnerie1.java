package tn.iit.observer;

public class Sonnerie1 implements SonnerieObserver {


	public void ding(int h) {
		System.out.println("Sonnerie1");
		for (int i=0;i<h;i++){
			System.out.print("ding ");
		}
		System.out.println();
		
	}
	

}
