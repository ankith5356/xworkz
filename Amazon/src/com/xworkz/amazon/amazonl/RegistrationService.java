package com.xworkz.amazon.amazonl;

import com.xworkz.amazon.amazonl.AmazonDto;

public class RegistrationService {

    public boolean registerUser(AmazonDto userDto) {
        boolean isValid = validateUser(userDto);
        if (isValid) {
            System.out.println("User Registered Successfully!");
        } else {
            System.out.println("User Registration Failed.");
        }
        return isValid;
    }

    public boolean validateUser(AmazonDto userDto) {
        if (userDto.getAccountType() == null) {
            System.out.println("Invalid Account Type.");
            return false;
        }
        if (userDto.getFullName() == null || userDto.getFullName().isEmpty()) {
            System.out.println("Invalid Full Name.");
            return false;
        }
        if (userDto.getEmail() == null || userDto.getEmail().isEmpty()) {
            System.out.println("Invalid Email.");
            return false;
        }
        if (userDto.getPassword() == null || userDto.getPassword().isEmpty()) {
            System.out.println("Password is empty.");
            return false;
        }
        if (!userDto.getPassword().equals(userDto.getConfirmPassword())) {
            System.out.println("Passwords do not match.");
            return false;
        }
        if (userDto.getPhoneNumber() == null || userDto.getPhoneNumber().length() != 10) {
            System.out.println("Invalid Phone Number.");
            return false;
        }
        if (userDto.getAddress() == null || userDto.getAddress().isEmpty()) {
            System.out.println("Address is required.");
            return false;
        }
        if (userDto.getSecurityQuestion() == null || userDto.getSecurityAnswer() == null
                || userDto.getSecurityQuestion().isEmpty() || userDto.getSecurityAnswer().isEmpty()) {
            System.out.println("Security question/answer missing.");
            return false;
        }
        if (userDto.getOtp() == null || userDto.getOtp().length() != 6) {
            System.out.println("Invalid OTP.");
            return false;
        }
        return true;
    }
}
