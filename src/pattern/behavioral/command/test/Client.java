package pattern.behavioral.command.test;

import pattern.behavioral.command.concrete.AlarmOnCommand;
import pattern.behavioral.command.concrete.Command;
import pattern.behavioral.command.concrete.LampOffCommand;
import pattern.behavioral.command.concrete.LampOnCommand;
import pattern.behavioral.command.invoker.Button;
import pattern.behavioral.command.receiver.Alarm;
import pattern.behavioral.command.receiver.Lamp;

public class Client {
	public static void main(String[] args) {
		Lamp lamp=new Lamp();
		Command lampOnCommand=new LampOnCommand(lamp);
		Command lampOffCommand=new LampOffCommand(lamp);
		
		Button button1=new Button(lampOnCommand);
		button1.pressed();
		
		button1.setCommand(lampOffCommand);
		button1.pressed();
		
		Alarm alarm=new Alarm();
		Command alarmOnCommand=new AlarmOnCommand(alarm);
		
		Button button2 = new Button(alarmOnCommand);
		button2.pressed();
		
		button2.setCommand(lampOnCommand);
		button2.pressed();
		
		button2.setCommand(alarmOnCommand);
		button2.pressed();
		
	}
}
