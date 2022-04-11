package edu.mills.cs180a.wordnik.client.api;

import edu.mills.cs180a.wordnik.client.invoker.ApiClient;
import edu.mills.cs180a.wordnik.client.invoker.EncodingUtils;

import edu.mills.cs180a.wordnik.client.model.DefinitionSearchResults;
import edu.mills.cs180a.wordnik.client.model.WordObject;
import edu.mills.cs180a.wordnik.client.model.WordOfTheDay;
import edu.mills.cs180a.wordnik.client.model.WordSearchResults;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import feign.*;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2022-04-10T17:59:52.032-07:00")
public interface WordsApi extends ApiClient.Api {


  /**
   * Returns a single random WordObject
   * 
    * @param hasDictionaryDef Only return words with dictionary definitions (optional, default to true)
    * @param includePartOfSpeech CSV part-of-speech values to include (allowable values are noun, adjective, verb, adverb, interjection, pronoun, preposition, abbreviation, affix, article, auxiliary-verb, conjunction, definite-article, family-name, given-name, idiom, imperative, noun-plural, noun-posessive, past-participle, phrasal-prefix, proper-noun, proper-noun-plural, proper-noun-posessive, suffix, verb-intransitive, verb-transitive) (optional)
    * @param excludePartOfSpeech CSV part-of-speech values to exclude (allowable values are noun, adjective, verb, adverb, interjection, pronoun, preposition, abbreviation, affix, article, auxiliary-verb, conjunction, definite-article, family-name, given-name, idiom, imperative, noun-plural, noun-posessive, past-participle, phrasal-prefix, proper-noun, proper-noun-plural, proper-noun-posessive, suffix, verb-intransitive, verb-transitive) (optional)
    * @param minCorpusCount Minimum corpus frequency for terms (optional, default to 0)
    * @param maxCorpusCount Maximum corpus frequency for terms (optional, default to -1)
    * @param minDictionaryCount Minimum dictionary count (optional, default to 1)
    * @param maxDictionaryCount Maximum dictionary count (optional, default to -1)
    * @param minLength Minimum word length (optional, default to 5)
    * @param maxLength Maximum word length (optional, default to -1)
   * @return WordObject
   */
  @RequestLine("GET /words.json/randomWord?hasDictionaryDef={hasDictionaryDef}&includePartOfSpeech={includePartOfSpeech}&excludePartOfSpeech={excludePartOfSpeech}&minCorpusCount={minCorpusCount}&maxCorpusCount={maxCorpusCount}&minDictionaryCount={minDictionaryCount}&maxDictionaryCount={maxDictionaryCount}&minLength={minLength}&maxLength={maxLength}")
  @Headers({
    "Accept: application/json",
  })
  WordObject getRandomWord(@Param("hasDictionaryDef") String hasDictionaryDef, @Param("includePartOfSpeech") String includePartOfSpeech, @Param("excludePartOfSpeech") String excludePartOfSpeech, @Param("minCorpusCount") Integer minCorpusCount, @Param("maxCorpusCount") Integer maxCorpusCount, @Param("minDictionaryCount") Integer minDictionaryCount, @Param("maxDictionaryCount") Integer maxDictionaryCount, @Param("minLength") Integer minLength, @Param("maxLength") Integer maxLength);

