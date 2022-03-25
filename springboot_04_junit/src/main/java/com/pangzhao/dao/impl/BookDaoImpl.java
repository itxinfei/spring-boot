package com.pangzhao.dao.impl;

import com.pangzhao.dao.BookDao;
import org.springframework.stereotype.Repository;

@Repository
public class BookDaoImpl implements BookDao {
    @Override
    public void save() {
        System.out.println("book dao is running ...");
    }
}
