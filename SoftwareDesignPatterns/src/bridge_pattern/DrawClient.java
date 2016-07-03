package bridge_pattern;

public class DrawClient {

	public static void main(String[] args) {

		DrawingAPI drawApi = new DrawingAPIImpl1();
		Shape shape = new Circle(5, 5, 5, drawApi);
		
		shape.draw();
	}

}
