package com.Lee.Dao;

import com.Lee.Model.BookModel;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface BookMapper {
   public List<BookModel> queryAll();
   public List<BookModel> queryByName(@Param("bookName") String bookName);
   public List<BookModel> queryByAuthor(@Param("author") String author);
}
