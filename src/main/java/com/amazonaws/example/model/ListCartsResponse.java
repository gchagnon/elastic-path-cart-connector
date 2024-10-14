package com.amazonaws.example.model;

import java.net.URI;
import java.util.Objects;
import com.amazonaws.example.model.CartSummary;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * ListCartsResponse
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-10-14T18:22:55.097480834Z[UTC]", comments = "Generator version: 7.9.0")
public class ListCartsResponse {

  private Integer nextToken;

  @Valid
  private List<@Valid CartSummary> items = new ArrayList<>();

  public ListCartsResponse nextToken(Integer nextToken) {
    this.nextToken = nextToken;
    return this;
  }

  /**
   * Get nextToken
   * @return nextToken
   */
  
  @Schema(name = "nextToken", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("nextToken")
  public Integer getNextToken() {
    return nextToken;
  }

  public void setNextToken(Integer nextToken) {
    this.nextToken = nextToken;
  }

  public ListCartsResponse items(List<@Valid CartSummary> items) {
    this.items = items;
    return this;
  }

  public ListCartsResponse addItemsItem(CartSummary itemsItem) {
    if (this.items == null) {
      this.items = new ArrayList<>();
    }
    this.items.add(itemsItem);
    return this;
  }

  /**
   * Get items
   * @return items
   */
  @Valid 
  @Schema(name = "items", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("items")
  public List<@Valid CartSummary> getItems() {
    return items;
  }

  public void setItems(List<@Valid CartSummary> items) {
    this.items = items;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ListCartsResponse listCartsResponse = (ListCartsResponse) o;
    return Objects.equals(this.nextToken, listCartsResponse.nextToken) &&
        Objects.equals(this.items, listCartsResponse.items);
  }

  @Override
  public int hashCode() {
    return Objects.hash(nextToken, items);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ListCartsResponse {\n");
    sb.append("    nextToken: ").append(toIndentedString(nextToken)).append("\n");
    sb.append("    items: ").append(toIndentedString(items)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

