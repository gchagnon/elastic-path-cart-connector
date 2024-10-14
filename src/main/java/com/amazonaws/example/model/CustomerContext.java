package com.amazonaws.example.model;

import java.net.URI;
import java.util.Objects;
import com.amazonaws.example.model.Attribute;
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
 * CustomerContext
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-10-14T18:22:55.097480834Z[UTC]", comments = "Generator version: 7.9.0")
public class CustomerContext {

  private String id;

  private String customerType;

  @Valid
  private List<@Valid Attribute> attributes = new ArrayList<>();

  public CustomerContext id(String id) {
    this.id = id;
    return this;
  }

  /**
   * The customer's unique ID.
   * @return id
   */
  
  @Schema(name = "id", description = "The customer's unique ID.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("id")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public CustomerContext customerType(String customerType) {
    this.customerType = customerType;
    return this;
  }

  /**
   * The type of customer.
   * @return customerType
   */
  
  @Schema(name = "customerType", description = "The type of customer.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("customerType")
  public String getCustomerType() {
    return customerType;
  }

  public void setCustomerType(String customerType) {
    this.customerType = customerType;
  }

  public CustomerContext attributes(List<@Valid Attribute> attributes) {
    this.attributes = attributes;
    return this;
  }

  public CustomerContext addAttributesItem(Attribute attributesItem) {
    if (this.attributes == null) {
      this.attributes = new ArrayList<>();
    }
    this.attributes.add(attributesItem);
    return this;
  }

  /**
   * Get attributes
   * @return attributes
   */
  @Valid 
  @Schema(name = "attributes", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("attributes")
  public List<@Valid Attribute> getAttributes() {
    return attributes;
  }

  public void setAttributes(List<@Valid Attribute> attributes) {
    this.attributes = attributes;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CustomerContext customerContext = (CustomerContext) o;
    return Objects.equals(this.id, customerContext.id) &&
        Objects.equals(this.customerType, customerContext.customerType) &&
        Objects.equals(this.attributes, customerContext.attributes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, customerType, attributes);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CustomerContext {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    customerType: ").append(toIndentedString(customerType)).append("\n");
    sb.append("    attributes: ").append(toIndentedString(attributes)).append("\n");
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

