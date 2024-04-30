package com.ricardodev.screenmatch.main;

import java.util.ArrayList;
import java.util.Collections;

import com.ricardodev.screenmatch.models.Movie;
import com.ricardodev.screenmatch.models.Serie;
import com.ricardodev.screenmatch.models.Title;

public class MainWithLists {
    public static void main(String[] args) {
        Movie toyStory = new Movie("Toy Story", 1995);
        toyStory.rate(10);
        Movie naufrago = new Movie("Náufrago", 2000);
        naufrago.rate(9);
        var newMovie = new Movie("El señor de los anillos", 2001);
        newMovie.rate(7);
        Serie spongeBob = new Serie("SpongeBob", 1999);
        spongeBob.rate(10);

        ArrayList<Title> list = new ArrayList<>();
        list.add(toyStory);
        list.add(naufrago);
        list.add(newMovie);
        list.add(spongeBob);

        for (Title title : list) {
            System.out.println(title.getName());
            if (title instanceof Movie movie) {
                System.out.println(movie.getClassification());
            }
        }

        ArrayList<String> nameList = new ArrayList<>();
        nameList.add("Juan Sánchez");
        nameList.add("Mario Galindo");
        nameList.add("Berenice Rocha");

        System.out.println("Before ordering list" + nameList);
        Collections.sort(nameList);
        System.out.println("Ordered list" + nameList);

        Collections.sort(list);
        System.out.println(list);
    }
}
