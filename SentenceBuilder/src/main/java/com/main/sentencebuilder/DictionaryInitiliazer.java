package com.main.sentencebuilder;

public class DictionaryInitiliazer implements Dictionary {

	private final static Word[] words = new Word[21];
	
	public DictionaryInitiliazer() {
		words[0] = new Word("This",WordType.NOUN);
		words[1] = new Word("is",WordType.VERB);
		words[2] = new Word("an",WordType.NOUN);
		words[3] = new Word("example",WordType.NOUN);
		words[4] = new Word("run",WordType.VERB);
		words[5] = new Word("eat",WordType.VERB);
		words[6] = new Word("burger",WordType.NOUN);
		words[7] = new Word("pizza",WordType.NOUN);
		words[8] = new Word("computer",WordType.NOUN);
		words[9] = new Word("play",WordType.VERB);
		words[10] = new Word("fitness",WordType.NOUN);
		words[11] = new Word("chair",WordType.NOUN);
		words[12] = new Word("talk",WordType.VERB);
		words[13] = new Word("phone",WordType.NOUN);
		words[14] = new Word("fight",WordType.VERB);
		words[15] = new Word("computer",WordType.NOUN);
		words[16] = new Word("paint",WordType.VERB);
		words[17] = new Word("do",WordType.VERB);		
		words[18] = new Word("read",WordType.VERB);
		words[19] = new Word("write",WordType.VERB);
		words[20] = new Word("sing",WordType.VERB);
	}

	@Override
	public Word findWord(String search) {
		for (Word word : words) {
			if(search.equalsIgnoreCase(word.getWord())) {
				return word;
			}
		}		
		return null;
	}

}
