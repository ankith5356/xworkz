package com.xworkz.movie.Actors;

import com.xworkz.movie.Movie.Movie;

public class ActorN {
    public int noOfActor;
    public String[] namesA;
    public Movie[] movies;

    public void  displayDetails(){
    System.out.println("No of Actors are "+noOfActor);
    System.out.println("Actor Names  are "+ namesA);
    System.out.println("Movies are :");

if (movies!=null){
for (Movie names :movies) {
    names.getDetails();
}
} else{
    System.out.println("NO Movies Found");
    }

    }
}
