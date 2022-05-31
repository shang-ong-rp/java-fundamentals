package LU7;
import java.util.ArrayList;

public class CarMain {

	public static void main(String[] args) {

		Car[] carArr = new Car[5];

		carArr[0] = new Car("KL123K", "white", 10);
		carArr[1] = new Car("SFT789X", "red", 50);
		carArr[2] = new Car("JB345M", "blue", 50);

		for (int i = 0; i < carArr.length; i++) {
			System.out.println(carArr[i].getLicenseNo());
		}

		ArrayList<Car> carList = new ArrayList<Car>();

		carList.add(new Car("KL123K", "white", 10));
		carList.add(new Car("SFT789X", "red", 50));
		carList.add(new Car("JB345M", "blue", 50));

		for (int i = 0; i < carList.size(); i++) {
			System.out.println(carList.get(i).getLicenseNo());
		}

	}

}
