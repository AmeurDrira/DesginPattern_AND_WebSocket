package tn.iit.test;

import tn.iit.commande.LightOnCommand;
import tn.iit.commande.SimpleRemoteControl;
import tn.iit.entites.Light;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SimpleRemoteControl remote = new SimpleRemoteControl();
		Light light = new Light();
		LightOnCommand lightOn = new LightOnCommand(light);
		remote.setCommand(lightOn); // passer la commande à l’invoker
		remote.buttonWasPressed(); // simuler l’appui sur le bouton

	}

}
