package epamtaks7_1;

import org.apache.log4j.Logger;

public class Circle implements Shape {

	public String draw() {
		Logger log = ILogger.getLogger();
		log.debug("Drawing Circle");
		return "Drawing Circle";
	}

}