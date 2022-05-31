package LU4_Classes;

public class Quiz {

	public static void main(String[] args) {

		String[] pokemon = { "Pikachu", "Eevee", "Snorlax", "Ditto", "Charmander" };

		for (int i = pokemon.length - 1; i >= 0; i--) {
			System.out.println(pokemon[i]);
		}

		int score = Helper.readInt("Enter score > ");

		if (score >= 70) {
			System.out.println("B");
		} else if (score >= 80) {
			System.out.println("A");
		} else if (score >= 60) {
			System.out.println("C");
		} else if (score >= 50) {
			System.out.println("D");
		} else {
			System.out.println("F");
		}

	}
}
