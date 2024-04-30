package com.ricardodev.screenmatch.models;

public class Title implements Comparable<Title> {
    private String name;
    private boolean included;
    private int releaseYear;
    private int duration;
    private double totalScore;
    private int totalRates;

    public Title(String name, int releaseYear) {
        this.name = name;
        this.releaseYear = releaseYear;
    }

    public String getName() {
        return name;
    }

    public boolean isIncluded() {
        return included;
    }

    public void setIncluded(boolean included) {
        this.included = included;
    }

    public int getReleaseYear() {
        return releaseYear;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public int getTotalRates() {
        return totalRates;
    }

    @Override
    public String toString() {
        return """
                Title: %s (%s) %dmins""".formatted(this.name, this.releaseYear, this.getDuration());
    }

    public void info() {
        System.out.println("Title: %s (%s) %d mins".formatted(this.name, this.releaseYear, this.getDuration()));
    }

    public void rate(double score) {
        totalScore += score;
        totalRates++;
    }

    public double getScore() {
        return totalScore / totalRates;
    }

    @Override
    public int compareTo(Title otherTitle) {
        return this.getName().compareTo(otherTitle.getName());
    }
}
