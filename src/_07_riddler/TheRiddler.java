package _07_riddler;
//    Copyright (c) The League of Amazing Programmers 2013-2019
//    Level 0

import javax.swing.JOptionPane;

public class TheRiddler {

	public static void main(String[] args) {

		// 1. Make a variable to hold the score
int score = 0;
		// 3. Ask the user a riddle. Here are some ideas: bit.ly/some-riddles
String answer1 = JOptionPane.showInputDialog("It can be as small as an ant or as big as an elephant, but the buyer does not own it.");
		// 4. If they got the answer right, pop up "correct!" and increase the score by one
if (answer1.equals("a present")) {
	JOptionPane.showMessageDialog(null, "Correct well done!");
	score = score +1;
	JOptionPane.showMessageDialog(null, "Your score is " + score);
}
else {
	JOptionPane.showMessageDialog(null, "Better luck time!");
	JOptionPane.showMessageDialog(null, "The answer was a present because the reciever owns it.");
}
		// 5. Otherwise, say "wrong" and tell them the answer

		// 6. Add some more riddles
String answer2 = JOptionPane.showInputDialog("I'm tall when I'm young and I'm short when I'm old. What am I?");
if (answer2.equals("a candle")) {
	JOptionPane.showMessageDialog(null, "Correct well done!");
	score = (score +1);
	JOptionPane.showMessageDialog(null, "Your score is " + score);
}
	else {
		JOptionPane.showMessageDialog(null, "Better luck time!");
		JOptionPane.showMessageDialog(null, "The answer is candle because the wax melts");
		// 2. Make a pop up to show the score.
		JOptionPane.showMessageDialog(null, "Congratulations you have a score of " +score );
	}
}
}

