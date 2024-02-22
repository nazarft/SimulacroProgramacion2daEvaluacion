package com.fpmislata.examenprogramacionsongs.business.service;

import java.util.List;

import com.fpmislata.examenprogramacionsongs.business.entity.Song;

public interface SongService {
    List<Song> findAll();

    Song findById(Integer id);
}
