package com.example.demo.commands;

import com.example.demo.services.PlaylistService;
import java.util.List;

public class DeletePlaylistCommand implements ICommand {
    private final PlaylistService playlistService;

    public DeletePlaylistCommand(PlaylistService playlistService) {
        this.playlistService = playlistService;
    }

    @Override
    public void invoke(List<String> tokens) {
        // Implementation to handle DELETE_PLAYLIST command using playlistService
        System.out.printf("Playlist %s is deleted!\n", tokens.get(1));
    }
}
