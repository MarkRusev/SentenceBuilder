package com.test.sentencebuilder;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.Before;

import com.main.sentencebuilder.DictionaryInitiliazer;
import com.main.sentencebuilder.Word;
import com.main.sentencebuilder.WordType;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class DictionaryTest {
	private DictionaryInitiliazer dictionary;
	
	@BeforeEach
	void init() {
		this.dictionary = new DictionaryInitiliazer();
	}
	
	@Test
	void testFindingWordInDictionary_NullParameter_ShouldThrowException() {
		assertThrows(NullPointerException.class, () -> this.dictionary.findWord(null));
	}

	@Test
	void testFindingWordInDictionaryComparingTwoWords_ShouldPass() {	
		
        Word expectedWord = new Word();
        expectedWord.setWord("pizza");
        expectedWord.setType(WordType.NOUN);
		
		Word actualWord = dictionary.findWord("pizza");
		
	    assertEquals(expectedWord.getWord(),actualWord.getWord());
		
	}
	
	@Test
	void testFindingWordInDictionaryComparingTwoWords_ShouldNotPass() {		
		
        Word expectedWord = new Word();
        expectedWord.setWord("deck");
        expectedWord.setType(WordType.NOUN);
        
		
		Word actualWord = dictionary.findWord("deck");
		
	    assertEquals(expectedWord.getWord(),actualWord.getWord());
		
	}

}
