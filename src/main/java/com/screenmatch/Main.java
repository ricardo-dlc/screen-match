package com.screenmatch;

public class Main {
    public static void main(String[] args) {
        Movie movie = new Movie();
        movie.name = "Toy Story";
        movie.releaseYear = 1995;
        movie.duration = 120;
        movie.info();
        movie.rate(10);
        movie.rate(10);
        System.out.println(movie.totalScore);
        System.out.println(movie.totalRates);
        System.out.println(movie.getScore());

        Movie movie2 = new Movie();
        movie2.name = "Toy Story 2";
        movie2.releaseYear = 1998;
        movie2.duration = 125;
        // movie2.info();
    }
}