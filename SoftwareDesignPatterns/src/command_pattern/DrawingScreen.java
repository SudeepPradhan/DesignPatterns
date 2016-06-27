package command_pattern;

public class DrawingScreen {
	Square square;
	
	public void CreateSquare(int size)
	{
		this.square = new Square(size);
		System.out.println("Create Square");
	}
	
	public void DeleteSquare()
	{
		this.square = null;
		System.out.println("Delete Square");
	}
	
	public void MoveRight(int moveBy)
	{
		if(square != null)
		{
			square.MoveRight(moveBy);
			System.out.println("Move Right");
		}
	}
	
	public void MoveLeft(int moveBy)
	{
		if(square != null)
		{
			square.MoveLeft(moveBy);
			System.out.println("Move Left");
		}
	}
	
	public void Scale(int scaleBy)
	{
		if(square != null)
		{
			square.Scale(scaleBy);
			System.out.println("Scale");
		}
	}
}
