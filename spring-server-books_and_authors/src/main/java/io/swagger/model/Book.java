package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Book
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2021-09-29T20:48:13.993Z[GMT]")


public class Book   {
  @JsonProperty("BookTitle")
  private String bookTitle = null;

  @JsonProperty("BookAuthor")
  private String bookAuthor = null;

  @JsonProperty("PublishingDate")
  private Integer publishingDate = null;

  public Book bookTitle(String bookTitle) {
    this.bookTitle = bookTitle;
    return this;
  }

  /**
   * Get bookTitle
   * @return bookTitle
   **/
  @Schema(description = "")
  
    public String getBookTitle() {
    return bookTitle;
  }

  public void setBookTitle(String bookTitle) {
    this.bookTitle = bookTitle;
  }

  public Book bookAuthor(String bookAuthor) {
    this.bookAuthor = bookAuthor;
    return this;
  }

  /**
   * Get bookAuthor
   * @return bookAuthor
   **/
  @Schema(description = "")
  
    public String getBookAuthor() {
    return bookAuthor;
  }

  public void setBookAuthor(String bookAuthor) {
    this.bookAuthor = bookAuthor;
  }

  public Book publishingDate(Integer publishingDate) {
    this.publishingDate = publishingDate;
    return this;
  }

  /**
   * Get publishingDate
   * @return publishingDate
   **/
  @Schema(description = "")
  
    public Integer getPublishingDate() {
    return publishingDate;
  }

  public void setPublishingDate(Integer publishingDate) {
    this.publishingDate = publishingDate;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Book book = (Book) o;
    return Objects.equals(this.bookTitle, book.bookTitle) &&
        Objects.equals(this.bookAuthor, book.bookAuthor) &&
        Objects.equals(this.publishingDate, book.publishingDate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(bookTitle, bookAuthor, publishingDate);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Book {\n");
    
    sb.append("    bookTitle: ").append(toIndentedString(bookTitle)).append("\n");
    sb.append("    bookAuthor: ").append(toIndentedString(bookAuthor)).append("\n");
    sb.append("    publishingDate: ").append(toIndentedString(publishingDate)).append("\n");
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
