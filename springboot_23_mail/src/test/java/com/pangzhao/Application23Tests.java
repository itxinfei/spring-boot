package com.pangzhao;

import com.pangzhao.service.SendMailService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class Application23Tests {

    @Autowired
    private SendMailService sendMailService;

    @Test
    void contextLoads() {
        sendMailService.sendMail();
    }
}
