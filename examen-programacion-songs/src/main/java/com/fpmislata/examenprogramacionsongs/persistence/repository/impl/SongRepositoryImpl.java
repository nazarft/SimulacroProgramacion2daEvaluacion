package com.fpmislata.examenprogramacionsongs.persistence.repository.impl;

import java.util.List;

import com.fpmislata.examenprogramacionsongs.business.entity.Song;
import com.fpmislata.examenprogramacionsongs.persistence.dao.SongDao;
import com.fpmislata.examenprogramacionsongs.persistence.repository.SongRepository;
import com.fpmislata.examenprogramacionsongs.persistence.repository.mappers.SongMapper;

public class SongRepositoryImpl implements SongRepository {
    private SongDao songDao;

    public SongRepositoryImpl(SongDao songDao) {
        this.songDao = songDao;
    }

    @Override
    public List<Song> findAll() {
        return SongMapper.toSongList(songDao.findAll());
    }

    @Override
    public Song findById(Integer id) {
        return SongMapper.toSong(songDao.findById(id));
    }

}
