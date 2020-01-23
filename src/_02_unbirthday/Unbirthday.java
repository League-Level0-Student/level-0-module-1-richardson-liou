package _02_unbirthday;

import javax.swing.JOptionPane;

public class Unbirthday {
	public static void main(String[] args) {
	String day = JOptionPane.showInputDialog("What day is it today");
String birthday = JOptionPane.showInputDialog("When is your birthday");


	if (birthday.equals (day)){
		JOptionPane.showMessageDialog(null, "Happy Birthday");
	}
	else {
		JOptionPane.showMessageDialog(null, "Happy Unbirthday");
	}
	}

}
