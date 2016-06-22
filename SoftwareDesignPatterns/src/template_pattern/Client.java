package template_pattern;

public class Client {

	public static void main(String[] args) {
		
		ConstructCompleteLetter test = new ConstructCompleteLetter();
		
		System.out.println(" Vertical Axis Symmetric Letter A ");
		String verLetterArr = "---------+---++--++---++--++---++---++---++++-++---++---++---++---++--";
		ILetter verLetter = new Letter(verLetterArr.split(""), 5, 14, 10, 20);
		test.constructLetter(verLetter);
		
		System.out.println(" Symmetric Letter B ");
		String symLetterArr = "----------+++++----++--++---++---++--++---++--++---++--++--++---++++++---++---++--++----++-++----++-++----++-++---++--++++++--";
		ILetter symLetter = new Letter(symLetterArr.split(""), 9, 14, 10, 20);
		test.constructLetter(symLetter);
		
		System.out.println(" Hortizontal Axis Symmetric Letter A ");
		String horLetterArr = "------------++++----++--++--++----++-++-------++-------++-------++------";
		ILetter horLetter = new Letter(horLetterArr.split(""), 9, 8, 10, 20);
		test.constructLetter(horLetter);
	}

}
