import static org.junit.Assert.*;

import java.awt.Point;

import org.junit.Test;

public class TestPlanetExplorer {

	@Test
	public void test_executeCommand() {
		
		PlanetExplorer pe = new PlanetExplorer(100, 100); 
		Point gridSize = pe.getGridSize();;
		
		assertEquals(new Point(100,100), gridSize);

	}
}
