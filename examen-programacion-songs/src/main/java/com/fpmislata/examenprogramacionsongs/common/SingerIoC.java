package com.fpmislata.examenprogramacionsongs.common;

import com.fpmislata.examenprogramacionsongs.business.service.SingerService;
import com.fpmislata.examenprogramacionsongs.business.service.impl.SingerServiceImpl;
import com.fpmislata.examenprogramacionsongs.persistence.dao.SingerDao;
import com.fpmislata.examenprogramacionsongs.persistence.dao.impl.SingerDaoImpl;
import com.fpmislata.examenprogramacionsongs.persistence.repository.SingerRepository;
import com.fpmislata.examenprogramacionsongs.persistence.repository.impl.SingerRepositoryImpl;

public class SingerIoC {
    private static SingerRepository singerRepository;
    private static SingerService singerService;
    private static SingerDao singerDao;

    public static SingerDao getSingerDao() {
        if (singerDao == null) {
            singerDao = new SingerDaoImpl();
        }
        return singerDao;
    }

    public static SingerRepository getSingerRepository() {
        if (singerRepository == null) {
            singerRepository = new SingerRepositoryImpl(getSingerDao());
        }
        return singerRepository;
    }

    public static SingerService getSingerService() {

        if (singerService == null) {
            singerService = new SingerServiceImpl(getSingerRepository());
        }
        return singerService;
    }
}
