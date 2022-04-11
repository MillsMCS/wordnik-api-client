package edu.mills.cs180a.wordnik.client.api;

import edu.mills.cs180a.wordnik.client.invoker.ApiClient;
import edu.mills.cs180a.wordnik.client.model.AudioFile;
import edu.mills.cs180a.wordnik.client.model.Bigram;
import edu.mills.cs180a.wordnik.client.model.Definition;
import edu.mills.cs180a.wordnik.client.model.Example;
import edu.mills.cs180a.wordnik.client.model.ExampleSearchResults;
import edu.mills.cs180a.wordnik.client.model.FrequencySummary;
import edu.mills.cs180a.wordnik.client.model.Related;
import edu.mills.cs180a.wordnik.client.model.Syllable;
import edu.mills.cs180a.wordnik.client.model.TextPron;
import org.junit.Before;
import org.junit.Test;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


/**
 * API tests for WordApi
 */
public class WordApiTest {

    private WordApi api;


    @Before
    public void setup() {
        api = new ApiClient().buildClient(WordApi.class);
    }

    
    /**
     * Fetches audio metadata for a word.
     *
     * The metadata includes a time-expiring fileUrl which allows reading the audio file directly from the API.  Currently only audio pronunciations from the American Heritage Dictionary in mp3 format are supported.
     */
    @Test
    public void getAudioTest() {
        String word = null;
        String useCanonical = null;
        Integer limit = null;
        // List<AudioFile> response = api.getAudio(word, useCanonical, limit);

        // TODO: test validations
    }

    /**
     * Fetches audio metadata for a word.
     *
     * The metadata includes a time-expiring fileUrl which allows reading the audio file directly from the API.  Currently only audio pronunciations from the American Heritage Dictionary in mp3 format are supported.
     *
     * This tests the overload of the method that uses a Map for query parameters instead of
     * listing them out individually.
     */
    @Test
    public void getAudioTestQueryMap() {
        String word = null;
        WordApi.GetAudioQueryParams queryParams = new WordApi.GetAudioQueryParams()
            .useCanonical(null)
            .limit(null);
        // List<AudioFile> response = api.getAudio(word, queryParams);

    // TODO: test validations
    }
    
    /**
     * Return definitions for a word
     *
     * 
     */
    @Test
    public void getDefinitionsTest() {
        String word = null;
        Integer limit = null;
        String partOfSpeech = null;
        String includeRelated = null;
        List<String> sourceDictionaries = null;
        String useCanonical = null;
        String includeTags = null;
        // List<Definition> response = api.getDefinitions(word, limit, partOfSpeech, includeRelated, sourceDictionaries, useCanonical, includeTags);

        // TODO: test validations
    }

    /**
     * Return definitions for a word
     *
     * 
     *
     * This tests the overload of the method that uses a Map for query parameters instead of
     * listing them out individually.
     */
    @Test
    public void getDefinitionsTestQueryMap() {
        String word = null;
        WordApi.GetDefinitionsQueryParams queryParams = new WordApi.GetDefinitionsQueryParams()
            .limit(null)
            .partOfSpeech(null)
            .includeRelated(null)
            .sourceDictionaries(null)
            .useCanonical(null)
            .includeTags(null);
        // List<Definition> response = api.getDefinitions(word, queryParams);

    // TODO: test validations
    }
    
    /**
     * Fetches etymology data
     *
     * 
     */
    @Test
    public void getEtymologiesTest() {
        String word = null;
        String useCanonical = null;
        // List<String> response = api.getEtymologies(word, useCanonical);

        // TODO: test validations
    }

    /**
     * Fetches etymology data
     *
     * 
     *
     * This tests the overload of the method that uses a Map for query parameters instead of
     * listing them out individually.
     */
    @Test
    public void getEtymologiesTestQueryMap() {
        String word = null;
        WordApi.GetEtymologiesQueryParams queryParams = new WordApi.GetEtymologiesQueryParams()
            .useCanonical(null);
        // List<String> response = api.getEtymologies(word, queryParams);

    // TODO: test validations
    }
    
    /**
     * Returns examples for a word
     *
     * 
     */
    @Test
    public void getExamplesTest() {
        String word = null;
        String includeDuplicates = null;
        String useCanonical = null;
        Integer skip = null;
        Integer limit = null;
        // ExampleSearchResults response = api.getExamples(word, includeDuplicates, useCanonical, skip, limit);

        // TODO: test validations
    }

    /**
     * Returns examples for a word
     *
     * 
     *
     * This tests the overload of the method that uses a Map for query parameters instead of
     * listing them out individually.
     */
    @Test
    public void getExamplesTestQueryMap() {
        String word = null;
        WordApi.GetExamplesQueryParams queryParams = new WordApi.GetExamplesQueryParams()
            .includeDuplicates(null)
            .useCanonical(null)
            .skip(null)
            .limit(null);
        // ExampleSearchResults response = api.getExamples(word, queryParams);

    // TODO: test validations
    }
    
    /**
     * Returns syllable information for a word
     *
     * 
     */
    @Test
    public void getHyphenationTest() {
        String word = null;
        String useCanonical = null;
        String sourceDictionary = null;
        Integer limit = null;
        // List<Syllable> response = api.getHyphenation(word, useCanonical, sourceDictionary, limit);

        // TODO: test validations
    }

