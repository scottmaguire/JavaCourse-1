import static org.junit.Assert.*;

import org.junit.Test;

public class testMinMax {

	 int array[] = new int[]{10, 11, 88, 2, 12, 120};
	 
	 arrayMinMax myMinMax = new arrayMinMax();
	 
	@Test
	public void testGetMax() {
		
		assertEquals(arrayMinMax.getMax(array), 120);
		
		
	}

	@Test
	public void testGetMin() {
		assertEquals(arrayMinMax.getMin(array), 2);
		
	}

}
