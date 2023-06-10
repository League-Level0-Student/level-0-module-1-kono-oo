package _04_int._1_riddler;

import javax.swing.JOptionPane;

//    Copyright (c) The League of Amazing Programmers 2013-2019
//    Level 0



public class TheRiddler {

	public static void main(String[] args) {

		// 1. Make a variable to hold the score
		int score = 0;
		String ans = "stamp";
		// 3. Ask the user a riddle. Here are some ideas: bit.ly/some-riddles
		String guess = JOptionPane.showInputDialog("What can travel around the world while staying in a corner?");
		// 4. If they got the answer right, pop up "correct!" and increase the score by one
		if(guess.equals(ans)) {
			JOptionPane.showMessageDialog(null, "correct!!");
			score +=1;
		}
		else {
			JOptionPane.showMessageDialog(null, "Wrong !! The answer is: "+ ans);
		}
		JOptionPane.showMessageDialog(null, score);
		// 5. Otherwise, say "wrong" and tell them the answer

		// 6. Add some more riddles

		// 2. Make a pop up to show the score.
		
	}
}

