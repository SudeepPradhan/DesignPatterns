package singleton_pattern;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Singleton single = Singleton.getInstance();
		single.PrintName();
		
		Singleton1 single2 = Singleton1.getInstance();
		single2.PrintName();
	
		SingletonEnum.Instance.PrintName();
	}

}
