package com.fpmislata.examenprogramacionsongs.persistence.repository.mappers;

import java.util.ArrayList;
import java.util.List;

import com.fpmislata.examenprogramacionsongs.business.entity.Singer;
import com.fpmislata.examenprogramacionsongs.persistence.dao.entity.SingerEntity;

public class SingerMapper {

    public static Singer toSinger(SingerEntity singerEntity) {
        Integer id = singerEntity.getId();
        String name = singerEntity.getName();
        String surname = singerEntity.getSurname();
        return new Singer(id, name, surname);
    }

    public static List<Singer> toSingerList(List<SingerEntity> singerEntityList) {
        List<Singer> singerList = new ArrayList<Singer>();
        for (SingerEntity singerEntity : singerEntityList) {
            singerList.add(toSinger(singerEntity));
        }
        return singerList;
    }

}
