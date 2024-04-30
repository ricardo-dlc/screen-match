package com.ricardodev.screenmatch.models;

public class Title {
    private String name;
    private boolean included;
    private int releaseYear;
    private int duration;
    private double totalScore;
    private int totalRates;

    public Title(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public boolean isIncluded() {
        return included;
    }

    public int getReleaseYear() {
        return releaseYear;
    }

    public int getDuration() {
        return duration;
    }

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

    @Override
    public String toString() {
        return """
                Movie: %s (%s) %dmins
                """.formatted(this.name, this.releaseYear, this.getDuration());
    }

    public void info() {
        System.out.println("Movie: %s (%s) %d mins".formatted(this.name, this.releaseYear, this.getDuration()));
    }

    public void rate(double score) {
        totalScore += score;
        totalRates++;
    }

    public double getScore() {
        return totalScore / totalRates;
    }
}
