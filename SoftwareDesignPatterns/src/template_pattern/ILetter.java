package template_pattern;

public interface ILetter 
{
	public void setRow(int size);
	public void setColumn(int size);
	public void setMaxRow(int size);
	public void setMaxColumn(int size);
	
	public int getRow();
	public int getColumn();
	public int getMaxRow();
	public int getMaxColumn();
	
	public String[] getPartialLetter();
}
