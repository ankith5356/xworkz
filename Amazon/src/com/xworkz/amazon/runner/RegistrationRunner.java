package com.xworkz.amazon.runner;

import com.xworkz.amazon.amazonl.AmazonDto;
import com.xworkz.amazon.constants.AccountType;
import com.xworkz.amazon.amazonl.RegistrationService;

public class RegistrationRunner {
    public static void main(String[] args) {
        AmazonDto user = new AmazonDto();
        user.setAccountType(AccountType.PERSONAL);
        user.setFullName("Rahul Sharma");
        user.setEmail("rahul.sharma@example.com");
        user.setPassword("Amazon@123");
        user.setConfirmPassword("Amazon@123");
        user.setPhoneNumber("9876543210");
        user.setAddress("123, MG Road, Bengaluru");
        user.setSecurityQuestion("What is your favorite book?");
        user.setSecurityAnswer("Atomic Habits");
        user.setOtp("123456");

        user.displayDetails();

        RegistrationService service = new RegistrationService();
        service.registerUser(user);
    }
}
