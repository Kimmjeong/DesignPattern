package pattern.creational.abstractFactory;

public class ElevatorFactoryFactory {
	public static ElevatorFactory getFactory(VendorID vendorID){
		ElevatorFactory factory=null;
		switch(vendorID){
		case LG:
			factory=LGElevatorFactory.getInstance();
			break;
		case HYUNDAI:
			factory=HyundaiElevatorFactory.getInstance();
			break;
		}
		return factory;
	}
}
