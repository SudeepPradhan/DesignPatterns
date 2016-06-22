package template_pattern;


public class ConstructCompleteLetter extends ConstructLetter {

	@Override
	public Symmetric getSymmetricType(ILetter letter) {
		if(letter.getMaxRow() >= letter.getRow() * 2)
			return Symmetric.vertical;
		
		if(letter.getMaxColumn() >= letter.getColumn() * 2)
			return Symmetric.horizontal;
		
		return Symmetric.none;
	}

	@Override
	public String ConstructHorizontalSymmetricLetter(ILetter letter) {
		String[] char1 = letter.getPartialLetter();
		
		String outputResult = "";
		String[] secondHalf = new String[letter.getColumn()];
		int j = 0;
		
		for(int i = 0; i < char1.length; i++)
		{
			if(i >= letter.getRow() && i % letter.getRow() == 0)
			{
				outputResult += "\n";
				j++;
			}
			
			outputResult += char1[i];
			if(secondHalf[j] == null)
				secondHalf[j] = char1[i];
			else
				secondHalf[j] += char1[i];
		}
		
		while(j > 0)
		{
			outputResult += "\n";
			outputResult += secondHalf[--j];
		}
		
		return outputResult;
	}

	@Override
	public String ConstructVerticalSymmetricLetter(ILetter letter) {
		String[] char1 = letter.getPartialLetter();
		
		String outputResult = "";
		String[] firstHalf = new String[letter.getRow()];
		int j = 0;
		
		for(int i = 0; i < char1.length; i++)
		{
			if(i >= letter.getRow() && i % letter.getRow() == 0)
			{
				while(j > 0)
				{
					outputResult += firstHalf[--j];
				}
				outputResult += "\n";
			}
			
			outputResult += char1[i];
			firstHalf[j++] = char1[i];
		}
		
		// Flush
		while(j > 0)
		{
			outputResult += firstHalf[--j];
		}
		
		return outputResult;
	}

	@Override
	public String ConstructSymmetricLetter(ILetter letter) {
		String[] char1 = letter.getPartialLetter();
		
		String outputResult = "";
		
		for(int i = 0; i < char1.length; i++)
		{
			if(i >= letter.getRow() && i % letter.getRow() == 0)
			{
				outputResult += "\n";
			}
			
			outputResult += char1[i];
		}
		
		return outputResult;
	}

}
