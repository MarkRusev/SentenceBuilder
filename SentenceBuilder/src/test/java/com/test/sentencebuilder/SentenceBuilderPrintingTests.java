package com.test.sentencebuilder;

import static org.junit.jupiter.api.Assertions.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.main.sentencebuilder.SentenceBuilder;

class SentenceBuilderPrintingTests {
	private SentenceBuilder builder = new SentenceBuilder();
	private final PrintStream standardOut = System.out;
	private final ByteArrayOutputStream outputStreamCaptor = new ByteArrayOutputStream();
	
	@BeforeEach
	void setUp() {
		 this.builder.checkSentence("thisisandexampleformydictionarytest");
		 System.setOut(new PrintStream(outputStreamCaptor));	 
	}

	@Test
	void testGivenSystemOutRedirection_whenInvokePrint_thenOutputCaptor_ShouldPass() {
		this.builder.print();
		assertEquals("Verbs:\n[is, is]\nNouns:\n[This, an, example]", outputStreamCaptor.toString().trim());	
	}
	
	
	@Test
	void testGivenSystemOutRedirection_whenInvokeDisplaySentence_thenOutputCaptor_ShouldPass() {	
		if(this.builder.getVerbsSize() > this.builder.getNounsSize()) {
			this.builder.displaySentence();
			assertEquals("Sentence:\nThis is is an example", outputStreamCaptor.toString().trim());
		}
		else {
			this.builder.displaySentence();
			assertEquals("Sentence:\nThis is an is example", outputStreamCaptor.toString().trim());
		}
	}
		
	@AfterEach
	void destroyOutput() {
		System.setOut(standardOut);
	}

}
