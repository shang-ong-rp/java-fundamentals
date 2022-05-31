package LU4;

//Worksheet 4 Demonstration code of methods
public class Demo_EmergencyAgent {

	public void displayInfo(int level, String msg){
	    System.out.println("System information level " + level + ":");
	    System.out.println(msg);
	}

	public void activateLevel0(){
	    displayInfo(0, "Start 24-hours close watch! ");
	}

	public void activateLevel1(){
	    displayInfo(1, "Inform emergency team to standby! ");
	}

	public void activateLevel2(){
	    displayInfo(2, 
        "Activate emergency team to take immediate action!");
	}

	public static void main(String[] args) {
	    Demo_EmergencyAgent ea = new Demo_EmergencyAgent();
	    ea.displayInfo(0, "Start 24-hours close watch! ");
	    ea.activateLevel1();
	    ea.activateLevel2();
	} // end Main

} // end Class
