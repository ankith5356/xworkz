package com.xworkz.bbcApp;

import com.xworkz.bbcApp.Constants.News;
import com.xworkz.bbcApp.bbc.BBC;
import com.xworkz.bbcApp.bbcdto.BCCDto;

public class BBCRunner {
    public static void main(String arg[]){

        BCCDto bccDto = new BCCDto();
        bccDto.setEmail("bgsu355");
        bccDto.setName("lures");
        bccDto.setPhnNo(565898643l);
        bccDto.setPreferences(News.International);

        BBC bbc = new BBC();
        if(bbc.User(bccDto)){
            System.out.println("successfull");
        }
        else
            System.out.println("unsuccesfull");
    }

}
