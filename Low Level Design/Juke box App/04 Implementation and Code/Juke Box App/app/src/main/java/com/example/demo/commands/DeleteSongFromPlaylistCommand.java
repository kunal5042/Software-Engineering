package com.example.demo.commands;

import com.example.demo.entities.MusicPlayer;
import com.example.demo.entities.Playlist;
import com.example.demo.services.PlaylistService;

import java.util.ArrayList;
import java.util.List;

public class DeleteSongFromPlaylistCommand implements ICommand {
    private final PlaylistService playlistService;

    public DeleteSongFromPlaylistCommand(PlaylistService playlistService) {
        this.playlistService = playlistService;
    }

    @Override
    public void invoke(List<String> tokens) {
        // Implementation to handle DELETE_SONG_FROM_PLAYLIST command using playlistService
        int nameTag = tokens.get(1).length();
        int beginIndex = nameTag - 1;
        Long playListId = Long.parseLong(tokens.get(1).substring(beginIndex));
        ArrayList<Long> songIds = new ArrayList<>();
        int idx = 2;
        while (idx < tokens.size()) {
            songIds.add(Long.parseLong(tokens.get(idx)));
            idx += 1;
        }
        for(Long songId: songIds) {
            playlistService.removeSong(playListId, songId);
        }
        songIds = new ArrayList<>(playlistService.getById(playListId).getSongs());
        String result = "[";
        for(Long songId: songIds){
            result += String.format("Song [id=%d], ", songId.intValue());
        }
        result = result.substring(0, result.length()-2) + "]";
        System.out.printf("Playlist %s is revised with %s\n", tokens.get(1), result);
    }
}
