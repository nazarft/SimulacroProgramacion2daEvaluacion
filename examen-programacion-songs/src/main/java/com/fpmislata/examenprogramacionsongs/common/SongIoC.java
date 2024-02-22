package com.fpmislata.examenprogramacionsongs.common;

import com.fpmislata.examenprogramacionsongs.business.service.SongService;
import com.fpmislata.examenprogramacionsongs.business.service.impl.SongServiceImpl;
import com.fpmislata.examenprogramacionsongs.persistence.dao.SongDao;
import com.fpmislata.examenprogramacionsongs.persistence.dao.impl.SongDaoImpl;
import com.fpmislata.examenprogramacionsongs.persistence.repository.SongRepository;
import com.fpmislata.examenprogramacionsongs.persistence.repository.impl.SongRepositoryImpl;

public class SongIoC {
    private static SongService songService;
    private static SongRepository songRepository;
    private static SongDao songDao;

    public static SongDao getSongDao() {
        if (songDao == null) {
            songDao = new SongDaoImpl();
        }
        return songDao;
    }

    public static SongRepository getSongRepository() {
        if (songRepository == null) {
            songRepository = new SongRepositoryImpl(getSongDao());
        }
        return songRepository;
    }

    public static SongService getSongService() {

        if (songService == null) {
            songService = new SongServiceImpl(getSongRepository());
        }
        return songService;
    }
}
