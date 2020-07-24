package epamtask7_4;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;

public class ILogger {
    public static Logger LOGGER;
    
    private ILogger() {}
    
    public static Logger getLogger() {
    	if(LOGGER == null) {
    		LOGGER = Logger.getLogger(HpIndianCharger.class);
    		BasicConfigurator.configure();    		
    	}
    	return LOGGER;
    }
}
