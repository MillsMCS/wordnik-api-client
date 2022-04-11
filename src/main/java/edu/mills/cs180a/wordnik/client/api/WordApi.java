package edu.mills.cs180a.wordnik.client.api;

import edu.mills.cs180a.wordnik.client.invoker.ApiClient;
import edu.mills.cs180a.wordnik.client.invoker.EncodingUtils;

import edu.mills.cs180a.wordnik.client.model.AudioFile;
import edu.mills.cs180a.wordnik.client.model.Bigram;
import edu.mills.cs180a.wordnik.client.model.Definition;
import edu.mills.cs180a.wordnik.client.model.Example;
import edu.mills.cs180a.wordnik.client.model.ExampleSearchResults;
import edu.mills.cs180a.wordnik.client.model.FrequencySummary;
import edu.mills.cs180a.wordnik.client.model.Related;
import edu.mills.cs180a.wordnik.client.model.Syllable;
import edu.mills.cs180a.wordnik.client.model.TextPron;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import feign.*;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2022-04-10T17:59:52.032-07:00")
public interface WordApi extends ApiClient.Api {


  /**
   * Fetches audio metadata for a word.
   * The metadata includes a time-expiring fileUrl which allows reading the audio file directly from the API.  Currently only audio pronunciations from the American Heritage Dictionary in mp3 format are supported.
    * @param word Word to get audio for. (required)
    * @param useCanonical If true will try to return the correct word root (&#39;cats&#39; -&gt; &#39;cat&#39;). If false returns exactly what was requested. (optional, default to false)
    * @param limit Maximum number of results to return (optional, default to 50)
   * @return List&lt;AudioFile&gt;
   */
  @RequestLine("GET /word.json/{word}/audio?useCanonical={useCanonical}&limit={limit}")
  @Headers({
    "Accept: application/json",
  })
  List<AudioFile> getAudio(@Param("word") String word, @Param("useCanonical") String useCanonical, @Param("limit") Integer limit);

  /**
   * Fetches audio metadata for a word.
   * The metadata includes a time-expiring fileUrl which allows reading the audio file directly from the API.  Currently only audio pronunciations from the American Heritage Dictionary in mp3 format are supported.
   * Note, this is equivalent to the other <code>getAudio</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link GetAudioQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param word Word to get audio for. (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>useCanonical - If true will try to return the correct word root (&#39;cats&#39; -&gt; &#39;cat&#39;). If false returns exactly what was requested. (optional, default to false)</li>
   *   <li>limit - Maximum number of results to return (optional, default to 50)</li>
   *   </ul>
   * @return List&lt;AudioFile&gt;
   */
  @RequestLine("GET /word.json/{word}/audio?useCanonical={useCanonical}&limit={limit}")
  @Headers({
  "Accept: application/json",
  })
  List<AudioFile> getAudio(@Param("word") String word, @QueryMap(encoded=true) Map<String, Object> queryParams);

