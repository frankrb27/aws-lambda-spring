package com.cobiscorp.auth.domain;

import java.util.Objects;
import com.cobiscorp.auth.domain.LinkDetail;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Link asociados a la entidad consultada
 */
@ApiModel(description = "Link asociados a la entidad consultada")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2019-06-06T10:06:49.620-05:00[America/Bogota]")

public class Links   {
  @JsonProperty("Self")
  private String self;

  @JsonProperty("First")
  private String first;

  @JsonProperty("Prev")
  private String prev;

  @JsonProperty("Next")
  private String next;

  @JsonProperty("Last")
  private String last;

  @JsonProperty("Navs")
  @Valid
  private List<LinkDetail> navs = null;

  public Links self(String self) {
    this.self = self;
    return this;
  }

  /**
   * Get self
   * @return self
  */
  @ApiModelProperty(value = "")


  public String getSelf() {
    return self;
  }

  public void setSelf(String self) {
    this.self = self;
  }

  public Links first(String first) {
    this.first = first;
    return this;
  }

  /**
   * Get first
   * @return first
  */
  @ApiModelProperty(value = "")


  public String getFirst() {
    return first;
  }

  public void setFirst(String first) {
    this.first = first;
  }

  public Links prev(String prev) {
    this.prev = prev;
    return this;
  }

  /**
   * Get prev
   * @return prev
  */
  @ApiModelProperty(value = "")


  public String getPrev() {
    return prev;
  }

  public void setPrev(String prev) {
    this.prev = prev;
  }

  public Links next(String next) {
    this.next = next;
    return this;
  }

  /**
   * Get next
   * @return next
  */
  @ApiModelProperty(value = "")


  public String getNext() {
    return next;
  }

  public void setNext(String next) {
    this.next = next;
  }

  public Links last(String last) {
    this.last = last;
    return this;
  }

  /**
   * Get last
   * @return last
  */
  @ApiModelProperty(value = "")


  public String getLast() {
    return last;
  }

  public void setLast(String last) {
    this.last = last;
  }

  public Links navs(List<LinkDetail> navs) {
    this.navs = navs;
    return this;
  }

  public Links addNavsItem(LinkDetail navsItem) {
    if (this.navs == null) {
      this.navs = new ArrayList<>();
    }
    this.navs.add(navsItem);
    return this;
  }

  /**
   * Get navs
   * @return navs
  */
  @ApiModelProperty(value = "")

  @Valid

  public List<LinkDetail> getNavs() {
    return navs;
  }

  public void setNavs(List<LinkDetail> navs) {
    this.navs = navs;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Links links = (Links) o;
    return Objects.equals(this.self, links.self) &&
        Objects.equals(this.first, links.first) &&
        Objects.equals(this.prev, links.prev) &&
        Objects.equals(this.next, links.next) &&
        Objects.equals(this.last, links.last) &&
        Objects.equals(this.navs, links.navs);
  }

  @Override
  public int hashCode() {
    return Objects.hash(self, first, prev, next, last, navs);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Links {\n");
    
    sb.append("    self: ").append(toIndentedString(self)).append("\n");
    sb.append("    first: ").append(toIndentedString(first)).append("\n");
    sb.append("    prev: ").append(toIndentedString(prev)).append("\n");
    sb.append("    next: ").append(toIndentedString(next)).append("\n");
    sb.append("    last: ").append(toIndentedString(last)).append("\n");
    sb.append("    navs: ").append(toIndentedString(navs)).append("\n");
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

