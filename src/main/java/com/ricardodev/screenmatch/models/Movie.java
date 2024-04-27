package com.ricardodev.screenmatch.models;

public class Movie {
    private String name;

    private boolean included;

    private int releaseYear;

    private int duration;

    private double totalScore;

    private int totalRates;

    public void setName(String name) {
        this.name = name;
    }

    public void setIncluded(boolean included) {
        this.included = included;
    }

    public void setReleaseYear(int releaseYear) {
        this.releaseYear = releaseYear;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public int getTotalRates() {
        return totalRates;
    }

    public String toString() {
        return """
                The movie is: %s
                Release year: %s
                Duration: %dmins""".formatted(this.name, this.releaseYear, this.duration);
    }

    public void info() {
        System.out.println("The movie is: " + this.name);
        System.out.println("Release year: " + this.releaseYear);
        System.out.println("Duration: " + this.duration);
    }

    public void rate(double score) {
        totalScore += score;
        totalRates++;
    }

    public double getScore() {
        return totalScore / totalRates;
    }
}