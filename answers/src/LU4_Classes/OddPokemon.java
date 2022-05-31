package LU4_Classes;

public class OddPokemon {

	public static void main(String[] args) {
		String[] pokemon = { "Bulbasaur", "Squirtle", "Butterfree", "Weedle", "Pidgey", "Rattata" };

		// Display all pokemon in reverse
//		int a = pokemon.length - 1;
//		while (a >= 0) {
//			System.out.println(pokemon[a]);
//			a--;
//		}

		// Display pokemon with odd number of characters
		for (int i = 0; i < pokemon.length; i++) {
			if (pokemon[i].length() % 2 != 0) {
				System.out.println(pokemon[i]);
			}
		}
	}
}
