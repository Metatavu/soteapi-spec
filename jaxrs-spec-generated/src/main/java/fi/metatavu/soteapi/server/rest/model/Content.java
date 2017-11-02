package fi.metatavu.soteapi.server.rest.model;

import fi.metatavu.soteapi.server.rest.model.LocalizedValue;
import java.util.ArrayList;
import java.util.List;
import javax.validation.constraints.*;
import javax.validation.Valid;


import io.swagger.annotations.*;
import java.util.Objects;


public class Content   {
  
  private @Valid Long id = null;
  private @Valid Long parentId = null;
  private @Valid String slug = null;
  private @Valid String category = null;

public enum TypeEnum {

    PAGE(String.valueOf("PAGE")), NEWS(String.valueOf("NEWS"));


    private String value;

    TypeEnum (String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static TypeEnum fromValue(String v) {
        for (TypeEnum b : TypeEnum.values()) {
            if (String.valueOf(b.value).equals(v)) {
                return b;
            }
        }
        return null;
    }
}

  private @Valid TypeEnum type = null;
  private @Valid List<LocalizedValue> title = new ArrayList<LocalizedValue>();

  /**
   **/
  public Content id(Long id) {
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
  public Content parentId(Long parentId) {
    this.parentId = parentId;
    return this;
  }

  
  @ApiModelProperty(value = "")
  public Long getParentId() {
    return parentId;
  }
  public void setParentId(Long parentId) {
    this.parentId = parentId;
  }

  /**
   **/
  public Content slug(String slug) {
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
   * Category slug
   **/
  public Content category(String category) {
    this.category = category;
    return this;
  }

  
  @ApiModelProperty(value = "Category slug")
  public String getCategory() {
    return category;
  }
  public void setCategory(String category) {
    this.category = category;
  }

  /**
   * Content type
   **/
  public Content type(TypeEnum type) {
    this.type = type;
    return this;
  }

  
  @ApiModelProperty(value = "Content type")
  public TypeEnum getType() {
    return type;
  }
  public void setType(TypeEnum type) {
    this.type = type;
  }

  /**
   **/
  public Content title(List<LocalizedValue> title) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Content content = (Content) o;
    return Objects.equals(id, content.id) &&
        Objects.equals(parentId, content.parentId) &&
        Objects.equals(slug, content.slug) &&
        Objects.equals(category, content.category) &&
        Objects.equals(type, content.type) &&
        Objects.equals(title, content.title);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, parentId, slug, category, type, title);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Content {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    parentId: ").append(toIndentedString(parentId)).append("\n");
    sb.append("    slug: ").append(toIndentedString(slug)).append("\n");
    sb.append("    category: ").append(toIndentedString(category)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
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

