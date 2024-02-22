package com.fpmislata.examenprogramacionsongs.persistence.repository.impl;

import java.util.ArrayList;
import java.util.List;

import com.fpmislata.examenprogramacionsongs.business.entity.Singer;
import com.fpmislata.examenprogramacionsongs.business.entity.Song;
import com.fpmislata.examenprogramacionsongs.common.SingerIoC;
import com.fpmislata.examenprogramacionsongs.persistence.dao.SongDao;
import com.fpmislata.examenprogramacionsongs.persistence.dao.entity.SingerEntity;
import com.fpmislata.examenprogramacionsongs.persistence.dao.entity.SongEntity;
import com.fpmislata.examenprogramacionsongs.persistence.repository.SongRepository;
import com.fpmislata.examenprogramacionsongs.persistence.repository.mappers.SingerMapper;
import com.fpmislata.examenprogramacionsongs.persistence.repository.mappers.SongMapper;

public class SongRepositoryImpl implements SongRepository {
    private SongDao songDao;

    public SongRepositoryImpl(SongDao songDao) {
        this.songDao = songDao;
    }

    @Override
    public List<Song> findAll() {
        List<Song> songs = new ArrayList<>();
        Song song;
        for (SongEntity songEntity : songDao.findAll()) {
            song = findById(songEntity.getId());
            songs.add(song);

        }
        return songs;
    }

    @Override
    public Song findById(Integer id) {
        SongEntity songEntity = songDao.findById(id);
        Song song = SongMapper.toSong(songEntity);
        SingerEntity singerEntity = SingerIoC.getSingerDao().findById(songEntity.getIdSinger());
        Singer singer = SingerMapper.toSinger(singerEntity);
        song.setSinger(singer);
        return song;
    }

}
