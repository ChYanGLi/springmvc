package com.Lee.Model;

import java.io.Serializable;

public class BookModel implements Serializable {
    private static final long serialVersionUID = 1L;
    private long bookId;
    private String bookName;
    private String author;
    private String description;

    public long getBookId() {
        return bookId;
    }

    public void setBookId(long bookId) {
        this.bookId = bookId;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
    public String toString(){
        return "编号："+bookId+"/n + 书名："+bookName+"/n + 作者："+author+"/n +简介："+description;
    }
}
