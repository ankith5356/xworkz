package com.xworkz.passportseva.generatepassport;

import com.xworkz.passportseva.passport.PassportDto;

public class PassportSeva {

    public boolean registerUser(PassportDto passportDto){
        boolean isUserRegistered = false;

            boolean userValidated = validateUser(passportDto);
            if(userValidated == true) {
                isUserRegistered = true;
            }else {
                System.out.println("User Is Not Registered.. Please Try Again later");
                return isUserRegistered;
            }


        return isUserRegistered;
    }

    public boolean validateUser(PassportDto passportDto){
        boolean isUserValidated = false;
            boolean isCpvLocationValid = false;
            boolean isDcdrLocationValid = false;
            boolean isGivenNameValid = false;
            boolean isSurNameValid = false;
            boolean isDobValid = false;
            boolean isEmailValid = false;
            boolean isEmailLoginsameValid = false;
            boolean isLoginIdValid = false;
            boolean isPwdValid = false;
            boolean isConfirmPwdValid = false;
            boolean isHintQues = false;
            boolean isHintAns = false;
            boolean isCaptcha = false;




            if(passportDto.getCpvLocation() != null && !passportDto.getCpvLocation().toString().isEmpty()) {
                isCpvLocationValid = true;
            }else {
                System.out.println("CPV Location is not Valid...");
                return isCpvLocationValid;
            }

            if(passportDto.getDcdrLocation() != null && !passportDto.getDcdrLocation().toString().isEmpty()){
                isDcdrLocationValid = true;
            }else {
                System.out.println("DCDR Location is not Valid...");
                return isDcdrLocationValid;
            }

            if(passportDto.getGivenName() != null && !passportDto.getGivenName().isEmpty()){
                isGivenNameValid = true;
            }else {
                System.out.println("Given Name is not Valid...");
                return isGivenNameValid;
            }

            if(passportDto.getSurName() != null && !passportDto.getSurName().isEmpty()){
                isSurNameValid = true;
            }else {
                System.out.println("SurName is not Valid...");
                return isSurNameValid;
            }

            if(passportDto.getDob() != null && !passportDto.getDob().isEmpty()){
                isDobValid = true;
            }else {
                System.out.println("Date of Birth is not Valid...");
                return isDobValid;
            }

            if(passportDto.getEmail() != null && !passportDto.getEmail().isEmpty()){
                isEmailValid = true;
            }else {
                System.out.println("Email is not Valid...");
                return isEmailValid;
            }

            if(passportDto.getisEmailLoginSame() != false){
                isEmailLoginsameValid = true;
            }
            else{
                System.out.println("Email is not same as Login Id ...");
                return isEmailLoginsameValid;
            }

            if(passportDto.getLoginId() != null && !passportDto.getLoginId().isEmpty()){
                isLoginIdValid = true;
            }else {
                System.out.println("Login Id is not Valid...");
                return isLoginIdValid;
            }

            if(passportDto.getPwd() != null && !passportDto.getPwd().isEmpty()){
                isPwdValid = true;
            }else {
                System.out.println("Passward is not Valid...");
                return isPwdValid;
            }

            if(passportDto.getConfirmPwd() != null && !passportDto.getConfirmPwd().isEmpty() && passportDto.getConfirmPwd() == passportDto.getPwd()){
                isConfirmPwdValid = true;
            }else {
                System.out.println("Confirm Password is not Valid...");
                return isConfirmPwdValid;
            }

            if(passportDto.getHintQues() != null && !passportDto.getHintQues().isEmpty()){
                isHintQues = true;
            }else {
                System.out.println("Hint Question is not Valid...");
                return isHintQues;
            }

            if(passportDto.getHintAns() != null && !passportDto.getHintAns().isEmpty()){
                isHintAns = true;
            }else {
                System.out.println("Hint Answer is not Valid...");
                return isHintAns;
            }

            if(passportDto.getCaptcha() != null && !passportDto.getCaptcha().isEmpty()){
                isCaptcha = true;
            }else {
                System.out.println("captcha is not Valid...");
                return isCaptcha;
            }

            if(isCpvLocationValid == true && isDcdrLocationValid == true && isGivenNameValid == true && isSurNameValid == true && isDobValid == true && isEmailValid == true && isEmailLoginsameValid == true && isPwdValid == true && isConfirmPwdValid == true && isHintAns == true && isHintQues == true && isCaptcha == true){
                isUserValidated = true;
            }else {
                System.out.println("User is not Validated...");
                return isUserValidated;
            }
        return isUserValidated;
    }
}
