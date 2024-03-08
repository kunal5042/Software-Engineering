package com.example.demo.repositories;

import com.example.demo.entities.Playlist;
    import com.example.demo.interfaces.IPlaylistDataRepo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class PlaylistDataRepo implements IPlaylistDataRepo {
    private HashMap<Long, Playlist> playlistMap = new HashMap<>();
    Long autoIncrementId = 1L;

    @Override
    public Long create() {
        Playlist playlist = new Playlist(autoIncrementId);
        autoIncrementId += 1;
        playlistMap.put(playlist.getId(), playlist);
        return playlist.getId();
    }

    @Override
    public Playlist getById(Long id) {
        return playlistMap.get(id);
    }

    @Override
    public void addSong(Long playlistId, Long songId) {
        Playlist playlist = playlistMap.get(playlistId);
        ArrayList<Long> songs = playlist.getSongs();
        songs.add(songId);
        playlist.setSongs(songs);
    }

    @Override
    public void removeSong(Long playlistId, Long songId) {
        Playlist playlist = playlistMap.get(playlistId);
        ArrayList<Long> songs = playlist.getSongs();
        songs.remove(songId);
        playlist.setSongs(songs);
    }
}
