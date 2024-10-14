package com.amazonaws.example.model;

import java.net.URI;
import java.util.Objects;
import com.amazonaws.example.model.Attribute;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.springframework.format.annotation.DateTimeFormat;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * UpdateCartItemRequest
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-10-14T18:22:55.097480834Z[UTC]", comments = "Generator version: 7.9.0")
public class UpdateCartItemRequest {

  private String productId;

  private String sku;

  private Integer quantity;

  @Valid
  private List<@Valid Attribute> attributes = new ArrayList<>();

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private OffsetDateTime created;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private OffsetDateTime modified;

  public UpdateCartItemRequest productId(String productId) {
    this.productId = productId;
    return this;
  }

  /**
   * Get productId
   * @return productId
   */
  
  @Schema(name = "productId", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("productId")
  public String getProductId() {
    return productId;
  }

  public void setProductId(String productId) {
    this.productId = productId;
  }

  public UpdateCartItemRequest sku(String sku) {
    this.sku = sku;
    return this;
  }

  /**
   * Get sku
   * @return sku
   */
  
  @Schema(name = "sku", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("sku")
  public String getSku() {
    return sku;
  }

  public void setSku(String sku) {
    this.sku = sku;
  }

  public UpdateCartItemRequest quantity(Integer quantity) {
    this.quantity = quantity;
    return this;
  }

  /**
   * Get quantity
   * @return quantity
   */
  
  @Schema(name = "quantity", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("quantity")
  public Integer getQuantity() {
    return quantity;
  }

  public void setQuantity(Integer quantity) {
    this.quantity = quantity;
  }

  public UpdateCartItemRequest attributes(List<@Valid Attribute> attributes) {
    this.attributes = attributes;
    return this;
  }

  public UpdateCartItemRequest addAttributesItem(Attribute attributesItem) {
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

  public UpdateCartItemRequest created(OffsetDateTime created) {
    this.created = created;
    return this;
  }

  /**
   * Get created
   * @return created
   */
  @Valid 
  @Schema(name = "created", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("created")
  public OffsetDateTime getCreated() {
    return created;
  }

  public void setCreated(OffsetDateTime created) {
    this.created = created;
  }

  public UpdateCartItemRequest modified(OffsetDateTime modified) {
    this.modified = modified;
    return this;
  }

  /**
   * Get modified
   * @return modified
   */
  @Valid 
  @Schema(name = "modified", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("modified")
  public OffsetDateTime getModified() {
    return modified;
  }

  public void setModified(OffsetDateTime modified) {
    this.modified = modified;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UpdateCartItemRequest updateCartItemRequest = (UpdateCartItemRequest) o;
    return Objects.equals(this.productId, updateCartItemRequest.productId) &&
        Objects.equals(this.sku, updateCartItemRequest.sku) &&
        Objects.equals(this.quantity, updateCartItemRequest.quantity) &&
        Objects.equals(this.attributes, updateCartItemRequest.attributes) &&
        Objects.equals(this.created, updateCartItemRequest.created) &&
        Objects.equals(this.modified, updateCartItemRequest.modified);
  }

  @Override
  public int hashCode() {
    return Objects.hash(productId, sku, quantity, attributes, created, modified);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdateCartItemRequest {\n");
    sb.append("    productId: ").append(toIndentedString(productId)).append("\n");
    sb.append("    sku: ").append(toIndentedString(sku)).append("\n");
    sb.append("    quantity: ").append(toIndentedString(quantity)).append("\n");
    sb.append("    attributes: ").append(toIndentedString(attributes)).append("\n");
    sb.append("    created: ").append(toIndentedString(created)).append("\n");
    sb.append("    modified: ").append(toIndentedString(modified)).append("\n");
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

