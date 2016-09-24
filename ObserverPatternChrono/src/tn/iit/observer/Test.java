package tn.iit.observer;

public class Test {
	public static void main(String[] args) {
		Chrono chrono = new Chrono();
		SonnerieObserver sonnerie1 = new Sonnerie1();
		SonnerieObserver sonnerie2 = new Sonnerie2();
		DisplayObserver display1 = new DisplayNumerique();
		DisplayObserver display2 = new DisplayAiguille();
		chrono.registerDisplay(display1);
		chrono.registerDisplay(display2);
		chrono.registerSonnerie(sonnerie1);
		chrono.registerSonnerie(sonnerie2);

		for (int i = 3595; i < 5000; i++) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				System.out.print("erreur");
			}
			chrono.tick((i % 3600) % 60, (int) ((i % 3600) / 60), (int) (i / 3600));
		}
	}

}
