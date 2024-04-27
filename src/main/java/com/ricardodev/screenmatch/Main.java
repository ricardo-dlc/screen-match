package com.ricardodev.screenmatch;

import com.ricardodev.screenmatch.models.Movie;

public class Main {
    public static void main(String[] args) {
        Movie movie = new Movie();
        movie.name = "Toy Story";
        movie.releaseYear = 1995;
        movie.duration = 120;
        movie.info();
        movie.rate(10);
        movie.rate(10);
        System.out.println(movie.getTotalRates());
        System.out.println(movie.getScore());
    }
}
