package com.spring.springbootpoc.word;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WordController {

	@RequestMapping("/word")
	public Vocabulary getWord() {
		Vocabulary vocabulary = new Vocabulary();
		vocabulary.setWord("Exquisite");
		vocabulary.setMeaning("Very beautiful");
		vocabulary.setExampleSentence("This house is exquisitely furnished");
		return vocabulary;
	}

}
