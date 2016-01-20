package pattern.behavioral.command.concrete;

import pattern.behavioral.command.receiver.Lamp;

public class LampOffCommand implements Command {

	private Lamp theLamp;
	
	public LampOffCommand(Lamp theLamp){
		this.theLamp=theLamp;
	}
	
	@Override
	public void execute() {
		theLamp.turnOff();
	}

}
