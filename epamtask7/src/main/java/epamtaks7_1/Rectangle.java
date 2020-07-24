package epamtaks7_1;

import org.apache.log4j.Logger;

public class Rectangle implements Shape {

	public String draw() {
		Logger log = ILogger.getLogger();
		log.debug("Drawing Rectangle");
		return "Drawing Rectangle";
	}
}