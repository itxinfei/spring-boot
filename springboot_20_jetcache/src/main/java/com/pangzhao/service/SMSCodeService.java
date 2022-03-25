package com.pangzhao.service;

import com.pangzhao.domain.SMSCode;

public interface SMSCodeService {
    public String sendCodeToSMS(String tele);
    public boolean checkCode(SMSCode smsCode);
}
