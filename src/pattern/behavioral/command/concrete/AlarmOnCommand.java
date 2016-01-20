package pattern.behavioral.command.concrete;

import pattern.behavioral.command.receiver.Alarm;

public class AlarmOnCommand implements Command {

	private Alarm theAlarm;
	
	public AlarmOnCommand(Alarm theAlarm){
		this.theAlarm=theAlarm;
	}
	
	@Override
	public void execute() {
		theAlarm.start();
	}

}
