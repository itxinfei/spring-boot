package com.pangzhao;

import com.pangzhao.dao.BookDao;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest(classes = Application04.class)
public class Application04Tests {
    //1.注入你要测试的对象
    @Autowired
    private BookDao bookDao;

    @Test
    void contextLoads() {
        //2.执行要测试的对象对应的方法
        bookDao.save();
        System.out.println("two...");
    }

}
