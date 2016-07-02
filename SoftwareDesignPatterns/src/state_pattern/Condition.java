package state_pattern;

public interface Condition {
	public void turnLeft();
	public void turnRight();
	public void accelerate();
	public void brake();
	public String condition();
}
