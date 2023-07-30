package tests;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;

import java.io.IOException;

import org.junit.jupiter.api.Test;

import bo.PrepareFileControlsBO;
import utils.Utils;

class test {

	@Test
	public void existFiletest() {
		assertFalse(Utils.existFile(" "));		
	}
	
	@Test
	public void calculateTest() throws IOException {
		assertEquals(0,PrepareFileControlsBO.prepareFileCommnadsTrip("",true).getAim());
	}
	
	
	@Test
	public void addValueTest() {
		int val1=1;
		int val2=2;		
		assertEquals(3, Utils.addValue(val1, val2));
		
	}
	
	@Test
	public void substractValueTest() {
		int val1=4;
		int val2=2;		
		assertEquals(2, Utils.substractValue(val1, val2));
		
	}
	
	@Test
	public void multiplyValueTest() {
		int val1=4;
		int val2=2;		
		assertEquals(8, Utils.multiplyValue(val1, val2));
		
	}
}
