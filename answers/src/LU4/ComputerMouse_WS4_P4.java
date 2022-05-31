package LU4;

//Worksheet 4 Practice 4
public class ComputerMouse_WS4_P4 {
	
	//Exercise 1
	public String brand;
	public String model;
	public boolean leftButtonPressed;
	public boolean rightButtonPressed;
	public int curX;
	public int curY;
		
	public void pressRightButton() {
		rightButtonPressed = true;
	}
	
	public void releaseRightButton() {
		rightButtonPressed = false;
	}
	
	public void pressLeftButton() {
		leftButtonPressed = true;
	}
	
	public void releaseLeftButton() {
		leftButtonPressed = false;
	}
	
	public String move(int curX,int curY) {
		String position="(" + curX + "," + curY +")";
		return position;
	}

}
