package tn.iit.commande;

public class RemoteControl {

	Command onCommands[];
	Command offCommands[];
	Command undoCommand;

	public RemoteControl() {
		onCommands = new Command[4];
		offCommands = new Command[4];
		Command noCommand = new NoCommand();
		for (int i = 0; i < 4; i++) {
			onCommands[i] = noCommand;
			offCommands[i] = noCommand;
		}
		undoCommand = noCommand;

	}

	public void setCommand(int slot, Command onCommand, Command offCommand) {
		onCommands[slot] = onCommand;
		offCommands[slot] = onCommand;
	}

	public void onButtonWasPressed(int slot) {
		onCommands[slot].execute();
		undoCommand = onCommands[slot];

	}

	public void offButtonWasPressed(int slot) {
		offCommands[slot].execute();
		undoCommand = offCommands[slot];
	}

	public void undoButtonWasPressed() {
		undoCommand.undo();
	}

	public String toString() {
		String s = "";
		for (int i = 0; i < 4; i++) {
			s += "Slot[" + i + "]" + onCommands[i].getClass().getName() + " " + offCommands[i].getClass().getName()
					+ "\n";
		}
		return s;
	}

}
