package com.ricardodev.screenmatch.models;

public class Serie extends Title {

    private int seasons;
    private int episodesBySeason;
    private int durationByEpisode;

    public int getSeasons() {
        return seasons;
    }

    public void setSeasons(int seasons) {
        this.seasons = seasons;
    }

    public int getEpisodesBySeason() {
        return episodesBySeason;
    }

    public void setEpisodesBySeason(int episodesBySeason) {
        this.episodesBySeason = episodesBySeason;
    }

    public int getDurationByEpisode() {
        return durationByEpisode;
    }

    public void setDurationByEpisode(int durationByEpisode) {
        this.durationByEpisode = durationByEpisode;
    }

    @Override
    public int getDuration() {
        return durationByEpisode * episodesBySeason * seasons;
    }
}
