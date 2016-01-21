package pattern.structural.facade.facade;

import pattern.structural.facade.obj.Car;
import pattern.structural.facade.obj.Heater;
import pattern.structural.facade.obj.Navigation;
import pattern.structural.facade.obj.SideMirror;

public class RemoteControl {
	private Car car;
	private Heater heater;
	private Navigation navi;
	private SideMirror sideMirror;
	
	public RemoteControl(Car car, Heater heater, Navigation navi, SideMirror sideMirror) {
		this.car=car;
		this.heater=heater;
		this.navi=navi;
		this.sideMirror=sideMirror;
	}
	
	public void remoteStartUP(){
		car.startup();
		heater.on();
		navi.turnOn();
		sideMirror.open();
	}
	
	public void remoteStartOFF(){
		sideMirror.close();
		navi.turnOff();
		heater.off();
		car.startoff();
	}
}
