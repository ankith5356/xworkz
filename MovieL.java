package com.xworkz.movie.Location;

import com.xworkz.movie.Actors.ActorN;
import com.xworkz.movie.Movie.Movie;

public class MovieL {
    public static void main(String[] args) {
        // Creating Movies
        Movie movie1 = new Movie();
        movie1.noOfMovies = 2;
        movie1.movieNames = new String[]{"Inception", "Interstellar"};

        Movie movie2 = new Movie();
        movie2.noOfMovies = 1;
        movie2.movieNames = new String[]{"The Dark Knight"};

        // Creating Actor
        ActorN actor = new ActorN();
        actor.noOfActor = 2;
        actor.namesA = new String[]{"Leonardo DiCaprio", "Christian Bale"};
        actor.movies = new Movie[]{movie1, movie2}; // Assigning movies

        // Displaying Details
        actor.displayDetails();
    }
}
