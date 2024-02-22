package com.fpmislata.examenprogramacionsongs.persistence.repository.impl;

import java.util.List;

import com.fpmislata.examenprogramacionsongs.business.entity.Singer;
import com.fpmislata.examenprogramacionsongs.persistence.dao.SingerDao;
import com.fpmislata.examenprogramacionsongs.persistence.repository.SingerRepository;
import com.fpmislata.examenprogramacionsongs.persistence.repository.mappers.SingerMapper;

public class SingerRepositoryImpl implements SingerRepository {
    private SingerDao singerDao;

    public SingerRepositoryImpl(SingerDao singerDao) {
        this.singerDao = singerDao;
    }

    @Override
    public List<Singer> findAll() {

        return SingerMapper.toSingerList(singerDao.findAll());
    }

    @Override
    public Singer findById(Integer id) {

        return SingerMapper.toSinger(singerDao.findById(id));
    }

}
