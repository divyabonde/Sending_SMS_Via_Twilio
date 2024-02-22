package com.sms.SMS_Send.service;

import com.sms.SMS_Send.exception.SMSServiceException;

public interface SMSService {
    void sendSMS(String phoneNumber, String message) throws SMSServiceException;
}
