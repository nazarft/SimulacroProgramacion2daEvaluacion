package com.fpmislata.examenprogramacionsongs.business.entity;

public class Song {
    private Integer id;
    private String title;
    private int year;
    private Singer singer;

    public Singer getSinger() {
        return singer;
    }

    public Song(Integer id, String title, int year, Singer singer) {
        this.id = id;
        this.title = title;
        this.year = year;
        this.singer = singer;
    }

    public void setSinger(Singer singer) {
        this.singer = singer;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
}
