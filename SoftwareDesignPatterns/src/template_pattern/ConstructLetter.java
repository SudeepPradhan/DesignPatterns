package template_pattern;

public abstract class ConstructLetter 
{
	public final void constructLetter(ILetter letter) {
		Symmetric symmetric = getSymmetricType(letter);
		
		String completeLetter = "";
		
		if(symmetric == Symmetric.horizontal)
		{
			completeLetter = ConstructHorizontalSymmetricLetter(letter);
		}
		else if(symmetric == Symmetric.vertical)
		{
			completeLetter = ConstructVerticalSymmetricLetter(letter);
		}
		else 
		{
			completeLetter = ConstructSymmetricLetter(letter);
		}
			
		printLetter(completeLetter);
	}
	
	public abstract Symmetric getSymmetricType(ILetter letter);
	public abstract String ConstructHorizontalSymmetricLetter(ILetter letter);
	public abstract String ConstructVerticalSymmetricLetter(ILetter letter);
	public abstract String ConstructSymmetricLetter(ILetter letter);
	
	private void printLetter(String output) {
		System.out.println(output);
	}
}
