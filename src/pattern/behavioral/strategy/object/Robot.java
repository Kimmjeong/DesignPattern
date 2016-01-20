package pattern.behavioral.strategy.object;

import pattern.behavioral.strategy.attack.AttackStrategy;
import pattern.behavioral.strategy.move.MovingStrategy;

public abstract class Robot {
	private String name;
	private MovingStrategy movingStrategy;
	private AttackStrategy attackStrategy;
	
	public Robot(String name){
		this.name=name;
	}
	
	public String getName(){
		return name;
	}
	
	public void move(){
		movingStrategy.move();
	}
	
	public void attack(){
		attackStrategy.attack();
	}
	
	public void setMovingStrategy(MovingStrategy movingStrategy){
		this.movingStrategy=movingStrategy;
	}
	
	public void setAttackStrategy(AttackStrategy attackStrategy){
		this.attackStrategy=attackStrategy;
	}

}
