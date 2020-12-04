package com.test.sentencebuilder;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.main.sentencebuilder.SentenceBuilder;

class SentenceBuilderCheckSentenceTest {
	private SentenceBuilder sentence = new SentenceBuilder();

	
	@BeforeEach
	void set_Up() {
		this.sentence.checkSentence("thisisandexampleformydictionarytest");
	}

	
	@Test
	void testCheckSentence_NullParameter_ShouldThrowException() {		
		assertThrows(NullPointerException.class, () -> this.sentence.checkSentence(null));
	}

	
	// If there is known words add them to verb and noun lists, then check if lists are with the expected result size
	@Test
	void testCheckSentenceUsingVerbsSize_ShouldPass() {
	   
	   int expectedVerbsSize = 2;	  
	   
	   int actualVerbsSize = sentence.getVerbsSize();
	     
	   assertEquals(expectedVerbsSize, actualVerbsSize);
	  
	}
	
	
	// If there is known words add them to verb and noun lists, then check if lists are with the expected result size
	@Test
	void testCheckSentenceUsingNounsSize_ShouldPass() {
		
		int expectedNounsSize = 3;
		
		int actualNounsSize = sentence.getNounsSize();
		
		assertEquals(expectedNounsSize, actualNounsSize);
	}

}
