package com.gwf.book.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Repository;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Repository
public class BooksInfor {

  private long bookId;
  private String bookName;
  private String bookAuthor;
  private String uploadDate;
  private String bookImg;



}
