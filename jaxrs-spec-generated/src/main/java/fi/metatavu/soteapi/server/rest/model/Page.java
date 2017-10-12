package fi.metatavu.soteapi.server.rest.model;

import fi.metatavu.soteapi.server.rest.model.LocalizedValue;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import javax.validation.constraints.*;
import javax.validation.Valid;


import io.swagger.annotations.*;
import java.util.Objects;


public class Page   {
  
  private @Valid UUID id = null;
  private @Valid String slug = null;
  private @Valid List<LocalizedValue> title = new ArrayList<LocalizedValue>();
  private @Valid UUID parentId = null;

  /**
   **/
  public Page id(UUID id) {
    this.id = id;
    return this;
  }

  
  @ApiModelProperty(value = "")
  public UUID getId() {
    return id;
  }
  public void setId(UUID id) {
    this.id = id;
  }

  /**
   **/
  public Page slug(String slug) {
    this.slug = slug;
    return this;
  }

  
  @ApiModelProperty(value = "")
  public String getSlug() {
    return slug;
  }
  public void setSlug(String slug) {
    this.slug = slug;
  }

  /**
   **/
  public Page title(List<LocalizedValue> title) {
    this.title = title;
    return this;
  }

  
  @ApiModelProperty(value = "")
  public List<LocalizedValue> getTitle() {
    return title;
  }
  public void setTitle(List<LocalizedValue> title) {
    this.title = title;
  }

  /**
   **/
  public Page parentId(UUID parentId) {
    this.parentId = parentId;
    return this;
  }

  
  @ApiModelProperty(value = "")
  public UUID getParentId() {
    return parentId;
  }
  public void setParentId(UUID parentId) {
    this.parentId = parentId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Page page = (Page) o;
    return Objects.equals(id, page.id) &&
        Objects.equals(slug, page.slug) &&
        Objects.equals(title, page.title) &&
        Objects.equals(parentId, page.parentId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, slug, title, parentId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Page {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    slug: ").append(toIndentedString(slug)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    parentId: ").append(toIndentedString(parentId)).append("\n");
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

