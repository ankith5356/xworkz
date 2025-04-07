package com.xworkz.passportseva;

import com.xworkz.passportseva.constants.CpvLocation;
import com.xworkz.passportseva.constants.DcdrLocation;
import com.xworkz.passportseva.generatepassport.PassportSeva;
import com.xworkz.passportseva.passport.PassportDto;

public class PassportSevaRunner {

    public static void main(String[] args) {

        PassportDto passportDto = new PassportDto();
        passportDto.setCpvLocation(CpvLocation.PassportOffice);
        passportDto.setDcdrLocation(DcdrLocation.Bengaluru);
        passportDto.setGivenName("");
        passportDto.setSurName("Sarkar1");
        passportDto.setDob("09-06-1977");
        passportDto.setEmail("arjuna0906@gmail.com");
        passportDto.setEmailLoginSame(true);
        passportDto.setLoginId("arjuna0906@gmail.com");
        passportDto.setPwd("Sarkar#1977");
        passportDto.setConfirmPwd("Sarkar#1977");
        passportDto.setHintQues("What is Nick Name?");
        passportDto.setHintAns("NINGA");
        passportDto.setCaptcha("HGCRTX");
        passportDto.displayDetails();

        PassportSeva passportSeva = new PassportSeva();
        passportSeva.registerUser(passportDto);
        
    }
}
