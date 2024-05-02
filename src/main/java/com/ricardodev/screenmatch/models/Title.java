package com.ricardodev.screenmatch.models;

import com.google.gson.annotations.SerializedName;
import com.ricardodev.screenmatch.errors.CannotConvertDurationExeption;

public class Title implements Comparable<Title> {
    @SerializedName("Title")
    private String name;
    @SerializedName("Year")
    private int releaseYear;
    private boolean included;
    private int duration;
    private double totalScore;
    private int totalRates;

    public Title(String name, int releaseYear) {
        this.name = name;
        this.releaseYear = releaseYear;
    }

    public Title(TitleOmdb titleOmdb) {
        this.name = titleOmdb.title();
        this.releaseYear = Integer.valueOf(titleOmdb.year());
        if (titleOmdb.runtime().contains("N/A")) {
            throw new CannotConvertDurationExeption("Cannot convert the duration time.");
        }
        this.duration = Integer.valueOf(titleOmdb.runtime().split(" ")[0]);
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
                Title: %s (%s) %d min""".formatted(this.name, this.releaseYear, this.getDuration());
    }

    public void info() {
        System.out.println("Title: %s (%s) %d min".formatted(this.name, this.releaseYear, this.getDuration()));
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
