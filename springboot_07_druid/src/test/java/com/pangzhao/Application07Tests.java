package com.pangzhao;

import com.pangzhao.dao.BookDao;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class Application07Tests {

    @Autowired
    private BookDao bookDao;
    @Test
    void contextLoads() {
        System.out.println(bookDao.getById(3));
    }

}
