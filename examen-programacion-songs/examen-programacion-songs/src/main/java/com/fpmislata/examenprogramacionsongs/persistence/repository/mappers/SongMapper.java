package com.fpmislata.examenprogramacionsongs.persistence.repository.mappers;

import com.fpmislata.examenprogramacionsongs.business.entity.Song;
import com.fpmislata.examenprogramacionsongs.persistence.dao.entity.SongEntity;

public class SongMapper {

    public static Song toSong(SongEntity songEntity) {
        Integer id = songEntity.getId();
        String title = songEntity.getName();
        int year = songEntity.getYear();
        return new Song(id, title, year);

    }
    /*
     * public static List<Song> toSongList(List<SongEntity> songEntityList) {
     * List<Song> songList = new ArrayList<>();
     * for (SongEntity songEntity : songEntityList) {
     * songList.add(toSong(songEntity));
     * }
     * return songList;
     * }
     */

}
