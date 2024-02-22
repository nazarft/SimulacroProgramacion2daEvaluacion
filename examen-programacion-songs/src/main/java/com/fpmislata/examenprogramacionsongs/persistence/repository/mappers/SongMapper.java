package com.fpmislata.examenprogramacionsongs.persistence.repository.mappers;

import java.util.ArrayList;
import java.util.List;

import com.fpmislata.examenprogramacionsongs.business.entity.Singer;
import com.fpmislata.examenprogramacionsongs.business.entity.Song;
import com.fpmislata.examenprogramacionsongs.common.SingerIoC;
import com.fpmislata.examenprogramacionsongs.persistence.dao.SingerDao;
import com.fpmislata.examenprogramacionsongs.persistence.dao.entity.SingerEntity;
import com.fpmislata.examenprogramacionsongs.persistence.dao.entity.SongEntity;

public class SongMapper {

    public static Song toSong(SongEntity songEntity) {
        SingerDao singerDao = SingerIoC.getSingerDao();
        SingerEntity singerEntity = singerDao.findById(songEntity.getIdSinger());
        Integer id = songEntity.getId();
        String title = songEntity.getName();
        int year = songEntity.getYear();
        Singer singer = SingerMapper.toSinger(singerEntity);
        return new Song(id, title, year, singer);

    }

    public static List<Song> toSongList(List<SongEntity> songEntityList) {
        List<Song> songList = new ArrayList<>();
        for (SongEntity songEntity : songEntityList) {
            songList.add(toSong(songEntity));
        }
        return songList;
    }

}
