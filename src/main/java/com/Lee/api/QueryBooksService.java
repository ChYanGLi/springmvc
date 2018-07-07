package com.Lee.api;

import com.Lee.Model.BookModel;

import java.util.List;

public interface QueryBooksService {
    /**查询书籍列表信息**/
    List<BookModel> queryBookListService();

    List<BookModel> queryBookListServiceByName(String name);

    List<BookModel> queryBookListServiceByAuthor(String author);

    List<BookModel> queryBookListServiceByCategory(String name);
}
