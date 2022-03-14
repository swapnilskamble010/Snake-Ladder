package day_4;

public class SnakeLadder {
	
	public static void main(String[] args) {
		System.out.println("--Welcome to Snake and Ladder Game--\n\tLet's play..");
		int playerPosition = 0; //start position
		byte dice = (byte)(Math.random()*6 + 1 );
		System.out.println("Dice Show: " + dice);
	}

}
