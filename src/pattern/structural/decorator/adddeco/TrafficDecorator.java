package pattern.structural.decorator.adddeco;

import pattern.structural.decorator.component.Display;
import pattern.structural.decorator.decorator.DisplayDecorator;

public class TrafficDecorator extends DisplayDecorator {

	public TrafficDecorator(Display decoratedDisplay) {
		super(decoratedDisplay);
	}
	
	public void draw(){
		super.draw();
		drawTraffic();
	}
	
	private void drawTraffic(){
		System.out.println("\t교통량 표시");
	}

}
