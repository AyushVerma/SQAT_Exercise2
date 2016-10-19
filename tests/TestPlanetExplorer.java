import static org.junit.Assert.*;

import java.awt.Point;

import org.junit.Test;

public class TestPlanetExplorer {

	@Test
	public void test_definePlanetWithSize_100_by_100() {
		
		PlanetExplorer pe = new PlanetExplorer(100, 100); 
		
		Point gridSize = pe.getGridSize();;
		
		assertEquals(new Point(100,100), gridSize);
	}
	
	@Test
	public void test_initialLandingStatus_0_0_N() {
		
		PlanetExplorer pe = new PlanetExplorer(100, 100); 
		
		assertEquals("(0,0,N)", pe.executeCommand(""));
	}
	
	@Test
	public void test_explorerTurnsTO_East_() {
		
		PlanetExplorer pe = new PlanetExplorer(100, 100); 
		pe.executeCommand("r");
		assertEquals("(0,0,S)", pe.executeCommand("r"));
	}
	
}
