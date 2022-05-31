package LU4_Classes;


public class DiceRoll2 {

	public static void main(String[] args) {

	
		Player p1 = new Player("barbieD0LL");
		Player p2 = new Player("weaponX88");
		int p1Result = 0;
		int p2Result = 0;
		int rounds = Helper.readInt("Enter number of rounds > ");
		int counter = 0;
		
		
		System.out.println("=== WELCOME TO DICE ROLL ===");
		p1.show();
		p2.show();
		System.out.println();
		System.out.println("START PLAYING!");
		Helper.line(30, "=");
		
		
		while(counter<rounds)
		{
			
			p1Result = p1.play();
			p2Result = p2.play();
			
			counter++;
			
			System.out.println("ROUND "+counter);
			
			System.out.println(p1.username + " rolled "+ p1Result);
			System.out.println(p2.username + " rolled "+ p2Result);
			
			if( p1Result> p2Result)
			{
				p1.increaseScore();
				
				
			}else if(p1Result<p2Result)
			{
				p2.increaseScore();
			}
			
			p1.show();
			p2.show();
			

			Helper.line(30, "-");
			System.out.println();
			
			
			
		}
		
		
		if(p1.score > p2.score)
		{
			System.out.println(p1.username + " wins!");
		}else if(p2.score > p1.score)
		{
			System.out.println(p2.username + " wins!");
		}else {
			System.out.println("It's a draw!");
		}
		
		System.out.println("Thank you for playing!");

	}
	
	

}
