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


public class Survey   {
  private @Valid String name = null;
  private @Valid List<SurveyQuestion> questions = new ArrayList<>();

  /**
   **/
  public Survey name(String name) {
    this.name = name;
    return this;
  }

  
  //@ApiModelProperty(value = "")
  @JsonProperty("name")

  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

  /**
   **/
  public Survey questions(List<SurveyQuestion> questions) {
    this.questions = questions;
    return this;
  }

  
  //@ApiModelProperty(value = "")
  @JsonProperty("questions")

  public List<SurveyQuestion> getQuestions() {
    return questions;
  }
  public void setQuestions(List<SurveyQuestion> questions) {
    this.questions = questions;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Survey survey = (Survey) o;
    return Objects.equals(name, survey.name) &&
        Objects.equals(questions, survey.questions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, questions);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Survey {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    questions: ").append(toIndentedString(questions)).append("\n");
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
