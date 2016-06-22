package singleton_pattern;

public class Singleton1 {
	private Singleton1() {}
	
	private static Singleton1 singleInstance;
	
	public synchronized static Singleton1 getInstance()
	{
		if(singleInstance == null)
			singleInstance = new Singleton1();
		return singleInstance;
	}

	public void PrintName()
	{
		System.out.println("Exit");
	}
}
