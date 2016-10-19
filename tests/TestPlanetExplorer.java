import static org.junit.Assert.*;

import java.awt.Point;

import org.junit.Test;

public class TestPlanetExplorer {

	@Test
	public void test_definePlanetWithSize_100_by_100() {
		
		PlanetExplorer pe = new PlanetExplorer(55, 55); 
		
		Point gridSize = pe.getGridSize();;
		
		assertEquals(new Point(55,55), gridSize);
	}
	
	
}
