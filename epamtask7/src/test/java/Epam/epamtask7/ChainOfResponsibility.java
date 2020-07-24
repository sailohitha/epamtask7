package Epam.epamtask7;

import junit.framework.TestCase;

import Epam.epamtask7.YearMod100;
import Epam.epamtask7.YearMod4;
import Epam.epamtask7.YearMod400;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import Epam.epamtask7.Process;

public class  ChainOfResponsibility {
	@Test
	public void chainOfResponsibility() {
		YearMod400 p1 = new YearMod400();
		YearMod100 p2 = new YearMod100();
		YearMod4 p3 = new YearMod4();

		

		assertTrue(p1.process(2016));
		assertFalse(p1.process(2017));
		assertFalse(p1.process(1700));
	}
}