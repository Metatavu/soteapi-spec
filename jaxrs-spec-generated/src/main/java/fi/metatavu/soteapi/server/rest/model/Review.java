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


public class Review   {
  private @Valid Long id = null;
  private @Valid Long productId = null;
  private @Valid Integer rating = null;
  private @Valid OffsetDateTime created = null;
  private @Valid OffsetDateTime modified = null;
  private @Valid String review = null;
  private @Valid String location = null;

  /**
   **/
  public Review id(Long id) {
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
  public Review productId(Long productId) {
    this.productId = productId;
    return this;
  }

  
  //@ApiModelProperty(value = "")
  @JsonProperty("productId")

  public Long getProductId() {
    return productId;
  }
  public void setProductId(Long productId) {
    this.productId = productId;
  }

  /**
   **/
  public Review rating(Integer rating) {
    this.rating = rating;
    return this;
  }

  
  //@ApiModelProperty(value = "")
  @JsonProperty("rating")

  public Integer getRating() {
    return rating;
  }
  public void setRating(Integer rating) {
    this.rating = rating;
  }

  /**
   * Create time.
   **/
  public Review created(OffsetDateTime created) {
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
  public Review modified(OffsetDateTime modified) {
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

  /**
   **/
  public Review review(String review) {
    this.review = review;
    return this;
  }

  
  //@ApiModelProperty(value = "")
  @JsonProperty("review")

  public String getReview() {
    return review;
  }
  public void setReview(String review) {
    this.review = review;
  }

  /**
   **/
  public Review location(String location) {
    this.location = location;
    return this;
  }

  
  //@ApiModelProperty(value = "")
  @JsonProperty("location")

  public String getLocation() {
    return location;
  }
  public void setLocation(String location) {
    this.location = location;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Review review = (Review) o;
    return Objects.equals(id, review.id) &&
        Objects.equals(productId, review.productId) &&
        Objects.equals(rating, review.rating) &&
        Objects.equals(created, review.created) &&
        Objects.equals(modified, review.modified) &&
        Objects.equals(review, review.review) &&
        Objects.equals(location, review.location);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, productId, rating, created, modified, review, location);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Review {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    productId: ").append(toIndentedString(productId)).append("\n");
    sb.append("    rating: ").append(toIndentedString(rating)).append("\n");
    sb.append("    created: ").append(toIndentedString(created)).append("\n");
    sb.append("    modified: ").append(toIndentedString(modified)).append("\n");
    sb.append("    review: ").append(toIndentedString(review)).append("\n");
    sb.append("    location: ").append(toIndentedString(location)).append("\n");
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
