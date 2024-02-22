package com.fpmislata.examenprogramacionsongs.business.service.impl;

import java.util.List;

import com.fpmislata.examenprogramacionsongs.business.entity.Singer;
import com.fpmislata.examenprogramacionsongs.business.service.SingerService;
import com.fpmislata.examenprogramacionsongs.persistence.repository.SingerRepository;

public class SingerServiceImpl implements SingerService {
    private SingerRepository singerRepository;

    public SingerServiceImpl(SingerRepository singerRepository) {
        this.singerRepository = singerRepository;
    }

    @Override
    public List<Singer> findAll() {
        return singerRepository.findAll();
    }

    @Override
    public Singer findById(Integer id) {
        return singerRepository.findById(id);
    }

}
