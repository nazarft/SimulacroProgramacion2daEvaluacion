package com.fpmislata.examenprogramacionsongs.persistence.dao.impl;

import java.util.ArrayList;
import java.util.List;

import com.fpmislata.examenprogramacionsongs.persistence.dao.SingerDao;
import com.fpmislata.examenprogramacionsongs.persistence.dao.entity.SingerEntity;

public class SingerDaoImpl implements SingerDao {

    List<SingerEntity> singerEntityList = new ArrayList<>(List.of(
            new SingerEntity(1, "Singer1", "Surname1"),
            new SingerEntity(2, "Singer2", "Surname2"),
            new SingerEntity(3, "Singer3", "Surname3")));

    @Override
    public List<SingerEntity> findAll() {

        return this.singerEntityList;
    }

    @Override
    public SingerEntity findById(Integer id) {

        for (SingerEntity singerEntity : singerEntityList) {
            if (singerEntity.getId() == id) {
                return singerEntity;
            }
        }
        return null;
    }

}
