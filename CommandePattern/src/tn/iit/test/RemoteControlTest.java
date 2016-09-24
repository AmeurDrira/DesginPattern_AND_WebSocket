package tn.iit.test;

import tn.iit.commande.GarageDoorOpenCommand;
import tn.iit.commande.LightOnCommand;
import tn.iit.commande.SimpleRemoteControl;
import tn.iit.entites.GarageDoor;
import tn.iit.entites.Light;

public class RemoteControlTest {

	public static void main(String argv[]) {
		SimpleRemoteControl remote = new SimpleRemoteControl();
		Light light = new Light();
		LightOnCommand lightOn = new LightOnCommand(light);
		GarageDoor garageDoor = new GarageDoor();
		GarageDoorOpenCommand garageOpen = new GarageDoorOpenCommand(garageDoor);
		remote.setCommand(lightOn); // encapsuler la commande
		remote.buttonWasPressed(); // allumer la lumière
		remote.setCommand(garageOpen); // encapsuler la commande
		remote.buttonWasPressed(); // ouvrir la porte du garage
	}
}
