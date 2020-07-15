package com.grazingconcepts.grazingconceptsweb.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Comment {
  private String commentId;
  private String comment;
  private int rating;
}
