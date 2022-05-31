package Classes;
import java.util.Random;

public class Chores {

	public static void main(String[] args) {

		Random r = new Random();
		String[] siblings = { "Ann", "Bob", "Carrie", "Dan", "Eve" };

		int numOfSiblings = siblings.length;
		int turn = r.nextInt(numOfSiblings);
		String chores = String.format("It's %s's turn to do the chores!", siblings[turn]);

		System.out.println(chores);
	}
}
