package logAnalysisProject;

import java.util.HashMap;

public class RequestCounter {
	
	private HashMap<String, Integer> requestIpMap = new HashMap<String, Integer>();
	
	public void count(String ip){
		if(requestIpMap.containsKey(ip)){
			Integer index = requestIpMap.get(ip).intValue();
			requestIpMap.put(ip, index.intValue()+1);
		}else{
			requestIpMap.put(ip, 1);
		}
	}
	public int getRequestCount(String ip){
		return requestIpMap.get(ip);
	}
	public HashMap<String, Integer> getRequestIpMap(){
		return requestIpMap;
	}
}
