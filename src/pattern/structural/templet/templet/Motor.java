package pattern.structural.templet.templet;

import pattern.structural.templet.state.Direction;
import pattern.structural.templet.state.Door;
import pattern.structural.templet.state.DoorStatus;
import pattern.structural.templet.state.MotorStatus;

public abstract class Motor {
	private Door door;
	private MotorStatus motorStatus;
	
	public Motor(Door door){
		this.door=door;
		motorStatus=MotorStatus.STOPPED;
	}
	
	public MotorStatus getMotorStatus(){
		return motorStatus;
	}
	
	private void setMotorStatus(MotorStatus motorStatus){
		this.motorStatus=motorStatus;
	}
	
	// LGMotor와 HYundaiMotor의 move메서드에서 공통되는 부분만을 가짐
	public void move(Direction direction){ // 템플릿 메서드
		MotorStatus motorStatus=getMotorStatus();
		if(motorStatus==MotorStatus.MOVING) 
			return;
		
		/* 엘레베이터의 문이 열리고 닫히는 것은 동작이 같음 */
		DoorStatus doorStatus=door.getDoorStatus();
		if(doorStatus==DoorStatus.OPENED) 
			door.close();
		
		/* 각 객체마다 동작이 달라지는 부분 : 모터의 움직임 */
		moveMotor(direction); // hook 메서드(primitive)
		
		/* 모터의 상태도 같음 */
		setMotorStatus(MotorStatus.MOVING);
	}
	
	protected abstract void moveMotor(Direction direction);
	
}
