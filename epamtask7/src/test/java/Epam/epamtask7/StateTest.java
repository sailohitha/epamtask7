package Epam.epamtask7;

import junit.framework.TestCase;
import static org.junit.Assert.assertEquals;

import org.junit.Test;

import epamtaks7_1.Circle;
import epamtaks7_1.DrawingTool;
import epamtaks7_1.Rectangle;

public class StateTest {
	@Test
	public void stateTest1() {
		DrawingTool dt = new DrawingTool(new Rectangle());
		assertEquals("Drawing Rectangle",dt.draw());
		dt.setShape(new Circle());
		assertEquals("Drawing Circle", dt.draw());
	}
}