    /**
     * Returns syllable information for a word
     *
     * 
     *
     * This tests the overload of the method that uses a Map for query parameters instead of
     * listing them out individually.
     */
    @Test
    public void getHyphenationTestQueryMap() {
        String word = null;
        WordApi.GetHyphenationQueryParams queryParams = new WordApi.GetHyphenationQueryParams()
            .useCanonical(null)
            .sourceDictionary(null)
            .limit(null);
        // List<Syllable> response = api.getHyphenation(word, queryParams);

    // TODO: test validations
    }
    
    /**
     * Fetches bi-gram phrases for a word
     *
     * 
     */
    @Test
    public void getPhrasesTest() {
        String word = null;
        Integer limit = null;
        Integer wlmi = null;
        String useCanonical = null;
        // List<Bigram> response = api.getPhrases(word, limit, wlmi, useCanonical);

        // TODO: test validations
    }

    /**
     * Fetches bi-gram phrases for a word
     *
     * 
     *
     * This tests the overload of the method that uses a Map for query parameters instead of
     * listing them out individually.
     */
    @Test
    public void getPhrasesTestQueryMap() {
        String word = null;
        WordApi.GetPhrasesQueryParams queryParams = new WordApi.GetPhrasesQueryParams()
            .limit(null)
            .wlmi(null)
            .useCanonical(null);
        // List<Bigram> response = api.getPhrases(word, queryParams);

    // TODO: test validations
    }
    
    /**
     * Given a word as a string, returns relationships from the Word Graph
     *
     * 
     */
    @Test
    public void getRelatedWordsTest() {
        String word = null;
        String useCanonical = null;
        String relationshipTypes = null;
        Integer limitPerRelationshipType = null;
        // List<Related> response = api.getRelatedWords(word, useCanonical, relationshipTypes, limitPerRelationshipType);

        // TODO: test validations
    }

    /**
     * Given a word as a string, returns relationships from the Word Graph
     *
     * 
     *
     * This tests the overload of the method that uses a Map for query parameters instead of
     * listing them out individually.
     */
    @Test
    public void getRelatedWordsTestQueryMap() {
        String word = null;
        WordApi.GetRelatedWordsQueryParams queryParams = new WordApi.GetRelatedWordsQueryParams()
            .useCanonical(null)
            .relationshipTypes(null)
            .limitPerRelationshipType(null);
        // List<Related> response = api.getRelatedWords(word, queryParams);

    // TODO: test validations
    }
    
    /**
     * Returns the Scrabble score for a word
     *
     * 
     */
    @Test
    public void getScrabbleScoreTest() {
        String word = null;
        // Long response = api.getScrabbleScore(word);

        // TODO: test validations
    }

    
    /**
     * Returns text pronunciations for a given word
     *
     * 
     */
    @Test
    public void getTextPronunciationsTest() {
        String word = null;
        String useCanonical = null;
        String sourceDictionary = null;
        String typeFormat = null;
        Integer limit = null;
        // List<TextPron> response = api.getTextPronunciations(word, useCanonical, sourceDictionary, typeFormat, limit);

        // TODO: test validations
    }

    /**
     * Returns text pronunciations for a given word
     *
     * 
     *
     * This tests the overload of the method that uses a Map for query parameters instead of
     * listing them out individually.
     */
    @Test
    public void getTextPronunciationsTestQueryMap() {
        String word = null;
        WordApi.GetTextPronunciationsQueryParams queryParams = new WordApi.GetTextPronunciationsQueryParams()
            .useCanonical(null)
            .sourceDictionary(null)
            .typeFormat(null)
            .limit(null);
        // List<TextPron> response = api.getTextPronunciations(word, queryParams);

    // TODO: test validations
    }
    
    /**
     * Returns a top example for a word
     *
     * 
     */
    @Test
    public void getTopExampleTest() {
        String word = null;
        String useCanonical = null;
        // Example response = api.getTopExample(word, useCanonical);

        // TODO: test validations
    }

    /**
     * Returns a top example for a word
     *
     * 
     *
     * This tests the overload of the method that uses a Map for query parameters instead of
     * listing them out individually.
     */
    @Test
    public void getTopExampleTestQueryMap() {
        String word = null;
        WordApi.GetTopExampleQueryParams queryParams = new WordApi.GetTopExampleQueryParams()
            .useCanonical(null);
        // Example response = api.getTopExample(word, queryParams);

    // TODO: test validations
    }
    
    /**
     * Returns word usage over time
     *
     * 
     */
    @Test
    public void getWordFrequencyTest() {
        String word = null;
        String useCanonical = null;
        Integer startYear = null;
        Integer endYear = null;
        // FrequencySummary response = api.getWordFrequency(word, useCanonical, startYear, endYear);

        // TODO: test validations
    }

    /**
     * Returns word usage over time
     *
     * 
     *
     * This tests the overload of the method that uses a Map for query parameters instead of
     * listing them out individually.
     */
    @Test
    public void getWordFrequencyTestQueryMap() {
        String word = null;
        WordApi.GetWordFrequencyQueryParams queryParams = new WordApi.GetWordFrequencyQueryParams()
            .useCanonical(null)
            .startYear(null)
            .endYear(null);
        // FrequencySummary response = api.getWordFrequency(word, queryParams);

    // TODO: test validations
    }
    
}
