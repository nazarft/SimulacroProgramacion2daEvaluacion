package com.fpmislata.examenprogramacionsongs.business.service;

import java.util.List;

import com.fpmislata.examenprogramacionsongs.business.entity.Singer;

public interface SingerService {
    List<Singer> findAll();

    Singer findById(Integer id);
}
