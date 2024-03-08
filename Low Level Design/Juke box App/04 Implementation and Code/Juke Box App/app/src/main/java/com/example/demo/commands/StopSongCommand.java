package com.example.demo.commands;

import com.example.demo.entities.Song;
import com.example.demo.services.MusicPlayerService;
import java.util.List;

public class StopSongCommand implements ICommand {
    private final MusicPlayerService musicPlayerService;

    public StopSongCommand(MusicPlayerService musicPlayerService) {
        this.musicPlayerService = musicPlayerService;
    }

    @Override
    public void invoke(List<String> tokens) {
        // Implementation to handle STOP_SONG command using musicPlayerService
        Song stopped = musicPlayerService.stop(1L);
        System.out.printf("Song [id=%d] is stopped!\n", stopped.getId().intValue());
    }
}
