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


public class EmergencyCongestionStatus   {
  private @Valid Long id = null;
  private @Valid Integer value = null;
  private @Valid OffsetDateTime created = null;

  /**
   **/
  public EmergencyCongestionStatus id(Long id) {
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
  public EmergencyCongestionStatus value(Integer value) {
    this.value = value;
    return this;
  }

  
  //@ApiModelProperty(value = "")
  @JsonProperty("value")

  public Integer getValue() {
    return value;
  }
  public void setValue(Integer value) {
    this.value = value;
  }

  /**
   * Create time.
   **/
  public EmergencyCongestionStatus created(OffsetDateTime created) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EmergencyCongestionStatus emergencyCongestionStatus = (EmergencyCongestionStatus) o;
    return Objects.equals(id, emergencyCongestionStatus.id) &&
        Objects.equals(value, emergencyCongestionStatus.value) &&
        Objects.equals(created, emergencyCongestionStatus.created);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, value, created);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EmergencyCongestionStatus {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
    sb.append("    created: ").append(toIndentedString(created)).append("\n");
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
