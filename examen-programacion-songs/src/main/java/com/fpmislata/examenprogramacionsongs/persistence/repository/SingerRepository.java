package com.fpmislata.examenprogramacionsongs.persistence.repository;

import java.util.List;

import com.fpmislata.examenprogramacionsongs.business.entity.Singer;

public interface SingerRepository {
    List<Singer> findAll();

    Singer findById(Integer id);
}
