package com.example.demo.repositories;

import com.example.demo.entities.MusicPlayer;
import com.example.demo.entities.Playlist;
import com.example.demo.interfaces.IMusicPlayerDataRepo;

import java.util.HashMap;
import java.util.Map;

public class MusicPlayerDataRepo implements IMusicPlayerDataRepo {
    private Map<Long, MusicPlayer> musicMap = new HashMap<>();
    Long autoIncrementId = 1L;

    @Override
    public Long create(Playlist playlist) {
        MusicPlayer musicPlayer = new MusicPlayer(autoIncrementId, playlist);
        autoIncrementId += 1;
        musicMap.put(musicPlayer.getId(), musicPlayer);
        return musicPlayer.getId();
    }

    @Override
    public MusicPlayer getById(Long id) {
        MusicPlayer musicPlayer = musicMap.get(id);
        if (musicPlayer == null) {
            throw new RuntimeException("Music player doesn't exist");
        } else {
            return musicPlayer;
        }
    }
}