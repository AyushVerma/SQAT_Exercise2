
import java.awt.Point;
import java.util.List;

// Before submitting write your ID and finish time here. Your ID is written on project description sheets.
// ID: 139
// Finish time: 16:27

public class PlanetExplorer {
	Point gridSize = null;
	public Point position = null;
	char facing;
	List<Point> obstacles = null;
	
	
	/*public PlanetExplorer(int x, int y, String obstacles){
		
		gridSize = new Point(x,y);
		this.position = new Point(0,0);
		this.facing = 'N';
		
		obstacl
		
	}*/
	
	
	public PlanetExplorer(int i, int j) {
		gridSize = new Point(i,j);
		this.position = new Point(0,0);
		this.facing = 'N';
	}

	public String executeCommand(String command){
		
		/* The command string is composed of "f" (forward), "b" (backward), "l" (left) and "r" (right)
		 * Example: 
		 * The explorer is on a 100x100 grid at location (0, 0) and facing NORTH. 
		 * The explorer is given the commands "ffrff" and should end up at (2, 2) facing East.
		 
		 * The return string is in the format: "(pos_x,pos_y,facing)(obs1_x,obs1_y)(obs2_x,obs2_y)..(obsN_x,obsN_y)" 
		 * Where pos_x and pos_y are the final coordinates, facing is the current direction the explorer is pointing to (N,S,W,E).
		 * The return string should also contain a list of coordinates of the encountered obstacles. No white spaces.
		 */
		
		if(command.equals("")) {
			
			return getStatus();
			
		}
		
		for(int i=0; i<command.length(); ++i) {
			navigate(command.charAt(i));
		}
		
		return getStatus();
	}

	private void navigate(char command) {
		
		if(command =='r') {
			
			turnRight();

		}
		else if(command =='l') {
			
			turnLeft();

		}
		else if(command =='f') {
			
			moveForward();

		}
		else if(command =='b') {
			
			moveBackward();

		}
		
	}

	private void moveForward() {
		switch(facing) {
		case 'N':  this.position.y = (this.position.y + 1) % 100;
				   break;
		case 'E':  this.position.x = (this.position.x + 1) % 100;
		           break;
		case 'S':  this.position.y = (this.position.y - 1) % 100;
		           if(this.position.y<0) this.position.y += 100;
		   		   break;
		case 'W':  this.position.x = (this.position.x - 1) % 100;
                   if(this.position.x<0) this.position.x += 100;
		           break;
		}
	}

	private void moveBackward() {
		
		switch(facing) {
		case 'N':  this.position.y = (this.position.y - 1) % 100;
				   if(this.position.y<0) this.position.y += 100;
				   break;
				   
		case 'E':  this.position.x = (this.position.x - 1) % 100;
		           if(this.position.x<0) this.position.x += 100;
		           break;
		           
		case 'S':  this.position.y = (this.position.y + 1) % 100;
		   		   break;
		   		   
		case 'W':  this.position.x = (this.position.x + 1) % 100;
		           break;
		           
		}
	}

	private void turnRight() {
		switch(facing) {
		case 'N':  facing = 'E';
				   break;
		case 'E':  facing = 'S';
		           break;
		case 'S':  facing = 'W';
		   		   break;
		case 'W':  facing = 'N';
		           break;
		}
	}

	private void turnLeft() {
		switch(facing) {
		case 'N':  facing = 'W';
				   break;
		case 'E':  facing = 'N';
		           break;
		case 'S':  facing = 'E';
		   		   break;
		case 'W':  facing = 'S';
		           break;
		}
	}

	private String getStatus() {
		return "(" + String.valueOf(this.position.x) + "," + String.valueOf(this.position.y) + "," +String.valueOf(this.facing) + ")";
	}

	public Point getGridSize() {
		return this.gridSize;
	}

	public Object isObstacle(Point point) {
		// TODO Auto-generated method stub
		return null;
	}
	

}
