package com.example.demo.commands;

import com.example.demo.entities.MusicPlayer;
import com.example.demo.entities.Playlist;
import com.example.demo.services.PlaylistService;

import java.util.ArrayList;
import java.util.List;

public class CreatePlaylistCommand implements ICommand {
    private final PlaylistService playlistService;

    public CreatePlaylistCommand(PlaylistService playlistService) {
        this.playlistService = playlistService;
    }

    @Override
    public void invoke(List<String> tokens) {
        // Implementation to handle CREATE_PLAYLIST command using playlistService
        Long id = playlistService.create();
        ArrayList<Long> songIds = new ArrayList<>();
        int idx = 2;
        while (idx < tokens.size()) {
            songIds.add(Long.parseLong(tokens.get(idx)));
            idx += 1;
        }
        for(Long songId: songIds) {
            playlistService.addSong(id, songId);
        }
        System.out.println(String.format("Playlist [id=%d]", id.intValue()));
    }
}
