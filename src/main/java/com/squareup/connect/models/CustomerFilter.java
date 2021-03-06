/*
 * Square Connect API
 * Client library for accessing the Square Connect APIs
 *
 * OpenAPI spec version: 2.0
 * Contact: developers@squareup.com
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.squareup.connect.models;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.squareup.connect.models.CustomerCreationSourceFilter;
import com.squareup.connect.models.TimeRange;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * Represents a set of [&#x60;CustomerQuery&#x60;](#type-customerquery) filters used to limit the set of Customers returned by [&#x60;SearchCustomers&#x60;](#endpoint-seachcustomers).
 */
@ApiModel(description = "Represents a set of [`CustomerQuery`](#type-customerquery) filters used to limit the set of Customers returned by [`SearchCustomers`](#endpoint-seachcustomers).")

public class CustomerFilter {
  @JsonProperty("creation_source")
  private CustomerCreationSourceFilter creationSource = null;

  @JsonProperty("created_at")
  private TimeRange createdAt = null;

  @JsonProperty("updated_at")
  private TimeRange updatedAt = null;

  public CustomerFilter creationSource(CustomerCreationSourceFilter creationSource) {
    this.creationSource = creationSource;
    return this;
  }

   /**
   * A filter to select customers based on their creation source.
   * @return creationSource
  **/
  @ApiModelProperty(value = "A filter to select customers based on their creation source.")
  public CustomerCreationSourceFilter getCreationSource() {
    return creationSource;
  }

  public void setCreationSource(CustomerCreationSourceFilter creationSource) {
    this.creationSource = creationSource;
  }

  public CustomerFilter createdAt(TimeRange createdAt) {
    this.createdAt = createdAt;
    return this;
  }

   /**
   * A filter to select customers based on when they were created.
   * @return createdAt
  **/
  @ApiModelProperty(value = "A filter to select customers based on when they were created.")
  public TimeRange getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(TimeRange createdAt) {
    this.createdAt = createdAt;
  }

  public CustomerFilter updatedAt(TimeRange updatedAt) {
    this.updatedAt = updatedAt;
    return this;
  }

   /**
   * A filter to select customers based on when they were updated.
   * @return updatedAt
  **/
  @ApiModelProperty(value = "A filter to select customers based on when they were updated.")
  public TimeRange getUpdatedAt() {
    return updatedAt;
  }

  public void setUpdatedAt(TimeRange updatedAt) {
    this.updatedAt = updatedAt;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CustomerFilter customerFilter = (CustomerFilter) o;
    return Objects.equals(this.creationSource, customerFilter.creationSource) &&
        Objects.equals(this.createdAt, customerFilter.createdAt) &&
        Objects.equals(this.updatedAt, customerFilter.updatedAt);
  }

  @Override
  public int hashCode() {
    return Objects.hash(creationSource, createdAt, updatedAt);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CustomerFilter {\n");
    
    sb.append("    creationSource: ").append(toIndentedString(creationSource)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
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

