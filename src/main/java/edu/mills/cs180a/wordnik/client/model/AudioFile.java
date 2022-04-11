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
import org.threeten.bp.LocalDate;

/**
 * AudioFile
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2022-04-10T17:59:52.032-07:00")
public class AudioFile {
  @JsonProperty("attributionText")
  private String attributionText = null;

  @JsonProperty("attributionUrl")
  private String attributionUrl = null;

  @JsonProperty("audioType")
  private String audioType = null;

  @JsonProperty("commentCount")
  private Integer commentCount = null;

  @JsonProperty("createdAt")
  private LocalDate createdAt = null;

  @JsonProperty("createdBy")
  private String createdBy = null;

  @JsonProperty("description")
  private String description = null;

  @JsonProperty("duration")
  private Double duration = null;

  @JsonProperty("fileUrl")
  private String fileUrl = null;

  @JsonProperty("id")
  private Long id = null;

  @JsonProperty("voteAverage")
  private Float voteAverage = null;

  @JsonProperty("voteCount")
  private Integer voteCount = null;

  @JsonProperty("voteWeightedAverage")
  private Float voteWeightedAverage = null;

  @JsonProperty("word")
  private String word = null;

  public AudioFile attributionText(String attributionText) {
    this.attributionText = attributionText;
    return this;
  }

   /**
   * Get attributionText
   * @return attributionText
  **/
  @ApiModelProperty(value = "")
  public String getAttributionText() {
    return attributionText;
  }

  public void setAttributionText(String attributionText) {
    this.attributionText = attributionText;
  }

  public AudioFile attributionUrl(String attributionUrl) {
    this.attributionUrl = attributionUrl;
    return this;
  }

   /**
   * Get attributionUrl
   * @return attributionUrl
  **/
  @ApiModelProperty(value = "")
  public String getAttributionUrl() {
    return attributionUrl;
  }

  public void setAttributionUrl(String attributionUrl) {
    this.attributionUrl = attributionUrl;
  }

  public AudioFile audioType(String audioType) {
    this.audioType = audioType;
    return this;
  }

   /**
   * Get audioType
   * @return audioType
  **/
  @ApiModelProperty(value = "")
  public String getAudioType() {
    return audioType;
  }

  public void setAudioType(String audioType) {
    this.audioType = audioType;
  }

  public AudioFile commentCount(Integer commentCount) {
    this.commentCount = commentCount;
    return this;
  }

   /**
   * Get commentCount
   * @return commentCount
  **/
  @ApiModelProperty(value = "")
  public Integer getCommentCount() {
    return commentCount;
  }

  public void setCommentCount(Integer commentCount) {
    this.commentCount = commentCount;
  }

  public AudioFile createdAt(LocalDate createdAt) {
    this.createdAt = createdAt;
    return this;
  }

   /**
   * Get createdAt
   * @return createdAt
  **/
  @ApiModelProperty(value = "")
  public LocalDate getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(LocalDate createdAt) {
    this.createdAt = createdAt;
  }

  public AudioFile createdBy(String createdBy) {
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

  public AudioFile description(String description) {
    this.description = description;
    return this;
  }

   /**
   * Get description
   * @return description
  **/
  @ApiModelProperty(value = "")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public AudioFile duration(Double duration) {
    this.duration = duration;
    return this;
  }

   /**
   * Get duration
   * @return duration
  **/
  @ApiModelProperty(value = "")
  public Double getDuration() {
    return duration;
  }

  public void setDuration(Double duration) {
    this.duration = duration;
  }

  public AudioFile fileUrl(String fileUrl) {
    this.fileUrl = fileUrl;
    return this;
  }

   /**
   * Get fileUrl
   * @return fileUrl
  **/
  @ApiModelProperty(value = "")
  public String getFileUrl() {
    return fileUrl;
  }

  public void setFileUrl(String fileUrl) {
    this.fileUrl = fileUrl;
  }

  public AudioFile id(Long id) {
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

  public AudioFile voteAverage(Float voteAverage) {
    this.voteAverage = voteAverage;
    return this;
  }

   /**
   * Get voteAverage
   * @return voteAverage
  **/
  @ApiModelProperty(value = "")
  public Float getVoteAverage() {
    return voteAverage;
  }

  public void setVoteAverage(Float voteAverage) {
    this.voteAverage = voteAverage;
  }

  public AudioFile voteCount(Integer voteCount) {
    this.voteCount = voteCount;
    return this;
  }

   /**
   * Get voteCount
   * @return voteCount
  **/
  @ApiModelProperty(value = "")
  public Integer getVoteCount() {
    return voteCount;
  }

  public void setVoteCount(Integer voteCount) {
    this.voteCount = voteCount;
  }

  public AudioFile voteWeightedAverage(Float voteWeightedAverage) {
    this.voteWeightedAverage = voteWeightedAverage;
    return this;
  }

   /**
   * Get voteWeightedAverage
   * @return voteWeightedAverage
  **/
  @ApiModelProperty(value = "")
  public Float getVoteWeightedAverage() {
    return voteWeightedAverage;
  }

  public void setVoteWeightedAverage(Float voteWeightedAverage) {
    this.voteWeightedAverage = voteWeightedAverage;
  }

  public AudioFile word(String word) {
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
    AudioFile audioFile = (AudioFile) o;
    return Objects.equals(this.attributionText, audioFile.attributionText) &&
        Objects.equals(this.attributionUrl, audioFile.attributionUrl) &&
        Objects.equals(this.audioType, audioFile.audioType) &&
        Objects.equals(this.commentCount, audioFile.commentCount) &&
        Objects.equals(this.createdAt, audioFile.createdAt) &&
        Objects.equals(this.createdBy, audioFile.createdBy) &&
        Objects.equals(this.description, audioFile.description) &&
        Objects.equals(this.duration, audioFile.duration) &&
        Objects.equals(this.fileUrl, audioFile.fileUrl) &&
        Objects.equals(this.id, audioFile.id) &&
        Objects.equals(this.voteAverage, audioFile.voteAverage) &&
        Objects.equals(this.voteCount, audioFile.voteCount) &&
        Objects.equals(this.voteWeightedAverage, audioFile.voteWeightedAverage) &&
        Objects.equals(this.word, audioFile.word);
  }

  @Override
  public int hashCode() {
    return Objects.hash(attributionText, attributionUrl, audioType, commentCount, createdAt, createdBy, description, duration, fileUrl, id, voteAverage, voteCount, voteWeightedAverage, word);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AudioFile {\n");
    
    sb.append("    attributionText: ").append(toIndentedString(attributionText)).append("\n");
    sb.append("    attributionUrl: ").append(toIndentedString(attributionUrl)).append("\n");
    sb.append("    audioType: ").append(toIndentedString(audioType)).append("\n");
    sb.append("    commentCount: ").append(toIndentedString(commentCount)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    createdBy: ").append(toIndentedString(createdBy)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    duration: ").append(toIndentedString(duration)).append("\n");
    sb.append("    fileUrl: ").append(toIndentedString(fileUrl)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    voteAverage: ").append(toIndentedString(voteAverage)).append("\n");
    sb.append("    voteCount: ").append(toIndentedString(voteCount)).append("\n");
    sb.append("    voteWeightedAverage: ").append(toIndentedString(voteWeightedAverage)).append("\n");
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

