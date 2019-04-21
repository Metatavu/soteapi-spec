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


public class ContentImage   {
  private @Valid Long id = null;
  private @Valid String name = null;
  private @Valid String contentType = null;
  private @Valid Long size = null;
  private @Valid String type = null;

  /**
   **/
  public ContentImage id(Long id) {
    this.id = id;
    return this;
  }

  
  //@ApiModelProperty(value = "")
  @JsonProperty("id")

  public Long getId() {
    return id;
  }
  public void setId(Long id) {
    this.id = id;
  }

  /**
   **/
  public ContentImage name(String name) {
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
  public ContentImage contentType(String contentType) {
    this.contentType = contentType;
    return this;
  }

  
  //@ApiModelProperty(value = "")
  @JsonProperty("contentType")

  public String getContentType() {
    return contentType;
  }
  public void setContentType(String contentType) {
    this.contentType = contentType;
  }

  /**
   **/
  public ContentImage size(Long size) {
    this.size = size;
    return this;
  }

  
  //@ApiModelProperty(value = "")
  @JsonProperty("size")

  public Long getSize() {
    return size;
  }
  public void setSize(Long size) {
    this.size = size;
  }

  /**
   **/
  public ContentImage type(String type) {
    this.type = type;
    return this;
  }

  
  //@ApiModelProperty(value = "")
  @JsonProperty("type")

  public String getType() {
    return type;
  }
  public void setType(String type) {
    this.type = type;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ContentImage contentImage = (ContentImage) o;
    return Objects.equals(id, contentImage.id) &&
        Objects.equals(name, contentImage.name) &&
        Objects.equals(contentType, contentImage.contentType) &&
        Objects.equals(size, contentImage.size) &&
        Objects.equals(type, contentImage.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, contentType, size, type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ContentImage {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    contentType: ").append(toIndentedString(contentType)).append("\n");
    sb.append("    size: ").append(toIndentedString(size)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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
