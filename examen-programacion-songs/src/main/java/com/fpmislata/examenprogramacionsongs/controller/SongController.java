package com.fpmislata.examenprogramacionsongs.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.fpmislata.examenprogramacionsongs.business.entity.Singer;
import com.fpmislata.examenprogramacionsongs.business.entity.Song;
import com.fpmislata.examenprogramacionsongs.business.service.SingerService;
import com.fpmislata.examenprogramacionsongs.business.service.SongService;
import com.fpmislata.examenprogramacionsongs.common.SingerIoC;
import com.fpmislata.examenprogramacionsongs.common.SongIoC;

@Controller
@RequestMapping("/songs")
public class SongController {
    SongService songService;
    SingerService singerService;

    public SongController() {
        this.songService = SongIoC.getSongService();
        this.singerService = SingerIoC.getSingerService();
    }

    @GetMapping("")
    public String findAll(Model model) {
        List<Song> songs = songService.findAll();
        model.addAttribute("songs", songs);
        return "songList.html";
    }

    @GetMapping("/{id}")
    public String findById(Model model, @PathVariable("id") Integer id) {
        List<Singer> singers = singerService.findAll();
        Song song = songService.findById(id);
        model.addAttribute("singer", singers);
        model.addAttribute("song", song);
        return "song.html";
    }
}
