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
import edu.mills.cs180a.wordnik.client.model.ContentProvider;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.threeten.bp.OffsetDateTime;

/**
 * WordOfTheDay
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2022-04-10T17:59:52.032-07:00")
public class WordOfTheDay {
  @JsonProperty("category")
  private String category = null;

  @JsonProperty("contentProvider")
  private ContentProvider contentProvider = null;

  @JsonProperty("createdAt")
  private OffsetDateTime createdAt = null;

  @JsonProperty("createdBy")
  private String createdBy = null;

  @JsonProperty("definitions")
  private List<Object> definitions = null;

  @JsonProperty("examples")
  private List<Object> examples = null;

  @JsonProperty("htmlExtra")
  private String htmlExtra = null;

  @JsonProperty("id")
  private Long id = null;

  @JsonProperty("note")
  private String note = null;

  @JsonProperty("parentId")
  private String parentId = null;

  @JsonProperty("publishDate")
  private OffsetDateTime publishDate = null;

  @JsonProperty("word")
  private String word = null;

  public WordOfTheDay category(String category) {
    this.category = category;
    return this;
  }

   /**
   * Get category
   * @return category
  **/
  @ApiModelProperty(value = "")
  public String getCategory() {
    return category;
  }

  public void setCategory(String category) {
    this.category = category;
  }

  public WordOfTheDay contentProvider(ContentProvider contentProvider) {
    this.contentProvider = contentProvider;
    return this;
  }

   /**
   * Get contentProvider
   * @return contentProvider
  **/
  @ApiModelProperty(value = "")
  public ContentProvider getContentProvider() {
    return contentProvider;
  }

  public void setContentProvider(ContentProvider contentProvider) {
    this.contentProvider = contentProvider;
  }

  public WordOfTheDay createdAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
    return this;
  }

   /**
   * Get createdAt
   * @return createdAt
  **/
  @ApiModelProperty(value = "")
  public OffsetDateTime getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
  }

  public WordOfTheDay createdBy(String createdBy) {
    this.createdBy = createdBy;
    return this;
  }

   /**
   * Get createdBy
   * @return createdBy
  **/
  @ApiModelProperty(value = "")
  public String getCreatedBy() {
    return createdBy;
  }

  public void setCreatedBy(String createdBy) {
    this.createdBy = createdBy;
  }

  public WordOfTheDay definitions(List<Object> definitions) {
    this.definitions = definitions;
    return this;
  }

  public WordOfTheDay addDefinitionsItem(Object definitionsItem) {
    if (this.definitions == null) {
      this.definitions = new ArrayList<Object>();
    }
    this.definitions.add(definitionsItem);
    return this;
  }

   /**
   * Get definitions
   * @return definitions
  **/
  @ApiModelProperty(value = "")
  public List<Object> getDefinitions() {
    return definitions;
  }

  public void setDefinitions(List<Object> definitions) {
    this.definitions = definitions;
  }

  public WordOfTheDay examples(List<Object> examples) {
    this.examples = examples;
    return this;
  }

  public WordOfTheDay addExamplesItem(Object examplesItem) {
    if (this.examples == null) {
      this.examples = new ArrayList<Object>();
    }
    this.examples.add(examplesItem);
    return this;
  }

   /**
   * Get examples
   * @return examples
  **/
  @ApiModelProperty(value = "")
  public List<Object> getExamples() {
    return examples;
  }

  public void setExamples(List<Object> examples) {
    this.examples = examples;
  }

  public WordOfTheDay htmlExtra(String htmlExtra) {
    this.htmlExtra = htmlExtra;
    return this;
  }

   /**
   * Get htmlExtra
   * @return htmlExtra
  **/
  @ApiModelProperty(value = "")
  public String getHtmlExtra() {
    return htmlExtra;
  }

  public void setHtmlExtra(String htmlExtra) {
    this.htmlExtra = htmlExtra;
  }

  public WordOfTheDay id(Long id) {
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

  public WordOfTheDay note(String note) {
    this.note = note;
    return this;
  }

   /**
   * Get note
   * @return note
  **/
  @ApiModelProperty(value = "")
  public String getNote() {
    return note;
  }

  public void setNote(String note) {
    this.note = note;
  }

  public WordOfTheDay parentId(String parentId) {
    this.parentId = parentId;
    return this;
  }

   /**
   * Get parentId
   * @return parentId
  **/
  @ApiModelProperty(value = "")
  public String getParentId() {
    return parentId;
  }

  public void setParentId(String parentId) {
    this.parentId = parentId;
  }

  public WordOfTheDay publishDate(OffsetDateTime publishDate) {
    this.publishDate = publishDate;
    return this;
  }

   /**
   * Get publishDate
   * @return publishDate
  **/
  @ApiModelProperty(value = "")
  public OffsetDateTime getPublishDate() {
    return publishDate;
  }

  public void setPublishDate(OffsetDateTime publishDate) {
    this.publishDate = publishDate;
  }

  public WordOfTheDay word(String word) {
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
    WordOfTheDay wordOfTheDay = (WordOfTheDay) o;
    return Objects.equals(this.category, wordOfTheDay.category) &&
        Objects.equals(this.contentProvider, wordOfTheDay.contentProvider) &&
        Objects.equals(this.createdAt, wordOfTheDay.createdAt) &&
        Objects.equals(this.createdBy, wordOfTheDay.createdBy) &&
        Objects.equals(this.definitions, wordOfTheDay.definitions) &&
        Objects.equals(this.examples, wordOfTheDay.examples) &&
        Objects.equals(this.htmlExtra, wordOfTheDay.htmlExtra) &&
        Objects.equals(this.id, wordOfTheDay.id) &&
        Objects.equals(this.note, wordOfTheDay.note) &&
        Objects.equals(this.parentId, wordOfTheDay.parentId) &&
        Objects.equals(this.publishDate, wordOfTheDay.publishDate) &&
        Objects.equals(this.word, wordOfTheDay.word);
  }

  @Override
  public int hashCode() {
    return Objects.hash(category, contentProvider, createdAt, createdBy, definitions, examples, htmlExtra, id, note, parentId, publishDate, word);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WordOfTheDay {\n");
    
    sb.append("    category: ").append(toIndentedString(category)).append("\n");
    sb.append("    contentProvider: ").append(toIndentedString(contentProvider)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    createdBy: ").append(toIndentedString(createdBy)).append("\n");
    sb.append("    definitions: ").append(toIndentedString(definitions)).append("\n");
    sb.append("    examples: ").append(toIndentedString(examples)).append("\n");
    sb.append("    htmlExtra: ").append(toIndentedString(htmlExtra)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    note: ").append(toIndentedString(note)).append("\n");
    sb.append("    parentId: ").append(toIndentedString(parentId)).append("\n");
    sb.append("    publishDate: ").append(toIndentedString(publishDate)).append("\n");
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

