package com.ricardodev.screenmatch.models;

import com.ricardodev.screenmatch.calculations.Classification;

public class Movie extends Title implements Classification {
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
