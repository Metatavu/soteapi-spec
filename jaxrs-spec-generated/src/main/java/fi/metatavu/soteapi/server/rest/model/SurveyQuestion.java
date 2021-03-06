package fi.metatavu.soteapi.server.rest.model;

import java.util.UUID;
import java.util.List;
import java.time.OffsetDateTime;
import java.time.LocalDate;
import java.util.ArrayList;
import fi.metatavu.soteapi.server.rest.model.*;
import javax.validation.constraints.*;
import javax.validation.Valid;


import io.swagger.v3.oas.annotations.*;
import io.swagger.v3.oas.annotations.media.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonCreator;


public class SurveyQuestion   {
  private @Valid Long number = null;
  private @Valid String question = null;

  /**
   **/
  public SurveyQuestion number(Long number) {
    this.number = number;
    return this;
  }

  
  //@ApiModelProperty(value = "")
  @JsonProperty("number")

  public Long getNumber() {
    return number;
  }
  public void setNumber(Long number) {
    this.number = number;
  }

  /**
   **/
  public SurveyQuestion question(String question) {
    this.question = question;
    return this;
  }

  
  //@ApiModelProperty(value = "")
  @JsonProperty("question")

  public String getQuestion() {
    return question;
  }
  public void setQuestion(String question) {
    this.question = question;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SurveyQuestion surveyQuestion = (SurveyQuestion) o;
    return Objects.equals(number, surveyQuestion.number) &&
        Objects.equals(question, surveyQuestion.question);
  }

  @Override
  public int hashCode() {
    return Objects.hash(number, question);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SurveyQuestion {\n");
    
    sb.append("    number: ").append(toIndentedString(number)).append("\n");
    sb.append("    question: ").append(toIndentedString(question)).append("\n");
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
