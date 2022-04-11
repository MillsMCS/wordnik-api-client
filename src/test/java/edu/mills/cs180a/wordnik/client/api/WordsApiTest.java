package edu.mills.cs180a.wordnik.client.api;

import edu.mills.cs180a.wordnik.client.invoker.ApiClient;
import edu.mills.cs180a.wordnik.client.model.DefinitionSearchResults;
import edu.mills.cs180a.wordnik.client.model.WordObject;
import edu.mills.cs180a.wordnik.client.model.WordOfTheDay;
import edu.mills.cs180a.wordnik.client.model.WordSearchResults;
import org.junit.Before;
import org.junit.Test;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


/**
 * API tests for WordsApi
 */
public class WordsApiTest {

    private WordsApi api;


    @Before
    public void setup() {
        api = new ApiClient().buildClient(WordsApi.class);
    }

    
    /**
     * Returns a single random WordObject
     *
     * 
     */
    @Test
    public void getRandomWordTest() {
        String hasDictionaryDef = null;
        String includePartOfSpeech = null;
        String excludePartOfSpeech = null;
        Integer minCorpusCount = null;
        Integer maxCorpusCount = null;
        Integer minDictionaryCount = null;
        Integer maxDictionaryCount = null;
        Integer minLength = null;
        Integer maxLength = null;
        // WordObject response = api.getRandomWord(hasDictionaryDef, includePartOfSpeech, excludePartOfSpeech, minCorpusCount, maxCorpusCount, minDictionaryCount, maxDictionaryCount, minLength, maxLength);

        // TODO: test validations
    }

    /**
     * Returns a single random WordObject
     *
     * 
     *
     * This tests the overload of the method that uses a Map for query parameters instead of
     * listing them out individually.
     */
    @Test
    public void getRandomWordTestQueryMap() {
        WordsApi.GetRandomWordQueryParams queryParams = new WordsApi.GetRandomWordQueryParams()
            .hasDictionaryDef(null)
            .includePartOfSpeech(null)
            .excludePartOfSpeech(null)
            .minCorpusCount(null)
            .maxCorpusCount(null)
            .minDictionaryCount(null)
            .maxDictionaryCount(null)
            .minLength(null)
            .maxLength(null);
        // WordObject response = api.getRandomWord(queryParams);

    // TODO: test validations
    }
    
    /**
     * Returns an array of random WordObjects
     *
     * 
     */
    @Test
    public void getRandomWordsTest() {
        String hasDictionaryDef = null;
        String includePartOfSpeech = null;
        String excludePartOfSpeech = null;
        Integer minCorpusCount = null;
        Integer maxCorpusCount = null;
        Integer minDictionaryCount = null;
        Integer maxDictionaryCount = null;
        Integer minLength = null;
        Integer maxLength = null;
        String sortBy = null;
        String sortOrder = null;
        Integer limit = null;
        // List<WordObject> response = api.getRandomWords(hasDictionaryDef, includePartOfSpeech, excludePartOfSpeech, minCorpusCount, maxCorpusCount, minDictionaryCount, maxDictionaryCount, minLength, maxLength, sortBy, sortOrder, limit);

        // TODO: test validations
    }

    /**
     * Returns an array of random WordObjects
     *
     * 
     *
     * This tests the overload of the method that uses a Map for query parameters instead of
     * listing them out individually.
     */
    @Test
    public void getRandomWordsTestQueryMap() {
        WordsApi.GetRandomWordsQueryParams queryParams = new WordsApi.GetRandomWordsQueryParams()
            .hasDictionaryDef(null)
            .includePartOfSpeech(null)
            .excludePartOfSpeech(null)
            .minCorpusCount(null)
            .maxCorpusCount(null)
            .minDictionaryCount(null)
            .maxDictionaryCount(null)
            .minLength(null)
            .maxLength(null)
            .sortBy(null)
            .sortOrder(null)
            .limit(null);
        // List<WordObject> response = api.getRandomWords(queryParams);

    // TODO: test validations
    }
    
    /**
     * Returns a specific WordOfTheDay
     *
     * 
     */
    @Test
    public void getWordOfTheDayTest() {
        String date = null;
        // WordOfTheDay response = api.getWordOfTheDay(date);

        // TODO: test validations
    }

