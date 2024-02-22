package com.fpmislata.examenprogramacionsongs.persistence.dao.impl;

import java.util.ArrayList;
import java.util.List;

import com.fpmislata.examenprogramacionsongs.persistence.dao.SongDao;
import com.fpmislata.examenprogramacionsongs.persistence.dao.entity.SongEntity;

public class SongDaoImpl implements SongDao {

    List<SongEntity> songEntityList = new ArrayList<>(List.of(
            new SongEntity(1, "Cancion1", 2001, 1),
            new SongEntity(2, "Cancion2", 2002, 2),
            new SongEntity(3, "Cancion3", 2003, 3)));

    @Override
    public List<SongEntity> findAll() {

        return this.songEntityList;
    }

    @Override
    public SongEntity findById(Integer id) {

        for (SongEntity songEntity : songEntityList) {
            if (songEntity.getId() == id) {
                return songEntity;
            }
        }
        return null;
    }

}
