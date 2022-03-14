package day_4;

public class SnakeLadder {
	
	public static void main(String[] args) {
		
		System.out.println("--Welcome to Snake and Ladder Game--\n\tLet's play..");
		int player1Position = 0; //Player 1 start position
		int player2Position = 0; //Player 2 start position
		int CountToWin = 0;
		
		boolean flag = true; //Game Starting with player1
		
		while ((player1Position < 100 && player1Position >=0) && (player2Position < 100 && player2Position >=0)) {
			
			byte dice = (byte)(Math.random()*6 + 1 );
			System.out.println("Dice Show: " + dice);
			byte playerOptions = (byte)(Math.random()*3 );
			
			switch (playerOptions) {
			
			case 0:
				if (flag) {
					System.out.println("Player1 choose to Not to Play");
					flag = false;
				}
				else {
					System.out.println("Player2 choose to Not to Play");
					flag = true;					
				}
				
				break;
				
			case 1:
				if (flag) {
					System.out.println("Player1 played & got a Ladder");
					player1Position = player1Position + dice;
					if (player1Position > 100) {
						player1Position = player1Position - dice;
					}
					flag = true;
				}
				else {
					System.out.println("Player2 played & got a Ladder");
					player2Position = player2Position + dice;
					if (player2Position > 100) {
						player2Position = player2Position - dice;
					}
					flag = false;
				}
				
				break;
				
			default:
				if (flag) {
					System.out.println("Player1 played & got a Snake");
					player1Position = player1Position - dice;
					if (player1Position <= 0) {
						player1Position = 0;
					}
					flag = false;
				}
				else {
					System.out.println("Player2 played & got a Snake");
					player2Position = player2Position - dice;
					if (player2Position <= 0) {
						player2Position = 0;
					}
					flag = true;
				}
				
				break;	
		
			}
			
			CountToWin++;
			System.out.println("Player1 is at position : " + player1Position);
			System.out.println("Player2 is at position : " + player2Position);
				
		}
		
		if (player1Position == 100) {
			System.out.println("Congrats!! Player 1 Won");
		}
		else {
			System.out.println("Congrats!! Player 2 Won");
		}
		
		System.out.println("Number of times dice rolled to Win the Game: " + CountToWin);
		
	}

}
