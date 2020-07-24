package Epam.epamtask7;

import junit.framework.TestCase;

import static org.junit.Assert.assertEquals;

import org.apache.log4j.Logger;
import org.junit.Test;

import epamtask7_2.IceCream;
import epamtask7_2.IceCreamFactory;
import epamtask7_4.ILogger;

public class FactoryTest {
	@Test
	public void factoryTest1() {
		Logger log = ILogger.getLogger();
		IceCreamFactory icf = new IceCreamFactory();
		
		IceCream ic1 = icf.getIceCream("vanila");
		log.debug(ic1.getFlavour());
		assertEquals("Vanila",ic1.getFlavour());
		
		IceCream ic2 = icf.getIceCream("strawberry");
		log.debug(ic2.getFlavour());
		assertEquals("Strawberry",ic2.getFlavour());
		
		IceCream ic3 = icf.getIceCream("black current");
		log.debug(ic3.getFlavour());
		assertEquals("Black Current",ic3.getFlavour());
		
	}
}