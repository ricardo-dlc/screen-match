package com.ricardodev.screenmatch.models;

import com.ricardodev.screenmatch.calculations.Classification;

public class Movie extends Title implements Classification {
    public Movie(String name) {
        super(name);
    }

    private String director;

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    @Override
    public int getClassification() {
        return (int) getScore();
    }
}
