package tn.iit.commande;

import tn.iit.entites.Light;

public class LightOnCommand implements Command {
	Light light;

	public LightOnCommand(Light light) {
		this.light = light;
	}

	public void execute() {
		light.on();
	}

	@Override
	public void undo() {
		light.off();
		
	}

}
