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


public class Content   {
  private @Valid Long id = null;
  private @Valid Long parentId = null;
  private @Valid Integer level = null;
  private @Valid String slug = null;
  private @Valid String category = null;
public enum TypeEnum {

    PAGE(String.valueOf("PAGE")), NEWS(String.valueOf("NEWS")), LINK(String.valueOf("LINK"));


    private String value;

    TypeEnum (String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    @JsonValue
    public String toString() {
        return String.valueOf(value);
    }

    @JsonCreator
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
  private @Valid List<LocalizedValue> title = new ArrayList<>();
  private @Valid List<LocalizedValue> content = new ArrayList<>();
  private @Valid OffsetDateTime created = null;
  private @Valid OffsetDateTime modified = null;

  /**
   **/
  public Content id(Long id) {
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
  public Content parentId(Long parentId) {
    this.parentId = parentId;
    return this;
  }

  
  //@ApiModelProperty(value = "")
  @JsonProperty("parentId")

  public Long getParentId() {
    return parentId;
  }
  public void setParentId(Long parentId) {
    this.parentId = parentId;
  }

  /**
   **/
  public Content level(Integer level) {
    this.level = level;
    return this;
  }

  
  //@ApiModelProperty(value = "")
  @JsonProperty("level")

  public Integer getLevel() {
    return level;
  }
  public void setLevel(Integer level) {
    this.level = level;
  }

  /**
   **/
  public Content slug(String slug) {
    this.slug = slug;
    return this;
  }

  
  //@ApiModelProperty(value = "")
  @JsonProperty("slug")

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

  
  //@ApiModelProperty(value = "Category slug")
  @JsonProperty("category")

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

  
  //@ApiModelProperty(value = "Content type")
  @JsonProperty("type")

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

  
  //@ApiModelProperty(value = "")
  @JsonProperty("title")

  public List<LocalizedValue> getTitle() {
    return title;
  }
  public void setTitle(List<LocalizedValue> title) {
    this.title = title;
  }

  /**
   **/
  public Content content(List<LocalizedValue> content) {
    this.content = content;
    return this;
  }

  
  //@ApiModelProperty(value = "")
  @JsonProperty("content")

  public List<LocalizedValue> getContent() {
    return content;
  }
  public void setContent(List<LocalizedValue> content) {
    this.content = content;
  }

  /**
   * Create time.
   **/
  public Content created(OffsetDateTime created) {
    this.created = created;
    return this;
  }

  
  //@ApiModelProperty(value = "Create time.")
  @JsonProperty("created")

  public OffsetDateTime getCreated() {
    return created;
  }
  public void setCreated(OffsetDateTime created) {
    this.created = created;
  }

  /**
   * Create time.
   **/
  public Content modified(OffsetDateTime modified) {
    this.modified = modified;
    return this;
  }

  
  //@ApiModelProperty(value = "Create time.")
  @JsonProperty("modified")

  public OffsetDateTime getModified() {
    return modified;
  }
  public void setModified(OffsetDateTime modified) {
    this.modified = modified;
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
        Objects.equals(level, content.level) &&
        Objects.equals(slug, content.slug) &&
        Objects.equals(category, content.category) &&
        Objects.equals(type, content.type) &&
        Objects.equals(title, content.title) &&
        Objects.equals(content, content.content) &&
        Objects.equals(created, content.created) &&
        Objects.equals(modified, content.modified);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, parentId, level, slug, category, type, title, content, created, modified);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Content {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    parentId: ").append(toIndentedString(parentId)).append("\n");
    sb.append("    level: ").append(toIndentedString(level)).append("\n");
    sb.append("    slug: ").append(toIndentedString(slug)).append("\n");
    sb.append("    category: ").append(toIndentedString(category)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    content: ").append(toIndentedString(content)).append("\n");
    sb.append("    created: ").append(toIndentedString(created)).append("\n");
    sb.append("    modified: ").append(toIndentedString(modified)).append("\n");
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
