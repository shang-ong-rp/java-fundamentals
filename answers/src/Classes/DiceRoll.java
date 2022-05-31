package Classes;

public class DiceRoll {

	public static void main(String[] args) {

		Player p1 = new Player("barbieD0LL");
		Player p2 = new Player("weaponX88");
		int p1Result = 0;
		int p2Result = 0;
		int rounds = 1;
		char continuePlay = 'y';

		System.out.println("=== WELCOME TO DICE ROLL ===");
		p1.show();
		p2.show();
		System.out.println();
		System.out.println("START PLAYING!");
		Helper.line(30, "=");

		while (continuePlay == 'y') {
			System.out.println("ROUND " + rounds);
			p1Result = p1.play();
			p2Result = p2.play();
			System.out.println(p1.username + " rolled " + p1Result);
			System.out.println(p2.username + " rolled " + p2Result);

			if (p1Result > p2Result) {
				p1.increaseScore();

			} else if (p1Result < p2Result) {
				p2.increaseScore();
			}

			p1.show();
			p2.show();

			continuePlay = Helper.readChar("Continue? (y/n) > ");
			rounds++;
			Helper.line(30, "-");
			System.out.println();

		}

		System.out.println("Thank you for playing!");

	} // end main
} // end class
