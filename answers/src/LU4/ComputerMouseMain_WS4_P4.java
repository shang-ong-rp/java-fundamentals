package LU4;

public class ComputerMouseMain_WS4_P4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ComputerMouse_WS4_P4 mouse1= new ComputerMouse_WS4_P4();
		
		mouse1.brand = "Microsoft";
		mouse1.model = "Arc Mouse";
		mouse1.leftButtonPressed = false;
		mouse1.rightButtonPressed = false;
		mouse1.curX = 20;
		mouse1.curY = 30;
		mouse1.pressLeftButton();
		System.out.println(mouse1.leftButtonPressed);
		String newPosition = mouse1.move(50,50);
		System.out.println(newPosition);

	}
}
