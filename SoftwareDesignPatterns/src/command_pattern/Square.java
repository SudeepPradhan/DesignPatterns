package command_pattern;

public class Square {
	int sideLength = 0;
	int position = 50;
	
	public Square(int sideLength)
	{
		this.sideLength = sideLength;
	}
	
	public void MoveRight(int moveBy)
	{
		if(this.position + moveBy <= 100)
			this.position += moveBy;
	}
	
	public void MoveLeft(int moveBy)
	{
		if(this.position - moveBy >= 0)
			this.position -= moveBy;
	}
	
	public void Scale(int scaleBy)
	{
		this.sideLength += scaleBy;
	}
}
