package org.sgic.training.firstSpringProduct.service;

public interface EmailService {
    void sendEmail(String userName, String to, String subject, String body);
}
