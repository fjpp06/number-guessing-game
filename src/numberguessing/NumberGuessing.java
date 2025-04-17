package numberguessing;

import javax.swing.*;

public class NumberGuessing {
	public static void main(String args[]) {
		JOptionPane.showMessageDialog(null, " Hi.\n Lets play Number Guessing Game.\n Press \"OK\" when ready!");
		String [] difficulty = new String[3];
		difficulty[0] = EASY;
		difficulty[1] = MEDIUM;
		difficulty[2] = HARD;
		
		Object selectedDifficulty = JOptionPane.showInputDialog(null, "Choose game difficulty!", "Dificulty Selection", JOptionPane.QUESTION_MESSAGE, null, difficulty, EASY);
		
		if (selectedDifficulty == EASY) {
			JOptionPane.showMessageDialog(null, " Great! You have selected the "+selectedDifficulty+" difficulty level.\n You have 10 chances to guess.");
		} else if (selectedDifficulty == MEDIUM) {
			JOptionPane.showMessageDialog(null, " Great! You have selected the "+selectedDifficulty+" difficulty level.\n You have 5 chances to guess.");
		} else {
			JOptionPane.showMessageDialog(null, " Great! You have selected the "+selectedDifficulty+" difficulty level.\n You have 3 chances to guess.");
		}
		JOptionPane.showMessageDialog(null, " Let's start the game!");
		Game.gameLogic(selectedDifficulty);
	
	}
	public static final String EASY = "Easy";
	public static final String MEDIUM = "Medium";
	public static final String HARD = "Hard";
}