  /**
   * A convenience class for generating query parameters for the
   * <code>getAudio</code> method in a fluent style.
   */
  public static class GetAudioQueryParams extends HashMap<String, Object> {
    public GetAudioQueryParams useCanonical(final String value) {
      put("useCanonical", EncodingUtils.encode(value));
      return this;
    }
    public GetAudioQueryParams limit(final Integer value) {
      put("limit", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Return definitions for a word
   * 
    * @param word Word to return definitions for (required)
    * @param limit Maximum number of results to return (optional, default to 200)
    * @param partOfSpeech CSV list of part-of-speech types (optional)
    * @param includeRelated Return related words with definitions (optional, default to false)
    * @param sourceDictionaries Source dictionary to return definitions from.  If &#39;all&#39; is received, results are returned from all sources. If multiple values are received (e.g. &#39;century,wiktionary&#39;), results are returned from the first specified dictionary that has definitions. If left blank, results are returned from the first dictionary that has definitions. By default, dictionaries are searched in this order: ahd-5, wiktionary, webster, century, wordnet (optional)
    * @param useCanonical If true will try to return the correct word root (&#39;cats&#39; -&gt; &#39;cat&#39;). If false returns exactly what was requested. (optional, default to false)
    * @param includeTags Return a closed set of XML tags in response (optional, default to false)
   * @return List&lt;Definition&gt;
   */
  @RequestLine("GET /word.json/{word}/definitions?limit={limit}&partOfSpeech={partOfSpeech}&includeRelated={includeRelated}&sourceDictionaries={sourceDictionaries}&useCanonical={useCanonical}&includeTags={includeTags}")
  @Headers({
    "Accept: application/json",
  })
  List<Definition> getDefinitions(@Param("word") String word, @Param("limit") Integer limit, @Param("partOfSpeech") String partOfSpeech, @Param("includeRelated") String includeRelated, @Param("sourceDictionaries") List<String> sourceDictionaries, @Param("useCanonical") String useCanonical, @Param("includeTags") String includeTags);

  /**
   * Return definitions for a word
   * 
   * Note, this is equivalent to the other <code>getDefinitions</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link GetDefinitionsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param word Word to return definitions for (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>limit - Maximum number of results to return (optional, default to 200)</li>
   *   <li>partOfSpeech - CSV list of part-of-speech types (optional)</li>
   *   <li>includeRelated - Return related words with definitions (optional, default to false)</li>
   *   <li>sourceDictionaries - Source dictionary to return definitions from.  If &#39;all&#39; is received, results are returned from all sources. If multiple values are received (e.g. &#39;century,wiktionary&#39;), results are returned from the first specified dictionary that has definitions. If left blank, results are returned from the first dictionary that has definitions. By default, dictionaries are searched in this order: ahd-5, wiktionary, webster, century, wordnet (optional)</li>
   *   <li>useCanonical - If true will try to return the correct word root (&#39;cats&#39; -&gt; &#39;cat&#39;). If false returns exactly what was requested. (optional, default to false)</li>
   *   <li>includeTags - Return a closed set of XML tags in response (optional, default to false)</li>
   *   </ul>
   * @return List&lt;Definition&gt;
   */
  @RequestLine("GET /word.json/{word}/definitions?limit={limit}&partOfSpeech={partOfSpeech}&includeRelated={includeRelated}&sourceDictionaries={sourceDictionaries}&useCanonical={useCanonical}&includeTags={includeTags}")
  @Headers({
  "Accept: application/json",
  })
  List<Definition> getDefinitions(@Param("word") String word, @QueryMap(encoded=true) Map<String, Object> queryParams);

  /**
   * A convenience class for generating query parameters for the
   * <code>getDefinitions</code> method in a fluent style.
   */
  public static class GetDefinitionsQueryParams extends HashMap<String, Object> {
    public GetDefinitionsQueryParams limit(final Integer value) {
      put("limit", EncodingUtils.encode(value));
      return this;
    }
    public GetDefinitionsQueryParams partOfSpeech(final String value) {
      put("partOfSpeech", EncodingUtils.encode(value));
      return this;
    }
    public GetDefinitionsQueryParams includeRelated(final String value) {
      put("includeRelated", EncodingUtils.encode(value));
      return this;
    }
    public GetDefinitionsQueryParams sourceDictionaries(final List<String> value) {
      put("sourceDictionaries", EncodingUtils.encodeCollection(value, "csv"));
      return this;
    }
    public GetDefinitionsQueryParams useCanonical(final String value) {
      put("useCanonical", EncodingUtils.encode(value));
      return this;
    }
    public GetDefinitionsQueryParams includeTags(final String value) {
      put("includeTags", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Fetches etymology data
   * 
    * @param word Word to return (required)
    * @param useCanonical If true will try to return the correct word root (&#39;cats&#39; -&gt; &#39;cat&#39;). If false returns exactly what was requested. (optional, default to false)
   * @return List&lt;String&gt;
   */
  @RequestLine("GET /word.json/{word}/etymologies?useCanonical={useCanonical}")
  @Headers({
    "Accept: application/json",
  })
  List<String> getEtymologies(@Param("word") String word, @Param("useCanonical") String useCanonical);

  /**
   * Fetches etymology data
   * 
   * Note, this is equivalent to the other <code>getEtymologies</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link GetEtymologiesQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param word Word to return (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>useCanonical - If true will try to return the correct word root (&#39;cats&#39; -&gt; &#39;cat&#39;). If false returns exactly what was requested. (optional, default to false)</li>
   *   </ul>
   * @return List&lt;String&gt;
   */
  @RequestLine("GET /word.json/{word}/etymologies?useCanonical={useCanonical}")
  @Headers({
  "Accept: application/json",
  })
  List<String> getEtymologies(@Param("word") String word, @QueryMap(encoded=true) Map<String, Object> queryParams);

  /**
   * A convenience class for generating query parameters for the
   * <code>getEtymologies</code> method in a fluent style.
   */
  public static class GetEtymologiesQueryParams extends HashMap<String, Object> {
    public GetEtymologiesQueryParams useCanonical(final String value) {
      put("useCanonical", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Returns examples for a word
   * 
    * @param word Word to return examples for (required)
    * @param includeDuplicates Show duplicate examples from different sources (optional, default to false)
    * @param useCanonical If true will try to return the correct word root (&#39;cats&#39; -&gt; &#39;cat&#39;). If false returns exactly what was requested. (optional, default to false)
    * @param skip Results to skip (optional, default to 0)
    * @param limit Maximum number of results to return (optional, default to 5)
   * @return ExampleSearchResults
   */
  @RequestLine("GET /word.json/{word}/examples?includeDuplicates={includeDuplicates}&useCanonical={useCanonical}&skip={skip}&limit={limit}")
  @Headers({
    "Accept: application/json",
  })
  ExampleSearchResults getExamples(@Param("word") String word, @Param("includeDuplicates") String includeDuplicates, @Param("useCanonical") String useCanonical, @Param("skip") Integer skip, @Param("limit") Integer limit);

  /**
   * Returns examples for a word
   * 
   * Note, this is equivalent to the other <code>getExamples</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link GetExamplesQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param word Word to return examples for (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>includeDuplicates - Show duplicate examples from different sources (optional, default to false)</li>
   *   <li>useCanonical - If true will try to return the correct word root (&#39;cats&#39; -&gt; &#39;cat&#39;). If false returns exactly what was requested. (optional, default to false)</li>
   *   <li>skip - Results to skip (optional, default to 0)</li>
   *   <li>limit - Maximum number of results to return (optional, default to 5)</li>
   *   </ul>
   * @return ExampleSearchResults
   */
  @RequestLine("GET /word.json/{word}/examples?includeDuplicates={includeDuplicates}&useCanonical={useCanonical}&skip={skip}&limit={limit}")
  @Headers({
  "Accept: application/json",
  })
  ExampleSearchResults getExamples(@Param("word") String word, @QueryMap(encoded=true) Map<String, Object> queryParams);

  /**
   * A convenience class for generating query parameters for the
   * <code>getExamples</code> method in a fluent style.
   */
  public static class GetExamplesQueryParams extends HashMap<String, Object> {
    public GetExamplesQueryParams includeDuplicates(final String value) {
      put("includeDuplicates", EncodingUtils.encode(value));
      return this;
    }
    public GetExamplesQueryParams useCanonical(final String value) {
      put("useCanonical", EncodingUtils.encode(value));
      return this;
    }
    public GetExamplesQueryParams skip(final Integer value) {
      put("skip", EncodingUtils.encode(value));
      return this;
    }
    public GetExamplesQueryParams limit(final Integer value) {
      put("limit", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Returns syllable information for a word
   * 
    * @param word Word to get syllables for (required)
    * @param useCanonical If true will try to return a correct word root (&#39;cats&#39; -&gt; &#39;cat&#39;). If false returns exactly what was requested. (optional, default to false)
    * @param sourceDictionary Get from a single dictionary. Valid options: ahd-5, century, wiktionary, webster, and wordnet. (optional)
    * @param limit Maximum number of results to return (optional, default to 50)
   * @return List&lt;Syllable&gt;
   */
  @RequestLine("GET /word.json/{word}/hyphenation?useCanonical={useCanonical}&sourceDictionary={sourceDictionary}&limit={limit}")
  @Headers({
    "Accept: application/json",
  })
  List<Syllable> getHyphenation(@Param("word") String word, @Param("useCanonical") String useCanonical, @Param("sourceDictionary") String sourceDictionary, @Param("limit") Integer limit);

  /**
   * Returns syllable information for a word
   * 
   * Note, this is equivalent to the other <code>getHyphenation</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link GetHyphenationQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param word Word to get syllables for (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>useCanonical - If true will try to return a correct word root (&#39;cats&#39; -&gt; &#39;cat&#39;). If false returns exactly what was requested. (optional, default to false)</li>
   *   <li>sourceDictionary - Get from a single dictionary. Valid options: ahd-5, century, wiktionary, webster, and wordnet. (optional)</li>
   *   <li>limit - Maximum number of results to return (optional, default to 50)</li>
   *   </ul>
   * @return List&lt;Syllable&gt;
   */
  @RequestLine("GET /word.json/{word}/hyphenation?useCanonical={useCanonical}&sourceDictionary={sourceDictionary}&limit={limit}")
  @Headers({
  "Accept: application/json",
  })
  List<Syllable> getHyphenation(@Param("word") String word, @QueryMap(encoded=true) Map<String, Object> queryParams);

  /**
   * A convenience class for generating query parameters for the
   * <code>getHyphenation</code> method in a fluent style.
   */
  public static class GetHyphenationQueryParams extends HashMap<String, Object> {
    public GetHyphenationQueryParams useCanonical(final String value) {
      put("useCanonical", EncodingUtils.encode(value));
      return this;
    }
    public GetHyphenationQueryParams sourceDictionary(final String value) {
      put("sourceDictionary", EncodingUtils.encode(value));
      return this;
    }
    public GetHyphenationQueryParams limit(final Integer value) {
      put("limit", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Fetches bi-gram phrases for a word
   * 
    * @param word Word to fetch phrases for (required)
    * @param limit Maximum number of results to return (optional, default to 5)
    * @param wlmi Minimum WLMI for the phrase (optional, default to 0)
    * @param useCanonical If true will try to return the correct word root (&#39;cats&#39; -&gt; &#39;cat&#39;). If false returns exactly what was requested. (optional, default to false)
   * @return List&lt;Bigram&gt;
   */
  @RequestLine("GET /word.json/{word}/phrases?limit={limit}&wlmi={wlmi}&useCanonical={useCanonical}")
  @Headers({
    "Accept: application/json",
  })
  List<Bigram> getPhrases(@Param("word") String word, @Param("limit") Integer limit, @Param("wlmi") Integer wlmi, @Param("useCanonical") String useCanonical);

  /**
   * Fetches bi-gram phrases for a word
   * 
   * Note, this is equivalent to the other <code>getPhrases</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link GetPhrasesQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param word Word to fetch phrases for (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>limit - Maximum number of results to return (optional, default to 5)</li>
   *   <li>wlmi - Minimum WLMI for the phrase (optional, default to 0)</li>
   *   <li>useCanonical - If true will try to return the correct word root (&#39;cats&#39; -&gt; &#39;cat&#39;). If false returns exactly what was requested. (optional, default to false)</li>
   *   </ul>
   * @return List&lt;Bigram&gt;
   */
  @RequestLine("GET /word.json/{word}/phrases?limit={limit}&wlmi={wlmi}&useCanonical={useCanonical}")
  @Headers({
  "Accept: application/json",
  })
  List<Bigram> getPhrases(@Param("word") String word, @QueryMap(encoded=true) Map<String, Object> queryParams);

  /**
   * A convenience class for generating query parameters for the
   * <code>getPhrases</code> method in a fluent style.
   */
  public static class GetPhrasesQueryParams extends HashMap<String, Object> {
    public GetPhrasesQueryParams limit(final Integer value) {
      put("limit", EncodingUtils.encode(value));
      return this;
    }
    public GetPhrasesQueryParams wlmi(final Integer value) {
      put("wlmi", EncodingUtils.encode(value));
      return this;
    }
    public GetPhrasesQueryParams useCanonical(final String value) {
      put("useCanonical", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Given a word as a string, returns relationships from the Word Graph
   * 
    * @param word Word to fetch relationships for (required)
    * @param useCanonical If true will try to return the correct word root (&#39;cats&#39; -&gt; &#39;cat&#39;). If false returns exactly what was requested. (optional, default to false)
    * @param relationshipTypes Limits the total results per type of relationship type (optional)
    * @param limitPerRelationshipType Restrict to the supplied relationship types (optional, default to 10)
   * @return List&lt;Related&gt;
   */
  @RequestLine("GET /word.json/{word}/relatedWords?useCanonical={useCanonical}&relationshipTypes={relationshipTypes}&limitPerRelationshipType={limitPerRelationshipType}")
  @Headers({
    "Accept: application/json",
  })
  List<Related> getRelatedWords(@Param("word") String word, @Param("useCanonical") String useCanonical, @Param("relationshipTypes") String relationshipTypes, @Param("limitPerRelationshipType") Integer limitPerRelationshipType);

  /**
   * Given a word as a string, returns relationships from the Word Graph
   * 
   * Note, this is equivalent to the other <code>getRelatedWords</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link GetRelatedWordsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param word Word to fetch relationships for (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>useCanonical - If true will try to return the correct word root (&#39;cats&#39; -&gt; &#39;cat&#39;). If false returns exactly what was requested. (optional, default to false)</li>
   *   <li>relationshipTypes - Limits the total results per type of relationship type (optional)</li>
   *   <li>limitPerRelationshipType - Restrict to the supplied relationship types (optional, default to 10)</li>
   *   </ul>
   * @return List&lt;Related&gt;
   */
  @RequestLine("GET /word.json/{word}/relatedWords?useCanonical={useCanonical}&relationshipTypes={relationshipTypes}&limitPerRelationshipType={limitPerRelationshipType}")
  @Headers({
  "Accept: application/json",
  })
  List<Related> getRelatedWords(@Param("word") String word, @QueryMap(encoded=true) Map<String, Object> queryParams);

  /**
   * A convenience class for generating query parameters for the
   * <code>getRelatedWords</code> method in a fluent style.
   */
  public static class GetRelatedWordsQueryParams extends HashMap<String, Object> {
    public GetRelatedWordsQueryParams useCanonical(final String value) {
      put("useCanonical", EncodingUtils.encode(value));
      return this;
    }
    public GetRelatedWordsQueryParams relationshipTypes(final String value) {
      put("relationshipTypes", EncodingUtils.encode(value));
      return this;
    }
    public GetRelatedWordsQueryParams limitPerRelationshipType(final Integer value) {
      put("limitPerRelationshipType", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Returns the Scrabble score for a word
   * 
    * @param word Word to get scrabble score for. (required)
   * @return Long
   */
  @RequestLine("GET /word.json/{word}/scrabbleScore")
  @Headers({
    "Accept: application/json",
  })
  Long getScrabbleScore(@Param("word") String word);

  /**
   * Returns text pronunciations for a given word
   * 
    * @param word Word to get pronunciations for (required)
    * @param useCanonical If true will try to return a correct word root (&#39;cats&#39; -&gt; &#39;cat&#39;). If false returns exactly what was requested. (optional, default to false)
    * @param sourceDictionary Get from a single dictionary (optional)
    * @param typeFormat Text pronunciation type (optional)
    * @param limit Maximum number of results to return (optional, default to 50)
   * @return List&lt;TextPron&gt;
   */
  @RequestLine("GET /word.json/{word}/pronunciations?useCanonical={useCanonical}&sourceDictionary={sourceDictionary}&typeFormat={typeFormat}&limit={limit}")
  @Headers({
    "Accept: application/json",
  })
  List<TextPron> getTextPronunciations(@Param("word") String word, @Param("useCanonical") String useCanonical, @Param("sourceDictionary") String sourceDictionary, @Param("typeFormat") String typeFormat, @Param("limit") Integer limit);

  /**
   * Returns text pronunciations for a given word
   * 
   * Note, this is equivalent to the other <code>getTextPronunciations</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link GetTextPronunciationsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param word Word to get pronunciations for (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>useCanonical - If true will try to return a correct word root (&#39;cats&#39; -&gt; &#39;cat&#39;). If false returns exactly what was requested. (optional, default to false)</li>
   *   <li>sourceDictionary - Get from a single dictionary (optional)</li>
   *   <li>typeFormat - Text pronunciation type (optional)</li>
   *   <li>limit - Maximum number of results to return (optional, default to 50)</li>
   *   </ul>
   * @return List&lt;TextPron&gt;
   */
  @RequestLine("GET /word.json/{word}/pronunciations?useCanonical={useCanonical}&sourceDictionary={sourceDictionary}&typeFormat={typeFormat}&limit={limit}")
  @Headers({
  "Accept: application/json",
  })
  List<TextPron> getTextPronunciations(@Param("word") String word, @QueryMap(encoded=true) Map<String, Object> queryParams);

  /**
   * A convenience class for generating query parameters for the
   * <code>getTextPronunciations</code> method in a fluent style.
   */
  public static class GetTextPronunciationsQueryParams extends HashMap<String, Object> {
    public GetTextPronunciationsQueryParams useCanonical(final String value) {
      put("useCanonical", EncodingUtils.encode(value));
      return this;
    }
    public GetTextPronunciationsQueryParams sourceDictionary(final String value) {
      put("sourceDictionary", EncodingUtils.encode(value));
      return this;
    }
    public GetTextPronunciationsQueryParams typeFormat(final String value) {
      put("typeFormat", EncodingUtils.encode(value));
      return this;
    }
    public GetTextPronunciationsQueryParams limit(final Integer value) {
      put("limit", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Returns a top example for a word
   * 
    * @param word Word to fetch examples for (required)
    * @param useCanonical If true will try to return the correct word root (&#39;cats&#39; -&gt; &#39;cat&#39;). If false returns exactly what was requested. (optional, default to false)
   * @return Example
   */
  @RequestLine("GET /word.json/{word}/topExample?useCanonical={useCanonical}")
  @Headers({
    "Accept: application/json",
  })
  Example getTopExample(@Param("word") String word, @Param("useCanonical") String useCanonical);

  /**
   * Returns a top example for a word
   * 
   * Note, this is equivalent to the other <code>getTopExample</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link GetTopExampleQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param word Word to fetch examples for (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>useCanonical - If true will try to return the correct word root (&#39;cats&#39; -&gt; &#39;cat&#39;). If false returns exactly what was requested. (optional, default to false)</li>
   *   </ul>
   * @return Example
   */
  @RequestLine("GET /word.json/{word}/topExample?useCanonical={useCanonical}")
  @Headers({
  "Accept: application/json",
  })
  Example getTopExample(@Param("word") String word, @QueryMap(encoded=true) Map<String, Object> queryParams);

  /**
   * A convenience class for generating query parameters for the
   * <code>getTopExample</code> method in a fluent style.
   */
  public static class GetTopExampleQueryParams extends HashMap<String, Object> {
    public GetTopExampleQueryParams useCanonical(final String value) {
      put("useCanonical", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Returns word usage over time
   * 
    * @param word Word to return (required)
    * @param useCanonical If true will try to return the correct word root (&#39;cats&#39; -&gt; &#39;cat&#39;). If false returns exactly what was requested. (optional, default to false)
    * @param startYear Starting Year (optional, default to 1800)
    * @param endYear Ending Year (optional, default to 2012)
   * @return FrequencySummary
   */
  @RequestLine("GET /word.json/{word}/frequency?useCanonical={useCanonical}&startYear={startYear}&endYear={endYear}")
  @Headers({
    "Accept: application/json",
  })
  FrequencySummary getWordFrequency(@Param("word") String word, @Param("useCanonical") String useCanonical, @Param("startYear") Integer startYear, @Param("endYear") Integer endYear);

  /**
   * Returns word usage over time
   * 
   * Note, this is equivalent to the other <code>getWordFrequency</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link GetWordFrequencyQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param word Word to return (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>useCanonical - If true will try to return the correct word root (&#39;cats&#39; -&gt; &#39;cat&#39;). If false returns exactly what was requested. (optional, default to false)</li>
   *   <li>startYear - Starting Year (optional, default to 1800)</li>
   *   <li>endYear - Ending Year (optional, default to 2012)</li>
   *   </ul>
   * @return FrequencySummary
   */
  @RequestLine("GET /word.json/{word}/frequency?useCanonical={useCanonical}&startYear={startYear}&endYear={endYear}")
  @Headers({
  "Accept: application/json",
  })
  FrequencySummary getWordFrequency(@Param("word") String word, @QueryMap(encoded=true) Map<String, Object> queryParams);

  /**
   * A convenience class for generating query parameters for the
   * <code>getWordFrequency</code> method in a fluent style.
   */
  public static class GetWordFrequencyQueryParams extends HashMap<String, Object> {
    public GetWordFrequencyQueryParams useCanonical(final String value) {
      put("useCanonical", EncodingUtils.encode(value));
      return this;
    }
    public GetWordFrequencyQueryParams startYear(final Integer value) {
      put("startYear", EncodingUtils.encode(value));
      return this;
    }
    public GetWordFrequencyQueryParams endYear(final Integer value) {
      put("endYear", EncodingUtils.encode(value));
      return this;
    }
  }
}
