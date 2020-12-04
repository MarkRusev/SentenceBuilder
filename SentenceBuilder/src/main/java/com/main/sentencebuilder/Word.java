package com.main.sentencebuilder;
public class Word {
	private String word;
	private WordType type;
	
	public Word() {
		// TODO Auto-generated constructor stub
	}
	
	public Word(String word, WordType type){
        this.setWord(word);
        this.setType(type);     
    }

    public WordType getType() {
        return type;
    }

    public void setType(WordType type) {
        this.type = type;
    }

    public String getWord() {
        return word;
    }

    public void setWord(String word) {
        this.word = word;
    }
    
	@Override
	public String toString() {
		return this.word;
	}

}
