package com.Lee.Service;

import com.Lee.Dao.BookMapper;
import com.Lee.Model.BookModel;
import com.Lee.api.QueryBooksService;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

public class QueryBooksServiceImp implements QueryBooksService {
    @Resource
    private BookMapper bookMapper;
    @Override
    public List<BookModel> queryBookListService() {
        List<BookModel> bookList=bookMapper.queryAll();
        if (bookList==null)bookList=new ArrayList<>();
        return bookList;
    }

    @Override
    public List<BookModel> queryBookListServiceByName(String name) {
        return null;
    }

    @Override
    public List<BookModel> queryBookListServiceByAuthor(String author) {
        return null;
    }

    @Override
    public List<BookModel> queryBookListServiceByCategory(String name) {
        return null;
    }
}
