package com.example.demo.commands;

import com.example.demo.services.SongService;
import lombok.extern.flogger.Flogger;
import lombok.extern.java.Log;
import lombok.extern.slf4j.Slf4j;

import java.util.ArrayList;
import java.util.List;

public class ListSongsCommand implements ICommand {
    private final SongService songService;

    public ListSongsCommand(SongService songService) {
        this.songService = songService;
    }

    @Override
    public void invoke(List<String> tokens) {
        // Implementation to handle LIST_SONGS command using songService
        ArrayList<Long> songIds = songService.getAllSongs();
        String result = "[";
        for(Long songId: songIds){
            result += String.format("Song [id=%d], ", songId.intValue());
        }
        result = result.substring(0, result.length()-2) + "]";
        System.out.println(result);
    }
}
