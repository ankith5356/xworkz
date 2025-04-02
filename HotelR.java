package com.xworkz.hotel;
import com.xworkz.hotel.hotel.Hotel;
import com.xworkz.hotel.menu.Menu;

public class HotelR {
    public static void main(String[] args) {

        String[] branch ={"Rajajinagar","JP Nagar","Yewantpur"};

        Menu menu[] = new Menu[2];


        Menu menus1 = new  Menu();
        menus1.menuId=1;
        menus1.menuName="Coffee";
        menus1.menuPrice=10;

        Menu menus2 = new  Menu();
        menus2.menuId=2;
        menus2.menuName="Dosa";
        menus2.menuPrice=60;


        menu[0]=menus1;
        menu[1]=menus2;

        Hotel hotel=new Hotel();
        hotel.hotelId=1;
        hotel.location="Jayanagar";
        hotel.branches=branch;


        System.out.println("The hotel Id is :"+hotel.hotelId);
        System.out.println("The hotel Loc is :"+hotel.location);
        System.out.println("The hotel Branches are :"+hotel.branches);
    }


    
}
