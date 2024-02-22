package com.fpmislata.examenprogramacionsongs.persistence.repository;

import java.util.List;

import com.fpmislata.examenprogramacionsongs.business.entity.Song;

public interface SongRepository {
    List<Song> findAll();

    Song findById(Integer id);

}
