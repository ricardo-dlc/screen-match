package com.screenmatch;

public class Movie {
    String name;

    boolean included;

    int releaseYear;

    int duration;

    double totalScore;
    int totalRates;

    void info() {
        System.out.println("The movie is: " + this.name);
        System.out.println("Release year: " + this.releaseYear);
        System.out.println("Duration: " + duration);
    }

    void rate(double score) {
        totalScore += score;
        totalRates++;
    }

    double getScore() {
        return totalScore / totalRates;
    }
}
