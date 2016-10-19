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
	public void test_explorerTurnsTO_Right_() {
		
		PlanetExplorer pe = new PlanetExplorer(100, 100); 
		assertEquals("(0,0,E)", pe.executeCommand("r"));
	}
	
	@Test
	public void test_explorerTurnsTO_Left_() {
		
		PlanetExplorer pe = new PlanetExplorer(100, 100); 
		assertEquals("(0,0,W)", pe.executeCommand("l"));
	}
	
	@Test
	public void test_explorerMove_Forward() {
		
		PlanetExplorer pe = new PlanetExplorer(100, 100); 
		assertEquals("(0,1,N)", pe.executeCommand("f"));
	}
	
	@Test
	public void test_explorerMove_Backward() {
		
		PlanetExplorer pe = new PlanetExplorer(100, 100);
		pe.executeCommand("f");
		pe.executeCommand("f");
		assertEquals("(0,1,N)", pe.executeCommand("b"));
	}
}
