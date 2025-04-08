package com.xworkz.passport;
import com.xworkz.passport.constants.CpvLocation;
import com.xworkz.passport.constants.DcdrLocation;
import com.xworkz.passport.userdata.PassportDto;
public class PassportRunner {
    public static void main(String[] args) {
        PassportDto ref = new PassportDto();
        ref.setFirstName("Baba");
        ref.setCpvLocation(CpvLocation.Bengaluru);
        ref.setDcdrLocation(DcdrLocation.MYSORE);
        ref.setLastName("Ramdev");
        ref.setDob("12-4-1843");
        ref.setEmail("baba@gmail.com");
        ref.setPassword("12345");
        ref.setConfirmPassword("12345");
        ref.setHintQuestion("Birth Place");
        ref.setHintAnswer("Vizag");
        ref.setCaptcha("wertd");
        ref.setLoginId("baba343");



    }
}