    /**
     * Returns a specific WordOfTheDay
     *
     * 
     *
     * This tests the overload of the method that uses a Map for query parameters instead of
     * listing them out individually.
     */
    @Test
    public void getWordOfTheDayTestQueryMap() {
        WordsApi.GetWordOfTheDayQueryParams queryParams = new WordsApi.GetWordOfTheDayQueryParams()
            .date(null);
        // WordOfTheDay response = api.getWordOfTheDay(queryParams);

    // TODO: test validations
    }
    
    /**
     * Reverse dictionary search
     *
     * 
     */
    @Test
    public void reverseDictionaryTest() {
        String query = null;
        String findSenseForWord = null;
        String includeSourceDictionaries = null;
        String excludeSourceDictionaries = null;
        String includePartOfSpeech = null;
        String excludePartOfSpeech = null;
        Integer minCorpusCount = null;
        Integer maxCorpusCount = null;
        Integer minLength = null;
        Integer maxLength = null;
        String expandTerms = null;
        String includeTags = null;
        String sortBy = null;
        String sortOrder = null;
        String skip = null;
        Integer limit = null;
        // DefinitionSearchResults response = api.reverseDictionary(query, findSenseForWord, includeSourceDictionaries, excludeSourceDictionaries, includePartOfSpeech, excludePartOfSpeech, minCorpusCount, maxCorpusCount, minLength, maxLength, expandTerms, includeTags, sortBy, sortOrder, skip, limit);

        // TODO: test validations
    }

    /**
     * Reverse dictionary search
     *
     * 
     *
     * This tests the overload of the method that uses a Map for query parameters instead of
     * listing them out individually.
     */
    @Test
    public void reverseDictionaryTestQueryMap() {
        WordsApi.ReverseDictionaryQueryParams queryParams = new WordsApi.ReverseDictionaryQueryParams()
            .query(null)
            .findSenseForWord(null)
            .includeSourceDictionaries(null)
            .excludeSourceDictionaries(null)
            .includePartOfSpeech(null)
            .excludePartOfSpeech(null)
            .minCorpusCount(null)
            .maxCorpusCount(null)
            .minLength(null)
            .maxLength(null)
            .expandTerms(null)
            .includeTags(null)
            .sortBy(null)
            .sortOrder(null)
            .skip(null)
            .limit(null);
        // DefinitionSearchResults response = api.reverseDictionary(queryParams);

    // TODO: test validations
    }
    
    /**
     * Searches words
     *
     * 
     */
    @Test
    public void searchWordsTest() {
        String query = null;
        String allowRegex = null;
        String caseSensitive = null;
        String includePartOfSpeech = null;
        String excludePartOfSpeech = null;
        Integer minCorpusCount = null;
        Integer maxCorpusCount = null;
        Integer minDictionaryCount = null;
        Integer maxDictionaryCount = null;
        Integer minLength = null;
        Integer maxLength = null;
        Integer skip = null;
        Integer limit = null;
        // WordSearchResults response = api.searchWords(query, allowRegex, caseSensitive, includePartOfSpeech, excludePartOfSpeech, minCorpusCount, maxCorpusCount, minDictionaryCount, maxDictionaryCount, minLength, maxLength, skip, limit);

        // TODO: test validations
    }

    /**
     * Searches words
     *
     * 
     *
     * This tests the overload of the method that uses a Map for query parameters instead of
     * listing them out individually.
     */
    @Test
    public void searchWordsTestQueryMap() {
        String query = null;
        WordsApi.SearchWordsQueryParams queryParams = new WordsApi.SearchWordsQueryParams()
            .allowRegex(null)
            .caseSensitive(null)
            .includePartOfSpeech(null)
            .excludePartOfSpeech(null)
            .minCorpusCount(null)
            .maxCorpusCount(null)
            .minDictionaryCount(null)
            .maxDictionaryCount(null)
            .minLength(null)
            .maxLength(null)
            .skip(null)
            .limit(null);
        // WordSearchResults response = api.searchWords(query, queryParams);

    // TODO: test validations
    }
    
}
