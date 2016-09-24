package tn.iit.test;

import tn.iit.commande.LightOffCommand;
import tn.iit.commande.LightOnCommand;
import tn.iit.commande.RemoteControl;
import tn.iit.commande.StereoOffCommand;
import tn.iit.commande.StereoOnWithCDCommand;
import tn.iit.entites.Light;
import tn.iit.entites.Stereo;

public class RemoteLoader {
	public static void main(String arg[]) {

		RemoteControl remoteControl = new RemoteControl();
		Light livingRoomLight = new Light();
		LightOnCommand livingRoomLightOnCommand = new LightOnCommand(livingRoomLight);
		LightOffCommand livingRoomLightOffCommand = new LightOffCommand(livingRoomLight);
		remoteControl.setCommand(0, livingRoomLightOnCommand, livingRoomLightOffCommand);
		remoteControl.onButtonWasPressed(0);
		remoteControl.offButtonWasPressed(0);
		Stereo stereo = new Stereo();
		StereoOnWithCDCommand stereoOnWithCDCommand = new StereoOnWithCDCommand(stereo);
		StereoOffCommand stereoOffCommand = new StereoOffCommand(stereo);
		remoteControl.setCommand(1, stereoOnWithCDCommand, stereoOffCommand);
		remoteControl.onButtonWasPressed(1);
		remoteControl.offButtonWasPressed(1);
		remoteControl.undoButtonWasPressed();
		System.out.println(remoteControl.toString());
	}
}
