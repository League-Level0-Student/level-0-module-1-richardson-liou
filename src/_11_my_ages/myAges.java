package _11_my_ages;

import javax.swing.JOptionPane;

public class myAges {
public static void main(String[] args) {
	int age = 0;
	for (int i = 0; i < 13; i++) {
		
		age = age + 1;
		JOptionPane.showMessageDialog(null,"You are " +age);
	}
}
}
