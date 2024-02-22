package com.fpmislata.examenprogramacionsongs.business.service.impl;

import java.util.List;

import com.fpmislata.examenprogramacionsongs.business.entity.Song;
import com.fpmislata.examenprogramacionsongs.business.service.SongService;
import com.fpmislata.examenprogramacionsongs.persistence.repository.SongRepository;

public class SongServiceImpl implements SongService {
    private SongRepository songRepository;

    public SongServiceImpl(SongRepository songRepository) {
        this.songRepository = songRepository;
    }

    @Override
    public List<Song> findAll() {
        return songRepository.findAll();
    }

    @Override
    public Song findById(Integer id) {
        return songRepository.findById(id);
    }

}
