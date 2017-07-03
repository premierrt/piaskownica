package piaskownica;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class CenyTest {

	private double itemProductGross[];
	
	@Before
	public void init (){
		itemProductGross= new double[2];
		itemProductGross[0]=1.1;
		itemProductGross[1]=1.2;
	}
	
	@Test
	public void testDeliveryPrice() {
		double suma=0;	
		for( double i : itemProductGross){
				suma +=i;
			}
		assertEquals(2.3, suma, 0.1);
	}

}
