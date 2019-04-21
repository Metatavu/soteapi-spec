package fi.metatavu.soteapi.server.rest.model;

import java.util.UUID;
import java.util.List;
import java.time.OffsetDateTime;
import java.time.LocalDate;
import java.util.ArrayList;
import fi.metatavu.soteapi.server.rest.model.*;
import javax.validation.constraints.*;
import javax.validation.Valid;


import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Gets or Sets EmergencyCongestionStatusListSort
 */
public enum EmergencyCongestionStatusListSort {
  DESC("CREATED_DESC"),
    ASC("CREATED_ASC");

  private String value;

  EmergencyCongestionStatusListSort(String value) {
    this.value = value;
  }

  @Override
  @JsonValue
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static EmergencyCongestionStatusListSort fromValue(String text) {
    for (EmergencyCongestionStatusListSort b : EmergencyCongestionStatusListSort.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }
}
