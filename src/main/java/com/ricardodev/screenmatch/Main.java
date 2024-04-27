package com.ricardodev.screenmatch;

import com.ricardodev.screenmatch.models.Movie;

public class Main {
    public static void main(String[] args) {
        Movie movie = new Movie();
        movie.setName("Toy Story");
        movie.setReleaseYear(1995);
        movie.setDuration(120);
        // movie.info();
        movie.rate(10);
        movie.rate(10);
        System.out.println(movie);
        System.out.println(movie.getTotalRates());
        System.out.println(movie.getScore());
    }
}
