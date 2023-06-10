package _03_if_else._2_remarkable;
//    Copyright (c) The League of Amazing Programmers 2013-2019
//    Level 0

import javax.swing.JOptionPane;

public class Remarkable {
public static void main(String[] args) {

		// 1. Save something remarkable about each person in a variable.
		String a = "smart";
		String b = "kind";
		String c = "athletic";
		String remarkable = "";
		// 2. Ask the user to enter a name. Store their answer in a variable.
		String userName = JOptionPane.showInputDialog("Please enter your name.");
		// 3. In a pop-up, tell the user what is remarkable about that person. 
		if(userName.equals("a")) {
			remarkable = a;
		}
		else if(userName.equals("b")) {
			remarkable = b;
		}
		else if(userName.equals("c")) {
			remarkable = c;
		}
		else {
			remarkable = "Sorry, your name is unremarkable";
		}
		JOptionPane.showMessageDialog(null, "Your remarkable trait is: "+remarkable);
	}
}

