package com.example.demo.repositories;

import com.example.demo.entities.Song;
import com.example.demo.interfaces.ISongDataRepo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class SongDataRepo implements ISongDataRepo {
    private Map<Long, Song> songMap = new HashMap<>();
    private Long autoIncrementId = 1L;

    @Override
    public Song getById(Long id) {
        return songMap.get(id);
    }

    @Override
    public Long create(String songName, String artistName, String album, String genre) {
        Song song = new Song(autoIncrementId, album, songName, artistName, genre);
        autoIncrementId += 1;
        songMap.put(song.getId(), song);
        return song.getId();
    }

    @Override
    public ArrayList<Long> getAllSongIds() {
        return new ArrayList<>(this.songMap.keySet());
    }
}
    