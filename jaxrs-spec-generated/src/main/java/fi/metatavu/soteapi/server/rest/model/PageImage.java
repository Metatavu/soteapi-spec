package fi.metatavu.soteapi.server.rest.model;

import javax.validation.constraints.*;
import javax.validation.Valid;


import io.swagger.annotations.*;
import java.util.Objects;


public class PageImage   {
  
  private @Valid Long id = null;
  private @Valid String name = null;
  private @Valid String contentType = null;
  private @Valid Long size = null;
  private @Valid String type = null;

  /**
   **/
  public PageImage id(Long id) {
    this.id = id;
    return this;
  }

  
  @ApiModelProperty(value = "")
  public Long getId() {
    return id;
  }
  public void setId(Long id) {
    this.id = id;
  }

  /**
   **/
  public PageImage name(String name) {
    this.name = name;
    return this;
  }

  
  @ApiModelProperty(value = "")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

  /**
   **/
  public PageImage contentType(String contentType) {
    this.contentType = contentType;
    return this;
  }

  
  @ApiModelProperty(value = "")
  public String getContentType() {
    return contentType;
  }
  public void setContentType(String contentType) {
    this.contentType = contentType;
  }

  /**
   **/
  public PageImage size(Long size) {
    this.size = size;
    return this;
  }

  
  @ApiModelProperty(value = "")
  public Long getSize() {
    return size;
  }
  public void setSize(Long size) {
    this.size = size;
  }

  /**
   **/
  public PageImage type(String type) {
    this.type = type;
    return this;
  }

  
  @ApiModelProperty(value = "")
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
    PageImage pageImage = (PageImage) o;
    return Objects.equals(id, pageImage.id) &&
        Objects.equals(name, pageImage.name) &&
        Objects.equals(contentType, pageImage.contentType) &&
        Objects.equals(size, pageImage.size) &&
        Objects.equals(type, pageImage.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, contentType, size, type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PageImage {\n");
    
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

