package com.example.demo.commands;

import com.example.demo.entities.Song;
import com.example.demo.services.MusicPlayerService;
import java.util.List;

public class NextSongCommand implements ICommand {
    private final MusicPlayerService musicPlayerService;

    public NextSongCommand(MusicPlayerService musicPlayerService) {
        this.musicPlayerService = musicPlayerService;
    }

    @Override
    public void invoke(List<String> tokens) {
        // Implementation to handle NEXT_SONG command using musicPlayerService
        Song playing = musicPlayerService.forward(1L);
        System.out.printf("Song [id=%d] is playing!\n", playing.getId().intValue());
    }
}
