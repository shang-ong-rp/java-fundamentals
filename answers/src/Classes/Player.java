package Classes;
import java.util.Random;

public class Player {

	public String username;
	public int score;

	public Player(String username) {
		this.username = username;
		this.score = 0;
	}

	public int play() {
		Random dice = new Random();
		int result = dice.nextInt(6) + 1;
		return result;
	}

	public void increaseScore() {
		score += 1;
	}

	public void show() {
		System.out.println(username + "'s current score: " + score);
	}

}
