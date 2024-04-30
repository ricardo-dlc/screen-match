package com.ricardodev.screenmatch.main;

import java.util.ArrayList;

import com.ricardodev.screenmatch.calculations.Recommendation;
import com.ricardodev.screenmatch.calculations.TimeCalculator;
import com.ricardodev.screenmatch.models.Episode;
import com.ricardodev.screenmatch.models.Movie;
import com.ricardodev.screenmatch.models.Serie;

public class Main {
    public static void main(String[] args) {
        Movie movie = new Movie("Toy Story", 1995);
        movie.setDuration(120);
        movie.setIncluded(true);

        movie.info();

        movie.rate(10);
        movie.rate(10);

        System.out.println(movie.getTotalRates());
        System.out.println(movie.getScore());

        Serie spongeBob = new Serie("SpongeBob", 1999);
        spongeBob.setIncluded(true);
        spongeBob.setSeasons(14);
        spongeBob.setDurationByEpisode(25);
        spongeBob.setEpisodesBySeason(20);
        spongeBob.info();

        TimeCalculator list = new TimeCalculator();
        list.add(movie);
        list.add(spongeBob);
        System.out.println(list.getTotalTime());

        Recommendation recommendation = new Recommendation();
        recommendation.filter(movie);

        Episode episode = new Episode();
        episode.setNumber(1);
        episode.setName("Episode Name");
        episode.setSerie(spongeBob);
        episode.setTotalViews(500);

        recommendation.filter(episode);

        var newMovie = new Movie("El señor de los anillos", 2001);
        newMovie.setDuration(180);

        ArrayList<Movie> movieList = new ArrayList<>();
        movieList.add(newMovie);
        movieList.add(movie);

        System.out.println("List size: " + movieList.size());
        System.out.println("First movie is: " + movieList.get(0).getName());

        System.out.println(movieList);
    }
}
