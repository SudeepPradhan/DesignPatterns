package factorymethod_pattern;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.UnsupportedEncodingException;

public class FileTrace implements Trace {

	Boolean state = true;
	static String filePath = "logfile.txt";
	
	@Override
	public void setDebug(boolean debug) {
		state = debug;
	}

	@Override
	public void debug(String message) {
		if(state)
			try {
				fileWrite("Debug Message:" + message);
			} catch (FileNotFoundException | UnsupportedEncodingException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	}

	@Override
	public void error(String message) {
		try {
			fileWrite("Error Message:" + message);
		} catch (FileNotFoundException | UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void fileWrite(String message) throws FileNotFoundException, UnsupportedEncodingException
	{
    	try{
    		message += System.lineSeparator();
    		
    		File file =new File(filePath);
  
    		if(!file.exists()){
    			file.createNewFile();
    		}

    		FileWriter fileWritter = new FileWriter(file.getName(),true);
    	        BufferedWriter bufferWritter = new BufferedWriter(fileWritter);
    	        bufferWritter.write(message);
    	        bufferWritter.close();
	        
    	}catch(IOException e){
    		e.printStackTrace();
    	}
	}

}
