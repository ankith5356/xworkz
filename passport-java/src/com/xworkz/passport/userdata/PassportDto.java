package com.xworkz.passport.userdata;

import com.xworkz.passport.constants.CpvLocation;
import com.xworkz.passport.constants.DcdrLocation;

public class PassportDto {

    // Encapsulation -Grouping of 1 or more data in a

    private CpvLocation cpvLocation;
    private DcdrLocation dcdrLocation;
    private String firstName;
    private String lastName;
    private String dob;
    private  String email;
    private String loginId;
    private String password;
    private String  confirmPassword;
    private String hintQuestion;
    private String hintAnswer;
    private String captcha;


    public void setCpvLocation(CpvLocation cpvLocation){
        this.cpvLocation=cpvLocation;
    }

    public CpvLocation getCpvLocation() {
        return cpvLocation;
    }

    public void setDcdrLocation(DcdrLocation dcdrLocation) {
        this.dcdrLocation = dcdrLocation;
    }

    public DcdrLocation getDcdrLocation() {
        return dcdrLocation;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public String getDob() {
        return dob;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEmail() {
        return email;
    }

    public void setLoginId(String loginId) {
        this.loginId = loginId;
    }

    public String getLoginId() {
        return loginId;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPassword() {
        return password;
    }

    public void setConfirmPassword(String confirmPassword) {
        this.confirmPassword = confirmPassword;
    }

    public String getConfirmPassword() {
        return confirmPassword;
    }

    public void setHintQuestion(String hintQuestion) {
        this.hintQuestion = hintQuestion;
    }

    public String getHintQuestion() {
        return hintQuestion;
    }

    public void setHintAnswer(String hintAnswer) {
        this.hintAnswer = hintAnswer;
    }

    public String getHintAnswer() {
        return hintAnswer;
    }

    public void setCaptcha(String captcha) {
        this.captcha = captcha;
    }

    public String getCaptcha() {
        return captcha;
    }
}
