package tests;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

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
		assertNull(PrepareFileControlsBO.prepareFileCommnadsTrip("",true));
	}
}
