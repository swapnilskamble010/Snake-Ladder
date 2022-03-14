package day_4;

public class SnakeLadder {
	
	public static void main(String[] args) {
		System.out.println("--Welcome to Snake and Ladder Game--\n\tLet's play..");
		int playerPosition = 0; //start position
		byte dice = (byte)(Math.random()*6 + 1 );
		System.out.println("Dice Show: " + dice);
		byte playerOptions = (byte)(Math.random()*3 );
		
		switch (playerOptions) {
		
		case 0:
			System.out.println("Player choose to Not to Play");
			playerPosition = playerPosition;
			break;
			
		case 1:
			System.out.println("Player played & got a Ladder");
			playerPosition = playerPosition + dice;
			break;
			
		default:
			System.out.println("Player played & got a Snake");
			playerPosition = playerPosition - dice;
			if (playerPosition <= 0) {
				playerPosition = 0;
			}
			break;	
	
		}
		System.out.println("Player is at position : " + playerPosition);
	}

}
