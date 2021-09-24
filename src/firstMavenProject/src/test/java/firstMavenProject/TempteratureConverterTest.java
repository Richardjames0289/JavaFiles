package firstMavenProject;

import static org.junit.Assert.assertEquals;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class TempteratureConverterTest {
	
	TemperatureConverter c;

	@BeforeClass
	public static void beforeClassTest() {
		System.out.println("Initial test run");

	}
	
	@Before
	public void init() {
	c = new TemperatureConverter();
	}
	
	
	@Test
	public void convertFahrenheitToCelsiusTest() {
		int Farhenheit = 50;
		
		float sum = c.convertFahrenheitToCelsius(Farhenheit);
		assertEquals(10,sum, 0.001);
		
		}
		
	@Test
	public void convertCelsiusToFahrenheitTest() {
		int celsius = 50;
		
		
		float sum = c.convertFahrenheitToCelsius(celsius);
		assertEquals(147.6,sum, 0.001);
		
		}
	
	@Test
	public void convertKelvinToCelsiusTest() {
		int kelvin = 50;
		
		
		float sum = c.convertKelvinToCelsius(kelvin);
		assertEquals(-223,sum, 0.001);
		
		}
	
	@Test
	public void convertCelsiusToKelvinTest() {
		int celsius = 50;
		
		
		float sum = c.convertCelsiusToKelvin(celsius);
		assertEquals(323,sum, 0.001);
		
		}
		
	@Test
	public void convertKelvinToFahrenheitTest() {
		int kelvin = 50;
		
		
		float sum = c.convertKelvinToFahrenheit(kelvin);
		assertEquals(-396,sum, 0.1);
		
		
		
				
		
	        
	    }
}



