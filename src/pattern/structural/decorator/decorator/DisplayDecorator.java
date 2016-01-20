package pattern.structural.decorator.decorator;

import pattern.structural.decorator.component.Display;

public abstract class DisplayDecorator extends Display {

	private Display decoratedDisplay;
	
	public DisplayDecorator(Display decoratedDisplay){ // 기본 기능에 추가하기 위한 클래스
		this.decoratedDisplay=decoratedDisplay;
	}
	
	@Override
	public void draw() {
		decoratedDisplay.draw();
	}

}
