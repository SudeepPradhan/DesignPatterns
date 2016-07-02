package state_pattern;

public class IceCondition implements Condition {

	@Override
	public void turnLeft() {
		System.out.println("Turning Left with speed :" + 1);
	}

	@Override
	public void turnRight() {
		System.out.println("Turning Right with speed :" + 1);
	}

	@Override
	public void accelerate() {
		System.out.println("Accelerating with speed :" + 3);
	}

	@Override
	public void brake() {
		System.out.println("Breaking with speed :" + 2);
	}

	@Override
	public String condition() {
		return "Ice Condition";
	}
}
