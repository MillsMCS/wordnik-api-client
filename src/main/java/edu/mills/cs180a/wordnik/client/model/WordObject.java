/*
 * api.wordnik.com
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: 4.0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package edu.mills.cs180a.wordnik.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

/**
 * WordObject
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2022-04-10T17:59:52.032-07:00")
public class WordObject {
  @JsonProperty("canonicalForm")
  private String canonicalForm = null;

  @JsonProperty("id")
  private Long id = null;

  @JsonProperty("originalWord")
  private String originalWord = null;

  @JsonProperty("suggestions")
  private List<String> suggestions = null;

  @JsonProperty("vulgar")
  private String vulgar = null;

  @JsonProperty("word")
  private String word = null;

  public WordObject canonicalForm(String canonicalForm) {
    this.canonicalForm = canonicalForm;
    return this;
  }

   /**
   * Get canonicalForm
   * @return canonicalForm
  **/
  @ApiModelProperty(value = "")
  public String getCanonicalForm() {
    return canonicalForm;
  }

  public void setCanonicalForm(String canonicalForm) {
    this.canonicalForm = canonicalForm;
  }

  public WordObject id(Long id) {
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @ApiModelProperty(required = true, value = "")
  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public WordObject originalWord(String originalWord) {
    this.originalWord = originalWord;
    return this;
  }

   /**
   * Get originalWord
   * @return originalWord
  **/
  @ApiModelProperty(value = "")
  public String getOriginalWord() {
    return originalWord;
  }

  public void setOriginalWord(String originalWord) {
    this.originalWord = originalWord;
  }

  public WordObject suggestions(List<String> suggestions) {
    this.suggestions = suggestions;
    return this;
  }

  public WordObject addSuggestionsItem(String suggestionsItem) {
    if (this.suggestions == null) {
      this.suggestions = new ArrayList<String>();
    }
    this.suggestions.add(suggestionsItem);
    return this;
  }

   /**
   * Get suggestions
   * @return suggestions
  **/
  @ApiModelProperty(value = "")
  public List<String> getSuggestions() {
    return suggestions;
  }

  public void setSuggestions(List<String> suggestions) {
    this.suggestions = suggestions;
  }

  public WordObject vulgar(String vulgar) {
    this.vulgar = vulgar;
    return this;
  }

   /**
   * Get vulgar
   * @return vulgar
  **/
  @ApiModelProperty(value = "")
  public String getVulgar() {
    return vulgar;
  }

  public void setVulgar(String vulgar) {
    this.vulgar = vulgar;
  }

  public WordObject word(String word) {
    this.word = word;
    return this;
  }

   /**
   * Get word
   * @return word
  **/
  @ApiModelProperty(value = "")
  public String getWord() {
    return word;
  }

  public void setWord(String word) {
    this.word = word;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WordObject wordObject = (WordObject) o;
    return Objects.equals(this.canonicalForm, wordObject.canonicalForm) &&
        Objects.equals(this.id, wordObject.id) &&
        Objects.equals(this.originalWord, wordObject.originalWord) &&
        Objects.equals(this.suggestions, wordObject.suggestions) &&
        Objects.equals(this.vulgar, wordObject.vulgar) &&
        Objects.equals(this.word, wordObject.word);
  }

  @Override
  public int hashCode() {
    return Objects.hash(canonicalForm, id, originalWord, suggestions, vulgar, word);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WordObject {\n");
    
    sb.append("    canonicalForm: ").append(toIndentedString(canonicalForm)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    originalWord: ").append(toIndentedString(originalWord)).append("\n");
    sb.append("    suggestions: ").append(toIndentedString(suggestions)).append("\n");
    sb.append("    vulgar: ").append(toIndentedString(vulgar)).append("\n");
    sb.append("    word: ").append(toIndentedString(word)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

