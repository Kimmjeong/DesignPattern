package pattern.behavioral.command.invoker;

import pattern.behavioral.command.concrete.Command;

/* 호출자 클래스 (Invoker)*/
public class Button {
	private Command theCommand;
	
	public Button(Command theCommand){
		setCommand(theCommand);
	}
	
	public void setCommand(Command newCommand){
		this.theCommand=newCommand;
	}
	
	public void pressed(){
		theCommand.execute();
	}
}

