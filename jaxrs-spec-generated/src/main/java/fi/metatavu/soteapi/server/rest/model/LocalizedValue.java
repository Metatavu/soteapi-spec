package fi.metatavu.soteapi.server.rest.model;

import javax.validation.constraints.*;
import javax.validation.Valid;


import io.swagger.annotations.*;
import java.util.Objects;


public class LocalizedValue   {
  
  private @Valid String language = null;
  private @Valid String value = null;

  /**
   **/
  public LocalizedValue language(String language) {
    this.language = language;
    return this;
  }

  
  @ApiModelProperty(value = "")
  public String getLanguage() {
    return language;
  }
  public void setLanguage(String language) {
    this.language = language;
  }

  /**
   **/
  public LocalizedValue value(String value) {
    this.value = value;
    return this;
  }

  
  @ApiModelProperty(value = "")
  public String getValue() {
    return value;
  }
  public void setValue(String value) {
    this.value = value;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LocalizedValue localizedValue = (LocalizedValue) o;
    return Objects.equals(language, localizedValue.language) &&
        Objects.equals(value, localizedValue.value);
  }

  @Override
  public int hashCode() {
    return Objects.hash(language, value);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LocalizedValue {\n");
    
    sb.append("    language: ").append(toIndentedString(language)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
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

