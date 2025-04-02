package com.xworkz.movie.Movie;

public class Movie {

    public int movies;
    public String[] movieNames;
    public int noOfMovies;

    public void getDetails(){
        System.out.println("No of Movies "+ movies);
        System.out.println("Movie Names are "+ movieNames);


        if( movieNames!=null){
        for(String movies :movieNames){
            System.out.println(movies +" ");
        }
        }
        else{
            System.out.println("No Movies Available");
        }
        System.out.println();
    }
}
