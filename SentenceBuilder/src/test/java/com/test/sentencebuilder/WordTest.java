package com.test.sentencebuilder;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.main.sentencebuilder.Word;
import com.main.sentencebuilder.WordType;

class WordTest {

	@Test
	void testGetterAndSetterWordType_ShouldPass() {
		Word word = new Word();
		
		word.setType(WordType.NOUN);
		
		
		assertEquals(WordType.NOUN, word.getType());
		
	}
	
	
	
	@Test
	void testGetterAndSetterWord_ShouldPass() {
		Word word = new Word();	
		
		word.setWord("run");
		
		assertEquals("run", word.getWord());
		
	}

}
