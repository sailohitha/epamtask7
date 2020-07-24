package Epam.epamtask7;

import junit.framework.TestCase;
import static org.junit.Assert.assertEquals;

import org.junit.Test;

import epamtask7_4.HpIndianCharger;
import epamtask7_4.HpUsCharger;
import epamtask7_4.UsToIndiaAdapter;

public class AdapterTest {
	@Test
	public void adapterTest1() {
		HpIndianCharger hI = new HpIndianCharger();
		HpUsCharger hU = new HpUsCharger();
		assertEquals("Indian",hI.fitsWhat());
		assertEquals("US",hU.fitsWhat());
		UsToIndiaAdapter hUI = new UsToIndiaAdapter(hU);
		assertEquals("Indian",hUI.fitsWhat());
	}
}