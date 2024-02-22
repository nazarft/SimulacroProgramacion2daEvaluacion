package com.fpmislata.examenprogramacionsongs.persistence.dao.entity;

public class SongEntity {
    private Integer id;
    private String name;
    private int year;
    private Integer idSinger;

    public SongEntity(Integer id, String name, int year, Integer idSinger) {
        this.id = id;
        this.name = name;
        this.year = year;
        this.idSinger = idSinger;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public Integer getIdSinger() {
        return idSinger;
    }

    public void setIdSinger(Integer idSinger) {
        this.idSinger = idSinger;
    }

}
