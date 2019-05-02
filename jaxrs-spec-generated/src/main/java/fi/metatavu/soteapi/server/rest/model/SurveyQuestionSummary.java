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


public class SurveyQuestionSummary   {
  private @Valid Long positive = null;
  private @Valid Long negative = null;
  private @Valid Long total = null;

  /**
   **/
  public SurveyQuestionSummary positive(Long positive) {
    this.positive = positive;
    return this;
  }

  
  //@ApiModelProperty(value = "")
  @JsonProperty("positive")

  public Long getPositive() {
    return positive;
  }
  public void setPositive(Long positive) {
    this.positive = positive;
  }

  /**
   **/
  public SurveyQuestionSummary negative(Long negative) {
    this.negative = negative;
    return this;
  }

  
  //@ApiModelProperty(value = "")
  @JsonProperty("negative")

  public Long getNegative() {
    return negative;
  }
  public void setNegative(Long negative) {
    this.negative = negative;
  }

  /**
   **/
  public SurveyQuestionSummary total(Long total) {
    this.total = total;
    return this;
  }

  
  //@ApiModelProperty(value = "")
  @JsonProperty("total")

  public Long getTotal() {
    return total;
  }
  public void setTotal(Long total) {
    this.total = total;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SurveyQuestionSummary surveyQuestionSummary = (SurveyQuestionSummary) o;
    return Objects.equals(positive, surveyQuestionSummary.positive) &&
        Objects.equals(negative, surveyQuestionSummary.negative) &&
        Objects.equals(total, surveyQuestionSummary.total);
  }

  @Override
  public int hashCode() {
    return Objects.hash(positive, negative, total);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SurveyQuestionSummary {\n");
    
    sb.append("    positive: ").append(toIndentedString(positive)).append("\n");
    sb.append("    negative: ").append(toIndentedString(negative)).append("\n");
    sb.append("    total: ").append(toIndentedString(total)).append("\n");
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
