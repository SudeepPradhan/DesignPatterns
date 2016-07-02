package state_pattern;

public class RegularCondition implements Condition{

	@Override
	public void turnLeft() {
		System.out.println("Turning Left with speed :" + 5);
	}

	@Override
	public void turnRight() {
		System.out.println("Turning Right with speed :" + 5);
	}

	@Override
	public void accelerate() {
		System.out.println("Accelerating with speed :" + 9);
	}

	@Override
	public void brake() {
		System.out.println("Breaking with speed :" + 8);
	}
	
	@Override
	public String condition() {
		return "Regular Condition";
	}
}
