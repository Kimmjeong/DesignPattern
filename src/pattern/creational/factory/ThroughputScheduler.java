package pattern.creational.factory;

import pattern.structural.templet.state.Direction;

public class ThroughputScheduler implements ElevatorScheduler {

	private static ElevatorScheduler scheduler;
	private ThroughputScheduler(){}
	
	public static ElevatorScheduler getInstance(){
		if(scheduler == null)
			scheduler=new ThroughputScheduler();
		return scheduler;
	}
	
	@Override
	public int selectElevator(ElevatorManager manager, int destination, Direction direction) {
		return 0;
	}
	
}
