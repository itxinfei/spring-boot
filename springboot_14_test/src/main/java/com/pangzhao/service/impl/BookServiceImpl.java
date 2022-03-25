package com.pangzhao.service.impl;

import com.pangzhao.dao.BookDao;
import com.pangzhao.domain.Book;
import com.pangzhao.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BookServiceImpl implements BookService {

    @Autowired
    private BookDao bookDao;

    @Override
    public boolean save(Book book) {
        return bookDao.insert(book) > 0;
    }
}
