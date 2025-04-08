package com.xworkz.tinderApp;

import com.xworkz.tinderApp.Constants.Gender;
import com.xworkz.tinderApp.tinder.Tinder;
import com.xworkz.tinderApp.tinderdto.TinderDto;

public class TinderRunner {
    public static void main(String arg[]){

        TinderDto tinderDto = new TinderDto();
        tinderDto.setEmail("bgs@gmail.com");
        tinderDto.setName("kjc");
        tinderDto.setPhnNo(563827643743l);
        tinderDto.setGender(Gender.female);

        Tinder flipkart = new Tinder();
        if(flipkart.User(tinderDto)){
            System.out.println("successfull");
        }
        else
            System.out.println("unsuccesfull");
    }

}
