package tn.iit.commande;

import tn.iit.entites.GarageDoor;

public class GarageDoorOpenCommand implements Command {

	GarageDoor garageDoor;

	public GarageDoorOpenCommand(GarageDoor garageDoor) {
		this.garageDoor = garageDoor;
	}

	public void execute() {
		garageDoor.up();
		garageDoor.lightOn();
	}

	@Override
	public void undo() {
		garageDoor.down();
		garageDoor.lightOff();
		
	}

}
