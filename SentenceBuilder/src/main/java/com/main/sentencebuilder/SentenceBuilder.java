package com.main.sentencebuilder;
import java.util.ArrayList;
import java.util.Arrays;

public class SentenceBuilder {
	// List in which i add only the verbs
	private ArrayList<Word> verbs = new ArrayList<>();
	// List in which i add only the nouns
	private ArrayList<Word> nouns = new ArrayList<>();
	private DictionaryInitiliazer dictionary = new DictionaryInitiliazer();

	// Method to print the lists
	public void print() {
		System.out.print("Verbs:\n");
		System.out.print(Arrays.toString(verbs.toArray()) + "\n");
		System.out.print("Nouns:\n");
		System.out.print(Arrays.toString(nouns.toArray()) + "\n");
	}

	// Helper function to check the word type and put it into the correct list
	private void addWords(ArrayList<Word> list) {
		for (Word word : list) {
			if (word.getType() == WordType.NOUN) {
				this.nouns.add(word);
			}
			if (word.getType() == WordType.VERB) {
				this.verbs.add(word);
			}
		}

	}
	
	public int getVerbsSize() {
		return this.verbs.size();
	}
	
	public int getNounsSize() {
		return this.nouns.size();
	}

	// Checking if substring makes word,that the array contains
	public void checkSentence(String sentence) {
		ArrayList<Word> list = new ArrayList<>();
		for (int i = 0; i < sentence.length(); i++) {
			for (int j = i + 1; j <= sentence.length(); j++) {
				// If the substring matches a word from the array,put the word into a list
				if (this.dictionary.findWord(sentence.substring(i, j)) != null) {
					list.add(this.dictionary.findWord(sentence.substring(i, j)));
				}
			}
		}
		// Check the types of the mathing words and add it into the lists
		this.addWords(list);
	}

	private void printNouns() {
		if (!nouns.isEmpty()) {
			System.out.print(nouns.get(0).getWord() + " ");
			nouns.remove(0);
		}
	}

	private void printVerbs() {
		if (!verbs.isEmpty()) {
			System.out.print(verbs.get(0).getWord() + " ");
			verbs.remove(0);
		}
	}

	// Bussiness logic
	public void displaySentence() {
		System.out.print("Sentence:\n");
		// If verbs are more than nouns
		// Print it like this : <noun> <verb> <verb> ...
		if (verbs.size() > nouns.size()) {
			while (!verbs.isEmpty() && !nouns.isEmpty()) {
				this.printNouns();
				this.printVerbs();
				this.printVerbs();
			}

			if (!nouns.isEmpty()) {
				while (!nouns.isEmpty()) {
					this.printNouns();
				}
			}

			if (!verbs.isEmpty()) {
				while (!verbs.isEmpty()) {
					this.printVerbs();
				}
			}
		// If not : <noun> <verb> <noun> <verb> ...
		} else {
			while (!verbs.isEmpty() && !nouns.isEmpty()) {
				this.printNouns();
				this.printVerbs();
			}

			if (!nouns.isEmpty()) {
				while (!nouns.isEmpty()) {
					this.printNouns();
				}
			}

			if (!verbs.isEmpty()) {
				while (!verbs.isEmpty()) {
					this.printVerbs();
				}
			}
		}
	}

}
