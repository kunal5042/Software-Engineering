package com.example.demo.commands;

import com.example.demo.entities.MusicPlayer;
import com.example.demo.entities.Playlist;
import com.example.demo.services.MusicPlayerService;
import com.example.demo.services.PlaylistService;

import java.util.ArrayList;
import java.util.List;

public class LoadPlaylistCommand implements ICommand {
    private final PlaylistService playlistService;
    private final MusicPlayerService musicPlayerService;

    public LoadPlaylistCommand(PlaylistService playlistService, MusicPlayerService musicPlayerService) {
        this.playlistService = playlistService;
      this.musicPlayerService = musicPlayerService;
    }

    @Override
    public void invoke(List<String> tokens) {
        // Implementation to handle LOAD_PLAYLIST command using playlistService
        MusicPlayer musicPlayer;
        int nameTag = tokens.get(1).length();
        int beginIndex = nameTag - 1;
        Long playListId = Long.parseLong(tokens.get(1).substring(beginIndex));
        try {
            musicPlayer = musicPlayerService.getById(1L);
        }catch (Exception e){
            Playlist playlist = playlistService.getById(playListId);
            Long musicPlayerId = musicPlayerService.create(playlist);
            musicPlayer = musicPlayerService.getById(musicPlayerId);
        }
        Playlist playlistToLoad = playlistService.getById(playListId);
        musicPlayer.setPlaylist(playlistToLoad);
        musicPlayer.setSongIds(new ArrayList<>(playlistToLoad.getSongs()));
        musicPlayer.setPlayingSong(false)
        ;
        System.out.printf("Playlist %s is loaded!%n", tokens.get(1));
    }
}
