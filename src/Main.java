import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		while(true) {
			Scanner scan = new Scanner(System.in);
			System.out.println("Player 1's turn");
			System.out.println("Choose rock paper or scissors");
			System.out.println("Don't let player 2 see your pick");
			String player1 = scan.nextLine();
			
			if (player1.equals("rock")||player1.equals("paper")||player1.equals("scissors")) {
				System.out.println("Player 2's turn");
				System.out.println("Choose rock paper or scissors");
				String player2 = scan.nextLine();
				
				if (player2.equals("rock")||player2.equals("paper")||player2.equals("scissors")) {
					if (player1.equals(player2)) {
						System.out.println("It's a tie");
					}
					
					switch (player1) {
					
					case "rock":
						if (player2.equals("paper"))
							System.out.println("Player 2 wins");
						else if (player2.equals("scissors"))
							System.out.println("Player 1 wins");
						System.out.println();
						break;
					case "paper":
						if (player2.equals("scissors"))
							System.out.println("Player 2 wins");
						else if (player2.equals("rock"))
							System.out.println("Player 1 wins");
						System.out.println();
						break;
					case "scissors":
						if (player2.equals("rock"))
							System.out.println("Player 2 wins");
						else if (player2.equals("paper"))
							System.out.println("Player 1 wins");
						System.out.println();
						break;
						
					}
				}
				else {
					System.out.println("Choose a valid option");
					System.out.println();
				}
			}
			else {
				System.out.println("Choose a valid option");
				System.out.println();
			}
		
			
		}
	}
}
