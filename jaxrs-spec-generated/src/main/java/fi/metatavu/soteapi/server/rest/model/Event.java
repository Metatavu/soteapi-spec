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


public class Event   {
  private @Valid Long id = null;
  private @Valid String slug = null;
  private @Valid String category = null;
  private @Valid List<LocalizedValue> title = new ArrayList<>();
  private @Valid List<LocalizedValue> description = new ArrayList<>();
  private @Valid LocalDate startDate = null;
  private @Valid String startTime = null;
  private @Valid LocalDate endDate = null;
  private @Valid String endTime = null;
  private @Valid Boolean allDay = null;

  /**
   **/
  public Event id(Long id) {
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
  public Event slug(String slug) {
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
  public Event category(String category) {
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
   **/
  public Event title(List<LocalizedValue> title) {
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
  public Event description(List<LocalizedValue> description) {
    this.description = description;
    return this;
  }

  
  //@ApiModelProperty(value = "")
  @JsonProperty("description")

  public List<LocalizedValue> getDescription() {
    return description;
  }
  public void setDescription(List<LocalizedValue> description) {
    this.description = description;
  }

  /**
   * Event&#x27;s start date.
   **/
  public Event startDate(LocalDate startDate) {
    this.startDate = startDate;
    return this;
  }

  
  //@ApiModelProperty(value = "Event's start date.")
  @JsonProperty("startDate")

  public LocalDate getStartDate() {
    return startDate;
  }
  public void setStartDate(LocalDate startDate) {
    this.startDate = startDate;
  }

  /**
   * Event&#x27;s start time.
   **/
  public Event startTime(String startTime) {
    this.startTime = startTime;
    return this;
  }

  
  //@ApiModelProperty(value = "Event's start time.")
  @JsonProperty("startTime")

  public String getStartTime() {
    return startTime;
  }
  public void setStartTime(String startTime) {
    this.startTime = startTime;
  }

  /**
   * Event&#x27;s end date.
   **/
  public Event endDate(LocalDate endDate) {
    this.endDate = endDate;
    return this;
  }

  
  //@ApiModelProperty(value = "Event's end date.")
  @JsonProperty("endDate")

  public LocalDate getEndDate() {
    return endDate;
  }
  public void setEndDate(LocalDate endDate) {
    this.endDate = endDate;
  }

  /**
   * Event&#x27;s end time.
   **/
  public Event endTime(String endTime) {
    this.endTime = endTime;
    return this;
  }

  
  //@ApiModelProperty(value = "Event's end time.")
  @JsonProperty("endTime")

  public String getEndTime() {
    return endTime;
  }
  public void setEndTime(String endTime) {
    this.endTime = endTime;
  }

  /**
   **/
  public Event allDay(Boolean allDay) {
    this.allDay = allDay;
    return this;
  }

  
  //@ApiModelProperty(value = "")
  @JsonProperty("allDay")

  public Boolean isisAllDay() {
    return allDay;
  }
  public void setAllDay(Boolean allDay) {
    this.allDay = allDay;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Event event = (Event) o;
    return Objects.equals(id, event.id) &&
        Objects.equals(slug, event.slug) &&
        Objects.equals(category, event.category) &&
        Objects.equals(title, event.title) &&
        Objects.equals(description, event.description) &&
        Objects.equals(startDate, event.startDate) &&
        Objects.equals(startTime, event.startTime) &&
        Objects.equals(endDate, event.endDate) &&
        Objects.equals(endTime, event.endTime) &&
        Objects.equals(allDay, event.allDay);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, slug, category, title, description, startDate, startTime, endDate, endTime, allDay);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Event {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    slug: ").append(toIndentedString(slug)).append("\n");
    sb.append("    category: ").append(toIndentedString(category)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    startDate: ").append(toIndentedString(startDate)).append("\n");
    sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
    sb.append("    endDate: ").append(toIndentedString(endDate)).append("\n");
    sb.append("    endTime: ").append(toIndentedString(endTime)).append("\n");
    sb.append("    allDay: ").append(toIndentedString(allDay)).append("\n");
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
