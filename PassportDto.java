package com.xworkz.passportseva.passport;

import com.xworkz.passportseva.constants.CpvLocation;
import com.xworkz.passportseva.constants.DcdrLocation;

public class PassportDto {

    public static PassportDto passportDto;
    private CpvLocation cpvLocation ;
    private DcdrLocation dcdrLocation ;
    private String givenName ;
    private String surName ;
    private String dob ;
    private String email ;
    private boolean emailLoginSame ;
    private String loginId ;
    private String pwd ;
    private String confirmPwd ;
    private String hintQues ;
    private String hintAns ;
    private String captcha ;

    // mutators
    public void setCpvLocation(CpvLocation cpvLocation){
        this.cpvLocation = cpvLocation;
    }

    public void setDcdrLocation(DcdrLocation dcdrLocation){
        this.dcdrLocation = dcdrLocation;
    }

    public void setGivenName(String givenName){
        this.givenName = givenName;
    }

    public void setSurName(String surName){
        this.surName = surName;
    }

    public void setDob(String dob){
        this.dob = dob;
    }

    public void setEmail(String email){
        this.email = email;
    }

    public void setEmailLoginSame(boolean emailLoginSame){
        this.emailLoginSame = emailLoginSame;
    }

    public void setLoginId(String loginId){
        this.loginId = loginId;
    }

    public void setPwd(String pwd){
        this.pwd = pwd;
    }

    public void setConfirmPwd(String confirmPwd){
        this.confirmPwd = confirmPwd;
    }

    public void setHintQues(String hintQues){
        this.hintQues = hintQues;
    }

    public void setHintAns(String hintAns){
        this.hintAns = hintAns;
    }

    public void setCaptcha(String captcha){
        this.captcha = captcha;
    }

    // Accesors
    public CpvLocation getCpvLocation(){
        return  cpvLocation;
    }

    public DcdrLocation getDcdrLocation(){
        return dcdrLocation;
    }

    public String getGivenName(){
        return givenName;
    }

    public String getSurName(){
        return surName;
    }

    public String getDob(){
        return dob;
    }

    public String getEmail(){
        return email;
    }

    public boolean getisEmailLoginSame(){
        return emailLoginSame;
    }

    public String getLoginId(){
        return loginId;
    }

    public String getPwd(){
        return pwd;
    }

    public String getConfirmPwd(){
        return confirmPwd;
    }

    public String getHintQues(){
        return hintQues;
    }

    public String getHintAns(){
        return hintAns;
    }

    public String getCaptcha(){
        return captcha;
    }

    public void displayDetails(){
        System.out.println("CPV Location: "+cpvLocation);
        System.out.println("DCDR Location: "+dcdrLocation);
        System.out.println("Given Name: "+givenName);
        System.out.println("SurName: "+surName);
        System.out.println("Date of Birth: "+dob);
        System.out.println("Email: "+email);
        System.out.println("Is Email  is same as login ID: "+emailLoginSame);
        System.out.println("Login Id: "+loginId);
        System.out.println("Password: "+pwd);
        System.out.println("Confirm Password: "+confirmPwd);
        System.out.println("Hint Question: "+hintQues);
        System.out.println("Hint Answer: "+hintAns);
        System.out.println("Captcha: "+captcha);
        System.out.println("--------------------");

    }



}
