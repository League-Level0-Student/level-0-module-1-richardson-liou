package _12_badgers;

import javax.swing.JOptionPane;

public class badgers {
public static void main(String[] args) {
	for (int i = 0; i < 29;i++) {
		if(i <11) {
			System.out.println("Badger");
		}
		if(i == 11) {
			System.out.println("Mushroom");
		}
		if(i >11 && i <22) {
			System.out.println("Badger");
		}
		if(i>23 && i<29 ) {
			System.out.println("Snake");
		}
	}
}
}
