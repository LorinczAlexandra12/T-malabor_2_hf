package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Author
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2021-09-29T20:48:13.993Z[GMT]")


public class Author   {
  @JsonProperty("AuthorName")
  private String authorName = null;

  @JsonProperty("AuthorBirthDate")
  private String authorBirthDate = null;

  public Author authorName(String authorName) {
    this.authorName = authorName;
    return this;
  }

  /**
   * Get authorName
   * @return authorName
   **/
  @Schema(description = "")
  
    public String getAuthorName() {
    return authorName;
  }

  public void setAuthorName(String authorName) {
    this.authorName = authorName;
  }

  public Author authorBirthDate(String authorBirthDate) {
    this.authorBirthDate = authorBirthDate;
    return this;
  }

  /**
   * Get authorBirthDate
   * @return authorBirthDate
   **/
  @Schema(description = "")
  
    public String getAuthorBirthDate() {
    return authorBirthDate;
  }

  public void setAuthorBirthDate(String authorBirthDate) {
    this.authorBirthDate = authorBirthDate;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Author author = (Author) o;
    return Objects.equals(this.authorName, author.authorName) &&
        Objects.equals(this.authorBirthDate, author.authorBirthDate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(authorName, authorBirthDate);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Author {\n");
    
    sb.append("    authorName: ").append(toIndentedString(authorName)).append("\n");
    sb.append("    authorBirthDate: ").append(toIndentedString(authorBirthDate)).append("\n");
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
