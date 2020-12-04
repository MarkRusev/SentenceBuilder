package com.main.sentencebuilder;
import java.util.Scanner;

public class Main {
	// Application to find the words in a string,which are staticly initialized in a array
	// 

	public static void main(String[] args) {
		SentenceBuilder sb = new SentenceBuilder();
		Scanner input = new Scanner(System.in);
		String randomString;
		
		randomString = input.nextLine();
		input.close();
		

	    sb.checkSentence(randomString);
	    sb.print();
	    sb.displaySentence();
	}
}
