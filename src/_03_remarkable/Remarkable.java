package _03_remarkable;
//    Copyright (c) The League of Amazing Programmers 2013-2019
//    Level 0

import javax.swing.JOptionPane;

public class Remarkable {
public static void main(String[] args) {

		// 1. Save something remarkable about each person in a variable.
String remark = ("tall");
String jackieRemark = ("smart");
String bobRemark = ("fast");
String leoRemark = ("friendly");
		// 2. Ask the user to enter a name. Store their answer in a variable.
String name = JOptionPane.showInputDialog("Tell me a name");
		// 3. In a pop-up, tell the user what is remarkable about that person. 
if (name.equals("Joe")) {
JOptionPane.showMessageDialog(null, name + " is pretty " + remark + ".");
}

if (name.equals("Jackie")) {
	JOptionPane.showMessageDialog(null, name + " is pretty " + jackieRemark);
}
if (name.equals("Bob")) {
	JOptionPane.showMessageDialog(null, name + " is pretty " + bobRemark);
}
if (name.equals("Leo")) {
	JOptionPane.showMessageDialog(null, name + " is pretty " + leoRemark);
}

	}
}

