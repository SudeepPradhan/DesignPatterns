package interpreter_pattern;

public class Main {
	public static void main(String[] args) {
		String tokenString = "- + 10 5 - 8 2";
		Context context = new Context(tokenString);
		System.out.println(tokenString + " = " +context.interpret());
	}
}
