package com.fpmislata.examenprogramacionsongs.persistence.dao;

import java.util.List;

import com.fpmislata.examenprogramacionsongs.persistence.dao.entity.SongEntity;

public interface SongDao {
    List<SongEntity> findAll();

    SongEntity findById(Integer id);
}
