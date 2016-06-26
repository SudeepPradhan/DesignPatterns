package chainofresponsibility_pattern.agents;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import chainofresponsibility_pattern.CallRecord;
import chainofresponsibility_pattern.interfaces.*;

public class ValidatorAgent extends AbstractAgent{
	
	@Override
	public void handleRequest(CallRecord req) {
		
		if (!this.validRequest(req))
			return;
		
		if (this.nextAgent != null)
			this.nextAgent.handleRequest(req);
	}
	
	protected boolean validRequest(CallRecord req){
		
		if(req.getCustomer().getAddress() == null ||
				req.getCustomer().getPhone() == "" ||
				req.getCustomer().getEmail() == "")
		{
			FileWriteToDiscardedRequests(req.getCallRecordId());
			req.setValid(false);
			return false;
		}
		
		req.setValid(true);
		return true;
	}
	
    private static void FileWriteToDiscardedRequests(String data)
    {	
    	try{   		
    		File file = new File("discarded-requests.txt");

    		if(!file.exists()){
    			file.createNewFile();
    		}
    		
    		DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
    		Date date = new Date();
    		String dateString = dateFormat.format(date);
    		
    		FileWriter fileWritter = new FileWriter(file.getName(),true);
    	        BufferedWriter bufferWritter = new BufferedWriter(fileWritter);
    	        bufferWritter.write(dateString + ":" + data + System.lineSeparator());
    	        bufferWritter.close();
	        
    	}catch(IOException e){
    		e.printStackTrace();
    	}
    }
}
