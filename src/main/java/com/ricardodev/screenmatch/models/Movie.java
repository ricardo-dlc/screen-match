package com.ricardodev.screenmatch.models;

public class Movie {
    public String name;

    boolean included;

    public int releaseYear;

    public int duration;

    private double totalScore;
    private int totalRates;

    public int getTotalRates() {
        return totalRates;
    }

    public void info() {
        System.out.println("The movie is: " + this.name);
        System.out.println("Release year: " + this.releaseYear);
        System.out.println("Duration: " + duration);
    }

    public void rate(double score) {
        totalScore += score;
        totalRates++;
    }

    public double getScore() {
        return totalScore / totalRates;
    }
}