  /**
   * Returns a single random WordObject
   * 
   * Note, this is equivalent to the other <code>getRandomWord</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link GetRandomWordQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>hasDictionaryDef - Only return words with dictionary definitions (optional, default to true)</li>
   *   <li>includePartOfSpeech - CSV part-of-speech values to include (allowable values are noun, adjective, verb, adverb, interjection, pronoun, preposition, abbreviation, affix, article, auxiliary-verb, conjunction, definite-article, family-name, given-name, idiom, imperative, noun-plural, noun-posessive, past-participle, phrasal-prefix, proper-noun, proper-noun-plural, proper-noun-posessive, suffix, verb-intransitive, verb-transitive) (optional)</li>
   *   <li>excludePartOfSpeech - CSV part-of-speech values to exclude (allowable values are noun, adjective, verb, adverb, interjection, pronoun, preposition, abbreviation, affix, article, auxiliary-verb, conjunction, definite-article, family-name, given-name, idiom, imperative, noun-plural, noun-posessive, past-participle, phrasal-prefix, proper-noun, proper-noun-plural, proper-noun-posessive, suffix, verb-intransitive, verb-transitive) (optional)</li>
   *   <li>minCorpusCount - Minimum corpus frequency for terms (optional, default to 0)</li>
   *   <li>maxCorpusCount - Maximum corpus frequency for terms (optional, default to -1)</li>
   *   <li>minDictionaryCount - Minimum dictionary count (optional, default to 1)</li>
   *   <li>maxDictionaryCount - Maximum dictionary count (optional, default to -1)</li>
   *   <li>minLength - Minimum word length (optional, default to 5)</li>
   *   <li>maxLength - Maximum word length (optional, default to -1)</li>
   *   </ul>
   * @return WordObject
   */
  @RequestLine("GET /words.json/randomWord?hasDictionaryDef={hasDictionaryDef}&includePartOfSpeech={includePartOfSpeech}&excludePartOfSpeech={excludePartOfSpeech}&minCorpusCount={minCorpusCount}&maxCorpusCount={maxCorpusCount}&minDictionaryCount={minDictionaryCount}&maxDictionaryCount={maxDictionaryCount}&minLength={minLength}&maxLength={maxLength}")
  @Headers({
  "Accept: application/json",
  })
  WordObject getRandomWord(@QueryMap(encoded=true) Map<String, Object> queryParams);

