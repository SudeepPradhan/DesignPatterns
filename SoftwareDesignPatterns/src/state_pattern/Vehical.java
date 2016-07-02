package state_pattern;

import java.util.Scanner;
import java.util.Timer;
import java.util.TimerTask;

public class Vehical {
	private Condition[] conditions = new Condition[4];
	
	private Condition CurrentCondition;
	
	Timer timer;
	int level = 0;
	
	public Vehical()
	{
		this.conditions[0] = new RegularCondition();
		this.conditions[1] = new GravelCondition();
		this.conditions[2] = new WetCondition();
		this.conditions[3] = new IceCondition();
		
		this.CurrentCondition = this.conditions[level];
	}

	public void StartTimer() {
		timer = new Timer();
		timer.schedule(new RemindTask(), 5000, 5000);
	}
	
	public void StopTimer() {
		timer.cancel();
	}

	class RemindTask extends TimerTask {
		public void run() {
			if(level < 3)
			{
				level++;
				CurrentCondition = conditions[level];
				
		        System.out.println("============================");
				System.out.println("Level up!");
				System.out.println("Level : " + level);
				System.out.println("Current road condition : " + CurrentCondition.condition());
		        System.out.println("============================");
			}
			else
			{
				StopTimer();
			}
		}
	}

	
	public void Drive()
	{
        Scanner keyboard = new Scanner(System.in);
        boolean exit = false;
        System.out.println("============================");
        System.out.println("Driving started !!");
        System.out.println("Control the driving");
        System.out.println("'a' for acceleration");
        System.out.println("'r' for right turn");
        System.out.println("'l' for left turn");
        System.out.println("'b' for break");
        System.out.println("'q' for quit");
        System.out.println("============================");
        
        StartTimer();
        while (!exit) {
            String input = keyboard.nextLine();
            if(input != null) {                
                if ("a".equals(input)) {
                    this.CurrentCondition.accelerate();
                } else if ("r".equals(input)) {
                	this.CurrentCondition.turnRight();
                } else if ("l".equals(input)) {
                	this.CurrentCondition.turnLeft();
                } else if ("b".equals(input)) {
                	this.CurrentCondition.brake();
                } else if ("q".equals(input)) {
                    System.out.println("Game Over!");
                    exit = true;
                } else {
                    System.out.println("Key not recognized!");
                }
            }
        }
        keyboard.close();
	}
}
