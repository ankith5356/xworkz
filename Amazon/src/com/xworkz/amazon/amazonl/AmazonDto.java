package com.xworkz.amazon.amazonl;

import com.xworkz.amazon.constants.AccountType;

public class AmazonDto {

    public static AmazonDto amazonDto;
    private AccountType accountType;
    private String fullName;
    private String email;
    private String password;
    private String confirmPassword;
    private String phoneNumber;
    private String address;
    private String securityQuestion;
    private String securityAnswer;
    private String otp;

    // Setters
    public void setAccountType(AccountType accountType) { this.accountType = accountType; }
    public void setFullName(String fullName) { this.fullName = fullName; }
    public void setEmail(String email) { this.email = email; }
    public void setPassword(String password) { this.password = password; }
    public void setConfirmPassword(String confirmPassword) { this.confirmPassword = confirmPassword; }
    public void setPhoneNumber(String phoneNumber) { this.phoneNumber = phoneNumber; }
    public void setAddress(String address) { this.address = address; }
    public void setSecurityQuestion(String securityQuestion) { this.securityQuestion = securityQuestion; }
    public void setSecurityAnswer(String securityAnswer) { this.securityAnswer = securityAnswer; }
    public void setOtp(String otp) { this.otp = otp; }

    // Getters
    public AccountType getAccountType() { return accountType; }
    public String getFullName() { return fullName; }
    public String getEmail() { return email; }
    public String getPassword() { return password; }
    public String getConfirmPassword() { return confirmPassword; }
    public String getPhoneNumber() { return phoneNumber; }
    public String getAddress() { return address; }
    public String getSecurityQuestion() { return securityQuestion; }
    public String getSecurityAnswer() { return securityAnswer; }
    public String getOtp() { return otp; }

    public void displayDetails() {
        System.out.println("Account Type: " + accountType);
        System.out.println("Full Name: " + fullName);
        System.out.println("Email: " + email);
        System.out.println("Phone: " + phoneNumber);
        System.out.println("Address: " + address);
        System.out.println("Security Question: " + securityQuestion);
        System.out.println("Security Answer: " + securityAnswer);
        System.out.println("OTP: " + otp);
        System.out.println("----------------------------------");
    }
}
