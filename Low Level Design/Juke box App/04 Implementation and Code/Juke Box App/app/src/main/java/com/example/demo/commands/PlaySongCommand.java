package com.example.demo.commands;

import com.example.demo.entities.MusicPlayer;
import com.example.demo.services.MusicPlayerService;
import java.util.List;

public class PlaySongCommand implements ICommand {
    private final MusicPlayerService musicPlayerService;

    public PlaySongCommand(MusicPlayerService musicPlayerService) {
        this.musicPlayerService = musicPlayerService;
    }

    @Override
    public void invoke(List<String> tokens) {
        // Implementation to handle PLAY_SONG command using musicPlayerService
        musicPlayerService.play(1L);

    }
}
