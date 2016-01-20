package pattern.creational.factory;

import pattern.structural.templet.state.Direction;

public interface ElevatorScheduler {
	public int selectElevator(ElevatorManager manager, int destination, Direction direction);
}
