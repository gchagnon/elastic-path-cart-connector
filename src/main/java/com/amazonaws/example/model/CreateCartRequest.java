package com.amazonaws.example.model;

import java.net.URI;
import java.util.Objects;
import com.amazonaws.example.model.CustomerContext;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.math.BigDecimal;
import java.time.OffsetDateTime;
import org.springframework.format.annotation.DateTimeFormat;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * CreateCartRequest
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-10-14T18:22:55.097480834Z[UTC]", comments = "Generator version: 7.9.0")
public class CreateCartRequest {

  private String name;

  private String description;

  private CustomerContext customerContext;

  private String couponCodes;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private OffsetDateTime created;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private OffsetDateTime modified;

  private Integer totalItems;

  private Integer totalUniqueItems;

  private BigDecimal totalAmount;

  private BigDecimal totalDiscount;

  private BigDecimal totalTax;

  private BigDecimal subTotal;

  private String currency;

  public CreateCartRequest name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Get name
   * @return name
   */
  
  @Schema(name = "name", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("name")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public CreateCartRequest description(String description) {
    this.description = description;
    return this;
  }

  /**
   * Get description
   * @return description
   */
  
  @Schema(name = "description", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("description")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public CreateCartRequest customerContext(CustomerContext customerContext) {
    this.customerContext = customerContext;
    return this;
  }

  /**
   * Get customerContext
   * @return customerContext
   */
  @Valid 
  @Schema(name = "customerContext", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("customerContext")
  public CustomerContext getCustomerContext() {
    return customerContext;
  }

  public void setCustomerContext(CustomerContext customerContext) {
    this.customerContext = customerContext;
  }

  public CreateCartRequest couponCodes(String couponCodes) {
    this.couponCodes = couponCodes;
    return this;
  }

  /**
   * Get couponCodes
   * @return couponCodes
   */
  
  @Schema(name = "couponCodes", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("couponCodes")
  public String getCouponCodes() {
    return couponCodes;
  }

  public void setCouponCodes(String couponCodes) {
    this.couponCodes = couponCodes;
  }

  public CreateCartRequest created(OffsetDateTime created) {
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

  public CreateCartRequest modified(OffsetDateTime modified) {
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

  public CreateCartRequest totalItems(Integer totalItems) {
    this.totalItems = totalItems;
    return this;
  }

  /**
   * Get totalItems
   * @return totalItems
   */
  
  @Schema(name = "totalItems", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("totalItems")
  public Integer getTotalItems() {
    return totalItems;
  }

  public void setTotalItems(Integer totalItems) {
    this.totalItems = totalItems;
  }

  public CreateCartRequest totalUniqueItems(Integer totalUniqueItems) {
    this.totalUniqueItems = totalUniqueItems;
    return this;
  }

  /**
   * Get totalUniqueItems
   * @return totalUniqueItems
   */
  
  @Schema(name = "totalUniqueItems", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("totalUniqueItems")
  public Integer getTotalUniqueItems() {
    return totalUniqueItems;
  }

  public void setTotalUniqueItems(Integer totalUniqueItems) {
    this.totalUniqueItems = totalUniqueItems;
  }

  public CreateCartRequest totalAmount(BigDecimal totalAmount) {
    this.totalAmount = totalAmount;
    return this;
  }

  /**
   * Get totalAmount
   * @return totalAmount
   */
  @Valid 
  @Schema(name = "totalAmount", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("totalAmount")
  public BigDecimal getTotalAmount() {
    return totalAmount;
  }

  public void setTotalAmount(BigDecimal totalAmount) {
    this.totalAmount = totalAmount;
  }

  public CreateCartRequest totalDiscount(BigDecimal totalDiscount) {
    this.totalDiscount = totalDiscount;
    return this;
  }

  /**
   * Get totalDiscount
   * @return totalDiscount
   */
  @Valid 
  @Schema(name = "totalDiscount", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("totalDiscount")
  public BigDecimal getTotalDiscount() {
    return totalDiscount;
  }

  public void setTotalDiscount(BigDecimal totalDiscount) {
    this.totalDiscount = totalDiscount;
  }

  public CreateCartRequest totalTax(BigDecimal totalTax) {
    this.totalTax = totalTax;
    return this;
  }

  /**
   * Get totalTax
   * @return totalTax
   */
  @Valid 
  @Schema(name = "totalTax", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("totalTax")
  public BigDecimal getTotalTax() {
    return totalTax;
  }

  public void setTotalTax(BigDecimal totalTax) {
    this.totalTax = totalTax;
  }

  public CreateCartRequest subTotal(BigDecimal subTotal) {
    this.subTotal = subTotal;
    return this;
  }

  /**
   * Get subTotal
   * @return subTotal
   */
  @Valid 
  @Schema(name = "subTotal", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("subTotal")
  public BigDecimal getSubTotal() {
    return subTotal;
  }

  public void setSubTotal(BigDecimal subTotal) {
    this.subTotal = subTotal;
  }

  public CreateCartRequest currency(String currency) {
    this.currency = currency;
    return this;
  }

  /**
   * Get currency
   * @return currency
   */
  
  @Schema(name = "currency", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("currency")
  public String getCurrency() {
    return currency;
  }

  public void setCurrency(String currency) {
    this.currency = currency;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateCartRequest createCartRequest = (CreateCartRequest) o;
    return Objects.equals(this.name, createCartRequest.name) &&
        Objects.equals(this.description, createCartRequest.description) &&
        Objects.equals(this.customerContext, createCartRequest.customerContext) &&
        Objects.equals(this.couponCodes, createCartRequest.couponCodes) &&
        Objects.equals(this.created, createCartRequest.created) &&
        Objects.equals(this.modified, createCartRequest.modified) &&
        Objects.equals(this.totalItems, createCartRequest.totalItems) &&
        Objects.equals(this.totalUniqueItems, createCartRequest.totalUniqueItems) &&
        Objects.equals(this.totalAmount, createCartRequest.totalAmount) &&
        Objects.equals(this.totalDiscount, createCartRequest.totalDiscount) &&
        Objects.equals(this.totalTax, createCartRequest.totalTax) &&
        Objects.equals(this.subTotal, createCartRequest.subTotal) &&
        Objects.equals(this.currency, createCartRequest.currency);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, description, customerContext, couponCodes, created, modified, totalItems, totalUniqueItems, totalAmount, totalDiscount, totalTax, subTotal, currency);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateCartRequest {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    customerContext: ").append(toIndentedString(customerContext)).append("\n");
    sb.append("    couponCodes: ").append(toIndentedString(couponCodes)).append("\n");
    sb.append("    created: ").append(toIndentedString(created)).append("\n");
    sb.append("    modified: ").append(toIndentedString(modified)).append("\n");
    sb.append("    totalItems: ").append(toIndentedString(totalItems)).append("\n");
    sb.append("    totalUniqueItems: ").append(toIndentedString(totalUniqueItems)).append("\n");
    sb.append("    totalAmount: ").append(toIndentedString(totalAmount)).append("\n");
    sb.append("    totalDiscount: ").append(toIndentedString(totalDiscount)).append("\n");
    sb.append("    totalTax: ").append(toIndentedString(totalTax)).append("\n");
    sb.append("    subTotal: ").append(toIndentedString(subTotal)).append("\n");
    sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
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

