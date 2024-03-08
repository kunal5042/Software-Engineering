package com.example.demo.commands;

import com.example.demo.entities.Song;
import com.example.demo.services.MusicPlayerService;
import java.util.List;

public class PreviousSongCommand implements ICommand {
    private final MusicPlayerService musicPlayerService;

    public PreviousSongCommand(MusicPlayerService musicPlayerService) {
        this.musicPlayerService = musicPlayerService;
    }

    @Override
    public void invoke(List<String> tokens) {
        // Implementation to handle PREVIOUS_SONG command using musicPlayerService
        Song playing = musicPlayerService.backward(1L);
        System.out.println(String.format("Song [id=%d] is playing!", playing.getId().intValue()));
    }
}
