package chainofresponsibility_pattern;

import java.util.List;

import chainofresponsibility_pattern.agents.ChainBuilder;

public class Client {

	public static void main(String[] args)
	{
		List<CallRecord> records = DummyDatabase.getCallRecords();
		
		ChainBuilder chain = new ChainBuilder();
		for(CallRecord record: records)
		{
			chain.getHandler().handleRequest(record);
		}
	}
}
