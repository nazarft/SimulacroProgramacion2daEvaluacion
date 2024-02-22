package com.fpmislata.examenprogramacionsongs.persistence.dao;

import java.util.List;

import com.fpmislata.examenprogramacionsongs.persistence.dao.entity.SingerEntity;

public interface SingerDao {
    List<SingerEntity> findAll();

    SingerEntity findById(Integer id);
}
