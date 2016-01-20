package pattern.structural.decorator.adddeco;

import pattern.structural.decorator.component.Display;
import pattern.structural.decorator.decorator.DisplayDecorator;

public class LaneDecorator extends DisplayDecorator {

	public LaneDecorator(Display decoratedDisplay) {
		super(decoratedDisplay);
	}
	
	public void draw(){
		super.draw();
		drawLane();
	}
	
	private void drawLane(){
		System.out.println("\t차선 표시");
	}
	
}
