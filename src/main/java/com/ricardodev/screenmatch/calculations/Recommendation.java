package com.ricardodev.screenmatch.calculations;

public class Recommendation {
    public void filter(Classification classification) {
        if (classification.getClassification() >= 4) {
            System.out.println("Good rated");
        } else if (classification.getClassification() >= 2) {
            System.out.println("Popular in this moment");
        } else {
            System.out.println("Add this to your list");
        }
    }
}
