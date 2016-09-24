package tn.iit.commande;

public class NoCommand  implements Command{
		
	@Override
	public void execute() {
		System.out.println("Rien a faire Execute");
		
	}

	@Override
	public void undo() {
		System.out.println("Rien a faire Undo");
		
	}

}