  /**
   * A convenience class for generating query parameters for the
   * <code>getRandomWord</code> method in a fluent style.
   */
  public static class GetRandomWordQueryParams extends HashMap<String, Object> {
    public GetRandomWordQueryParams hasDictionaryDef(final String value) {
      put("hasDictionaryDef", EncodingUtils.encode(value));
      return this;
    }
    public GetRandomWordQueryParams includePartOfSpeech(final String value) {
      put("includePartOfSpeech", EncodingUtils.encode(value));
      return this;
    }
    public GetRandomWordQueryParams excludePartOfSpeech(final String value) {
      put("excludePartOfSpeech", EncodingUtils.encode(value));
      return this;
    }
    public GetRandomWordQueryParams minCorpusCount(final Integer value) {
      put("minCorpusCount", EncodingUtils.encode(value));
      return this;
    }
    public GetRandomWordQueryParams maxCorpusCount(final Integer value) {
      put("maxCorpusCount", EncodingUtils.encode(value));
      return this;
    }
    public GetRandomWordQueryParams minDictionaryCount(final Integer value) {
      put("minDictionaryCount", EncodingUtils.encode(value));
      return this;
    }
    public GetRandomWordQueryParams maxDictionaryCount(final Integer value) {
      put("maxDictionaryCount", EncodingUtils.encode(value));
      return this;
    }
    public GetRandomWordQueryParams minLength(final Integer value) {
      put("minLength", EncodingUtils.encode(value));
      return this;
    }
    public GetRandomWordQueryParams maxLength(final Integer value) {
      put("maxLength", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Returns an array of random WordObjects
   * 
    * @param hasDictionaryDef Only return words with dictionary definitions (optional, default to true)
    * @param includePartOfSpeech CSV part-of-speech values to include (allowable values are noun, adjective, verb, adverb, interjection, pronoun, preposition, abbreviation, affix, article, auxiliary-verb, conjunction, definite-article, family-name, given-name, idiom, imperative, noun-plural, noun-posessive, past-participle, phrasal-prefix, proper-noun, proper-noun-plural, proper-noun-posessive, suffix, verb-intransitive, verb-transitive) (optional)
    * @param excludePartOfSpeech CSV part-of-speech values to exclude (allowable values are noun, adjective, verb, adverb, interjection, pronoun, preposition, abbreviation, affix, article, auxiliary-verb, conjunction, definite-article, family-name, given-name, idiom, imperative, noun-plural, noun-posessive, past-participle, phrasal-prefix, proper-noun, proper-noun-plural, proper-noun-posessive, suffix, verb-intransitive, verb-transitive) (optional)
    * @param minCorpusCount Minimum corpus frequency for terms (optional, default to 0)
    * @param maxCorpusCount Maximum corpus frequency for terms (optional, default to -1)
    * @param minDictionaryCount Minimum dictionary count (optional, default to 1)
    * @param maxDictionaryCount Maximum dictionary count (optional, default to -1)
    * @param minLength Minimum word length (optional, default to 5)
    * @param maxLength Maximum word length (optional, default to -1)
    * @param sortBy Attribute to sort by (optional)
    * @param sortOrder Sort direction (optional)
    * @param limit Maximum number of results to return (optional, default to 10)
   * @return List&lt;WordObject&gt;
   */
  @RequestLine("GET /words.json/randomWords?hasDictionaryDef={hasDictionaryDef}&includePartOfSpeech={includePartOfSpeech}&excludePartOfSpeech={excludePartOfSpeech}&minCorpusCount={minCorpusCount}&maxCorpusCount={maxCorpusCount}&minDictionaryCount={minDictionaryCount}&maxDictionaryCount={maxDictionaryCount}&minLength={minLength}&maxLength={maxLength}&sortBy={sortBy}&sortOrder={sortOrder}&limit={limit}")
  @Headers({
    "Accept: application/json",
  })
  List<WordObject> getRandomWords(@Param("hasDictionaryDef") String hasDictionaryDef, @Param("includePartOfSpeech") String includePartOfSpeech, @Param("excludePartOfSpeech") String excludePartOfSpeech, @Param("minCorpusCount") Integer minCorpusCount, @Param("maxCorpusCount") Integer maxCorpusCount, @Param("minDictionaryCount") Integer minDictionaryCount, @Param("maxDictionaryCount") Integer maxDictionaryCount, @Param("minLength") Integer minLength, @Param("maxLength") Integer maxLength, @Param("sortBy") String sortBy, @Param("sortOrder") String sortOrder, @Param("limit") Integer limit);

  /**
   * Returns an array of random WordObjects
   * 
   * Note, this is equivalent to the other <code>getRandomWords</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link GetRandomWordsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>hasDictionaryDef - Only return words with dictionary definitions (optional, default to true)</li>
   *   <li>includePartOfSpeech - CSV part-of-speech values to include (allowable values are noun, adjective, verb, adverb, interjection, pronoun, preposition, abbreviation, affix, article, auxiliary-verb, conjunction, definite-article, family-name, given-name, idiom, imperative, noun-plural, noun-posessive, past-participle, phrasal-prefix, proper-noun, proper-noun-plural, proper-noun-posessive, suffix, verb-intransitive, verb-transitive) (optional)</li>
   *   <li>excludePartOfSpeech - CSV part-of-speech values to exclude (allowable values are noun, adjective, verb, adverb, interjection, pronoun, preposition, abbreviation, affix, article, auxiliary-verb, conjunction, definite-article, family-name, given-name, idiom, imperative, noun-plural, noun-posessive, past-participle, phrasal-prefix, proper-noun, proper-noun-plural, proper-noun-posessive, suffix, verb-intransitive, verb-transitive) (optional)</li>
   *   <li>minCorpusCount - Minimum corpus frequency for terms (optional, default to 0)</li>
   *   <li>maxCorpusCount - Maximum corpus frequency for terms (optional, default to -1)</li>
   *   <li>minDictionaryCount - Minimum dictionary count (optional, default to 1)</li>
   *   <li>maxDictionaryCount - Maximum dictionary count (optional, default to -1)</li>
   *   <li>minLength - Minimum word length (optional, default to 5)</li>
   *   <li>maxLength - Maximum word length (optional, default to -1)</li>
   *   <li>sortBy - Attribute to sort by (optional)</li>
   *   <li>sortOrder - Sort direction (optional)</li>
   *   <li>limit - Maximum number of results to return (optional, default to 10)</li>
   *   </ul>
   * @return List&lt;WordObject&gt;
   */
  @RequestLine("GET /words.json/randomWords?hasDictionaryDef={hasDictionaryDef}&includePartOfSpeech={includePartOfSpeech}&excludePartOfSpeech={excludePartOfSpeech}&minCorpusCount={minCorpusCount}&maxCorpusCount={maxCorpusCount}&minDictionaryCount={minDictionaryCount}&maxDictionaryCount={maxDictionaryCount}&minLength={minLength}&maxLength={maxLength}&sortBy={sortBy}&sortOrder={sortOrder}&limit={limit}")
  @Headers({
  "Accept: application/json",
  })
  List<WordObject> getRandomWords(@QueryMap(encoded=true) Map<String, Object> queryParams);

  /**
   * A convenience class for generating query parameters for the
   * <code>getRandomWords</code> method in a fluent style.
   */
  public static class GetRandomWordsQueryParams extends HashMap<String, Object> {
    public GetRandomWordsQueryParams hasDictionaryDef(final String value) {
      put("hasDictionaryDef", EncodingUtils.encode(value));
      return this;
    }
    public GetRandomWordsQueryParams includePartOfSpeech(final String value) {
      put("includePartOfSpeech", EncodingUtils.encode(value));
      return this;
    }
    public GetRandomWordsQueryParams excludePartOfSpeech(final String value) {
      put("excludePartOfSpeech", EncodingUtils.encode(value));
      return this;
    }
    public GetRandomWordsQueryParams minCorpusCount(final Integer value) {
      put("minCorpusCount", EncodingUtils.encode(value));
      return this;
    }
    public GetRandomWordsQueryParams maxCorpusCount(final Integer value) {
      put("maxCorpusCount", EncodingUtils.encode(value));
      return this;
    }
    public GetRandomWordsQueryParams minDictionaryCount(final Integer value) {
      put("minDictionaryCount", EncodingUtils.encode(value));
      return this;
    }
    public GetRandomWordsQueryParams maxDictionaryCount(final Integer value) {
      put("maxDictionaryCount", EncodingUtils.encode(value));
      return this;
    }
    public GetRandomWordsQueryParams minLength(final Integer value) {
      put("minLength", EncodingUtils.encode(value));
      return this;
    }
    public GetRandomWordsQueryParams maxLength(final Integer value) {
      put("maxLength", EncodingUtils.encode(value));
      return this;
    }
    public GetRandomWordsQueryParams sortBy(final String value) {
      put("sortBy", EncodingUtils.encode(value));
      return this;
    }
    public GetRandomWordsQueryParams sortOrder(final String value) {
      put("sortOrder", EncodingUtils.encode(value));
      return this;
    }
    public GetRandomWordsQueryParams limit(final Integer value) {
      put("limit", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Returns a specific WordOfTheDay
   * 
    * @param date Fetches by date in yyyy-MM-dd (optional)
   * @return WordOfTheDay
   */
  @RequestLine("GET /words.json/wordOfTheDay?date={date}")
  @Headers({
    "Accept: application/json",
  })
  WordOfTheDay getWordOfTheDay(@Param("date") String date);

  /**
   * Returns a specific WordOfTheDay
   * 
   * Note, this is equivalent to the other <code>getWordOfTheDay</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link GetWordOfTheDayQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>date - Fetches by date in yyyy-MM-dd (optional)</li>
   *   </ul>
   * @return WordOfTheDay
   */
  @RequestLine("GET /words.json/wordOfTheDay?date={date}")
  @Headers({
  "Accept: application/json",
  })
  WordOfTheDay getWordOfTheDay(@QueryMap(encoded=true) Map<String, Object> queryParams);

  /**
   * A convenience class for generating query parameters for the
   * <code>getWordOfTheDay</code> method in a fluent style.
   */
  public static class GetWordOfTheDayQueryParams extends HashMap<String, Object> {
    public GetWordOfTheDayQueryParams date(final String value) {
      put("date", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Reverse dictionary search
   * 
    * @param query Search term (required)
    * @param findSenseForWord Restricts words and finds closest sense (optional)
    * @param includeSourceDictionaries Only include these comma-delimited source dictionaries (optional)
    * @param excludeSourceDictionaries Exclude these comma-delimited source dictionaries (optional)
    * @param includePartOfSpeech Only include these comma-delimited parts of speech (allowable values are noun, adjective, verb, adverb, interjection, pronoun, preposition, abbreviation, affix, article, auxiliary-verb, conjunction, definite-article, family-name, given-name, idiom, imperative, noun-plural, noun-posessive, past-participle, phrasal-prefix, proper-noun, proper-noun-plural, proper-noun-posessive, suffix, verb-intransitive, verb-transitive) (optional)
    * @param excludePartOfSpeech Exclude these comma-delimited parts of speech (allowable values are noun, adjective, verb, adverb, interjection, pronoun, preposition, abbreviation, affix, article, auxiliary-verb, conjunction, definite-article, family-name, given-name, idiom, imperative, noun-plural, noun-posessive, past-participle, phrasal-prefix, proper-noun, proper-noun-plural, proper-noun-posessive, suffix, verb-intransitive, verb-transitive) (optional)
    * @param minCorpusCount Minimum corpus frequency for terms (optional, default to 5)
    * @param maxCorpusCount Maximum corpus frequency for terms (optional, default to -1)
    * @param minLength Minimum word length (optional, default to 1)
    * @param maxLength Maximum word length (optional, default to -1)
    * @param expandTerms Expand terms (optional)
    * @param includeTags Return a closed set of XML tags in response (optional, default to false)
    * @param sortBy Attribute to sort by (optional)
    * @param sortOrder Sort direction (optional)
    * @param skip Results to skip (optional, default to 0)
    * @param limit Maximum number of results to return (optional, default to 10)
   * @return DefinitionSearchResults
   */
  @RequestLine("GET /words.json/reverseDictionary?query={query}&findSenseForWord={findSenseForWord}&includeSourceDictionaries={includeSourceDictionaries}&excludeSourceDictionaries={excludeSourceDictionaries}&includePartOfSpeech={includePartOfSpeech}&excludePartOfSpeech={excludePartOfSpeech}&minCorpusCount={minCorpusCount}&maxCorpusCount={maxCorpusCount}&minLength={minLength}&maxLength={maxLength}&expandTerms={expandTerms}&includeTags={includeTags}&sortBy={sortBy}&sortOrder={sortOrder}&skip={skip}&limit={limit}")
  @Headers({
    "Accept: application/json",
  })
  DefinitionSearchResults reverseDictionary(@Param("query") String query, @Param("findSenseForWord") String findSenseForWord, @Param("includeSourceDictionaries") String includeSourceDictionaries, @Param("excludeSourceDictionaries") String excludeSourceDictionaries, @Param("includePartOfSpeech") String includePartOfSpeech, @Param("excludePartOfSpeech") String excludePartOfSpeech, @Param("minCorpusCount") Integer minCorpusCount, @Param("maxCorpusCount") Integer maxCorpusCount, @Param("minLength") Integer minLength, @Param("maxLength") Integer maxLength, @Param("expandTerms") String expandTerms, @Param("includeTags") String includeTags, @Param("sortBy") String sortBy, @Param("sortOrder") String sortOrder, @Param("skip") String skip, @Param("limit") Integer limit);

  /**
   * Reverse dictionary search
   * 
   * Note, this is equivalent to the other <code>reverseDictionary</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link ReverseDictionaryQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>query - Search term (required)</li>
   *   <li>findSenseForWord - Restricts words and finds closest sense (optional)</li>
   *   <li>includeSourceDictionaries - Only include these comma-delimited source dictionaries (optional)</li>
   *   <li>excludeSourceDictionaries - Exclude these comma-delimited source dictionaries (optional)</li>
   *   <li>includePartOfSpeech - Only include these comma-delimited parts of speech (allowable values are noun, adjective, verb, adverb, interjection, pronoun, preposition, abbreviation, affix, article, auxiliary-verb, conjunction, definite-article, family-name, given-name, idiom, imperative, noun-plural, noun-posessive, past-participle, phrasal-prefix, proper-noun, proper-noun-plural, proper-noun-posessive, suffix, verb-intransitive, verb-transitive) (optional)</li>
   *   <li>excludePartOfSpeech - Exclude these comma-delimited parts of speech (allowable values are noun, adjective, verb, adverb, interjection, pronoun, preposition, abbreviation, affix, article, auxiliary-verb, conjunction, definite-article, family-name, given-name, idiom, imperative, noun-plural, noun-posessive, past-participle, phrasal-prefix, proper-noun, proper-noun-plural, proper-noun-posessive, suffix, verb-intransitive, verb-transitive) (optional)</li>
   *   <li>minCorpusCount - Minimum corpus frequency for terms (optional, default to 5)</li>
   *   <li>maxCorpusCount - Maximum corpus frequency for terms (optional, default to -1)</li>
   *   <li>minLength - Minimum word length (optional, default to 1)</li>
   *   <li>maxLength - Maximum word length (optional, default to -1)</li>
   *   <li>expandTerms - Expand terms (optional)</li>
   *   <li>includeTags - Return a closed set of XML tags in response (optional, default to false)</li>
   *   <li>sortBy - Attribute to sort by (optional)</li>
   *   <li>sortOrder - Sort direction (optional)</li>
   *   <li>skip - Results to skip (optional, default to 0)</li>
   *   <li>limit - Maximum number of results to return (optional, default to 10)</li>
   *   </ul>
   * @return DefinitionSearchResults
   */
  @RequestLine("GET /words.json/reverseDictionary?query={query}&findSenseForWord={findSenseForWord}&includeSourceDictionaries={includeSourceDictionaries}&excludeSourceDictionaries={excludeSourceDictionaries}&includePartOfSpeech={includePartOfSpeech}&excludePartOfSpeech={excludePartOfSpeech}&minCorpusCount={minCorpusCount}&maxCorpusCount={maxCorpusCount}&minLength={minLength}&maxLength={maxLength}&expandTerms={expandTerms}&includeTags={includeTags}&sortBy={sortBy}&sortOrder={sortOrder}&skip={skip}&limit={limit}")
  @Headers({
  "Accept: application/json",
  })
  DefinitionSearchResults reverseDictionary(@QueryMap(encoded=true) Map<String, Object> queryParams);

  /**
   * A convenience class for generating query parameters for the
   * <code>reverseDictionary</code> method in a fluent style.
   */
  public static class ReverseDictionaryQueryParams extends HashMap<String, Object> {
    public ReverseDictionaryQueryParams query(final String value) {
      put("query", EncodingUtils.encode(value));
      return this;
    }
    public ReverseDictionaryQueryParams findSenseForWord(final String value) {
      put("findSenseForWord", EncodingUtils.encode(value));
      return this;
    }
    public ReverseDictionaryQueryParams includeSourceDictionaries(final String value) {
      put("includeSourceDictionaries", EncodingUtils.encode(value));
      return this;
    }
    public ReverseDictionaryQueryParams excludeSourceDictionaries(final String value) {
      put("excludeSourceDictionaries", EncodingUtils.encode(value));
      return this;
    }
    public ReverseDictionaryQueryParams includePartOfSpeech(final String value) {
      put("includePartOfSpeech", EncodingUtils.encode(value));
      return this;
    }
    public ReverseDictionaryQueryParams excludePartOfSpeech(final String value) {
      put("excludePartOfSpeech", EncodingUtils.encode(value));
      return this;
    }
    public ReverseDictionaryQueryParams minCorpusCount(final Integer value) {
      put("minCorpusCount", EncodingUtils.encode(value));
      return this;
    }
    public ReverseDictionaryQueryParams maxCorpusCount(final Integer value) {
      put("maxCorpusCount", EncodingUtils.encode(value));
      return this;
    }
    public ReverseDictionaryQueryParams minLength(final Integer value) {
      put("minLength", EncodingUtils.encode(value));
      return this;
    }
    public ReverseDictionaryQueryParams maxLength(final Integer value) {
      put("maxLength", EncodingUtils.encode(value));
      return this;
    }
    public ReverseDictionaryQueryParams expandTerms(final String value) {
      put("expandTerms", EncodingUtils.encode(value));
      return this;
    }
    public ReverseDictionaryQueryParams includeTags(final String value) {
      put("includeTags", EncodingUtils.encode(value));
      return this;
    }
    public ReverseDictionaryQueryParams sortBy(final String value) {
      put("sortBy", EncodingUtils.encode(value));
      return this;
    }
    public ReverseDictionaryQueryParams sortOrder(final String value) {
      put("sortOrder", EncodingUtils.encode(value));
      return this;
    }
    public ReverseDictionaryQueryParams skip(final String value) {
      put("skip", EncodingUtils.encode(value));
      return this;
    }
    public ReverseDictionaryQueryParams limit(final Integer value) {
      put("limit", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Searches words
   * 
    * @param query Search query (required)
    * @param allowRegex Search term is a Regular Expression (optional, default to false)
    * @param caseSensitive Search case sensitive (optional, default to true)
    * @param includePartOfSpeech Only include these comma-delimited parts of speech (allowable values are noun, adjective, verb, adverb, interjection, pronoun, preposition, abbreviation, affix, article, auxiliary-verb, conjunction, definite-article, family-name, given-name, idiom, imperative, noun-plural, noun-posessive, past-participle, phrasal-prefix, proper-noun, proper-noun-plural, proper-noun-posessive, suffix, verb-intransitive, verb-transitive) (optional)
    * @param excludePartOfSpeech Exclude these comma-delimited parts of speech (allowable values are noun, adjective, verb, adverb, interjection, pronoun, preposition, abbreviation, affix, article, auxiliary-verb, conjunction, definite-article, family-name, given-name, idiom, imperative, noun-plural, noun-posessive, past-participle, phrasal-prefix, proper-noun, proper-noun-plural, proper-noun-posessive, suffix, verb-intransitive, verb-transitive) (optional)
    * @param minCorpusCount Minimum corpus frequency for terms (optional, default to 5)
    * @param maxCorpusCount Maximum corpus frequency for terms (optional, default to -1)
    * @param minDictionaryCount Minimum number of dictionary entries for words returned (optional, default to 1)
    * @param maxDictionaryCount Maximum dictionary definition count (optional, default to -1)
    * @param minLength Minimum word length (optional, default to 1)
    * @param maxLength Maximum word length (optional, default to -1)
    * @param skip Results to skip (optional, default to 0)
    * @param limit Maximum number of results to return (optional, default to 10)
   * @return WordSearchResults
   */
  @RequestLine("GET /words.json/search/{query}?allowRegex={allowRegex}&caseSensitive={caseSensitive}&includePartOfSpeech={includePartOfSpeech}&excludePartOfSpeech={excludePartOfSpeech}&minCorpusCount={minCorpusCount}&maxCorpusCount={maxCorpusCount}&minDictionaryCount={minDictionaryCount}&maxDictionaryCount={maxDictionaryCount}&minLength={minLength}&maxLength={maxLength}&skip={skip}&limit={limit}")
  @Headers({
    "Accept: application/json",
  })
  WordSearchResults searchWords(@Param("query") String query, @Param("allowRegex") String allowRegex, @Param("caseSensitive") String caseSensitive, @Param("includePartOfSpeech") String includePartOfSpeech, @Param("excludePartOfSpeech") String excludePartOfSpeech, @Param("minCorpusCount") Integer minCorpusCount, @Param("maxCorpusCount") Integer maxCorpusCount, @Param("minDictionaryCount") Integer minDictionaryCount, @Param("maxDictionaryCount") Integer maxDictionaryCount, @Param("minLength") Integer minLength, @Param("maxLength") Integer maxLength, @Param("skip") Integer skip, @Param("limit") Integer limit);

  /**
   * Searches words
   * 
   * Note, this is equivalent to the other <code>searchWords</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link SearchWordsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param query Search query (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>allowRegex - Search term is a Regular Expression (optional, default to false)</li>
   *   <li>caseSensitive - Search case sensitive (optional, default to true)</li>
   *   <li>includePartOfSpeech - Only include these comma-delimited parts of speech (allowable values are noun, adjective, verb, adverb, interjection, pronoun, preposition, abbreviation, affix, article, auxiliary-verb, conjunction, definite-article, family-name, given-name, idiom, imperative, noun-plural, noun-posessive, past-participle, phrasal-prefix, proper-noun, proper-noun-plural, proper-noun-posessive, suffix, verb-intransitive, verb-transitive) (optional)</li>
   *   <li>excludePartOfSpeech - Exclude these comma-delimited parts of speech (allowable values are noun, adjective, verb, adverb, interjection, pronoun, preposition, abbreviation, affix, article, auxiliary-verb, conjunction, definite-article, family-name, given-name, idiom, imperative, noun-plural, noun-posessive, past-participle, phrasal-prefix, proper-noun, proper-noun-plural, proper-noun-posessive, suffix, verb-intransitive, verb-transitive) (optional)</li>
   *   <li>minCorpusCount - Minimum corpus frequency for terms (optional, default to 5)</li>
   *   <li>maxCorpusCount - Maximum corpus frequency for terms (optional, default to -1)</li>
   *   <li>minDictionaryCount - Minimum number of dictionary entries for words returned (optional, default to 1)</li>
   *   <li>maxDictionaryCount - Maximum dictionary definition count (optional, default to -1)</li>
   *   <li>minLength - Minimum word length (optional, default to 1)</li>
   *   <li>maxLength - Maximum word length (optional, default to -1)</li>
   *   <li>skip - Results to skip (optional, default to 0)</li>
   *   <li>limit - Maximum number of results to return (optional, default to 10)</li>
   *   </ul>
   * @return WordSearchResults
   */
  @RequestLine("GET /words.json/search/{query}?allowRegex={allowRegex}&caseSensitive={caseSensitive}&includePartOfSpeech={includePartOfSpeech}&excludePartOfSpeech={excludePartOfSpeech}&minCorpusCount={minCorpusCount}&maxCorpusCount={maxCorpusCount}&minDictionaryCount={minDictionaryCount}&maxDictionaryCount={maxDictionaryCount}&minLength={minLength}&maxLength={maxLength}&skip={skip}&limit={limit}")
  @Headers({
  "Accept: application/json",
  })
  WordSearchResults searchWords(@Param("query") String query, @QueryMap(encoded=true) Map<String, Object> queryParams);

  /**
   * A convenience class for generating query parameters for the
   * <code>searchWords</code> method in a fluent style.
   */
  public static class SearchWordsQueryParams extends HashMap<String, Object> {
    public SearchWordsQueryParams allowRegex(final String value) {
      put("allowRegex", EncodingUtils.encode(value));
      return this;
    }
    public SearchWordsQueryParams caseSensitive(final String value) {
      put("caseSensitive", EncodingUtils.encode(value));
      return this;
    }
    public SearchWordsQueryParams includePartOfSpeech(final String value) {
      put("includePartOfSpeech", EncodingUtils.encode(value));
      return this;
    }
    public SearchWordsQueryParams excludePartOfSpeech(final String value) {
      put("excludePartOfSpeech", EncodingUtils.encode(value));
      return this;
    }
    public SearchWordsQueryParams minCorpusCount(final Integer value) {
      put("minCorpusCount", EncodingUtils.encode(value));
      return this;
    }
    public SearchWordsQueryParams maxCorpusCount(final Integer value) {
      put("maxCorpusCount", EncodingUtils.encode(value));
      return this;
    }
    public SearchWordsQueryParams minDictionaryCount(final Integer value) {
      put("minDictionaryCount", EncodingUtils.encode(value));
      return this;
    }
    public SearchWordsQueryParams maxDictionaryCount(final Integer value) {
      put("maxDictionaryCount", EncodingUtils.encode(value));
      return this;
    }
    public SearchWordsQueryParams minLength(final Integer value) {
      put("minLength", EncodingUtils.encode(value));
      return this;
    }
    public SearchWordsQueryParams maxLength(final Integer value) {
      put("maxLength", EncodingUtils.encode(value));
      return this;
    }
    public SearchWordsQueryParams skip(final Integer value) {
      put("skip", EncodingUtils.encode(value));
      return this;
    }
    public SearchWordsQueryParams limit(final Integer value) {
      put("limit", EncodingUtils.encode(value));
      return this;
    }
  }
}
