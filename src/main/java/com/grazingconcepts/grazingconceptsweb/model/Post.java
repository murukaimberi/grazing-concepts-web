package com.grazingconcepts.grazingconceptsweb.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.OffsetDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Post {
  private String postId;
  private String postContent;
  private OffsetDateTime postedDate;
}
