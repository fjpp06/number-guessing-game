package numberguessing;

import javax.swing.*;

public class Game {
	public static void gameLogic(Object selectedDifficulty) {
		int chances = 0;
		int guessCount = 0;
		if (selectedDifficulty == NumberGuessing.EASY) chances = 10;
		if (selectedDifficulty == NumberGuessing.MEDIUM) chances = 5;
		if (selectedDifficulty == NumberGuessing.HARD) chances = 3;
		
		int randomNumber = (int)(Math.random() * 101);
		System.out.println(randomNumber);
		
		while (chances > 0) {
			int userGuess = Integer.parseInt(JOptionPane.showInputDialog(null, " Enter your guess (0 to 100):"));
			guessCount++;
			chances--;
			if (userGuess > randomNumber) {
				JOptionPane.showMessageDialog(null, " Your guess is higher. You have "+chances+" chances left.");
			} else if (userGuess < randomNumber) {
				JOptionPane.showMessageDialog(null, " Your guess is lower. You have "+chances+" chances left.");
			} else {
				JOptionPane.showMessageDialog(null, " Congratulations! You have guessed the correct number in "+guessCount+" guess(es)!");
				JOptionPane.showMessageDialog(null, " The game is over. I hope you had fun! cya soon <3");
				break;
			}
			
		}
	}
}
