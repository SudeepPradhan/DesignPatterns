package state_pattern;

public class WetCondition implements Condition{

	@Override
	public void turnLeft() {
		System.out.println("Turning Left with speed :" + 4);
	}

	@Override
	public void turnRight() {
		System.out.println("Turning Right with speed :" + 4);
	}

	@Override
	public void accelerate() {
		System.out.println("Accelerating with speed :" + 9);
	}

	@Override
	public void brake() {
		System.out.println("Breaking with speed :" + 7);
	}

	@Override
	public String condition() {
		return "Wet Condition";
	}

}
