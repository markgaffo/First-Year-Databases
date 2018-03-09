/*
GuessApp.java
Mark Gaffney
09/03/2018
*/

import java.lang.Math.*;
import java.util.*;
import javax.swing.JOptionPane;
public class GuessApp{
	public static void main(String agrs[]){

		int rNo;
		int guess;

		Guess myGuess;
		myGuess = new Guess();

		guess=Integer.parseInt(JOptionPane.showInputDialog(null, "Guess a number between 1-10"));

		myGuess.compute();


	}
}