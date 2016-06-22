package adapter_pattern;

public class Main {
	public static void main(String[] args)
	{
		System.out.println("============= Queue ===========================");
		Queue qA = new QueueStackImpl();
		qA.queue("aaa");
		qA.queue("bbb");
		System.out.println(qA.dequeue());
		System.out.println("Is Empty = " + qA.isEmpty());
		System.out.println(qA.dequeue());
		System.out.println("Is Empty = " + qA.isEmpty());
		
		System.out.println("============ Stack ===========================");
		Stack sA = new QueueStackImpl();
		sA.push("aaa");
		sA.push("bbb");
		System.out.println(sA.pop());
		System.out.println("Is Empty = " + sA.isEmpty());
		System.out.println(sA.pop());
		System.out.println("Is Empty = " + sA.isEmpty());
	}
}
