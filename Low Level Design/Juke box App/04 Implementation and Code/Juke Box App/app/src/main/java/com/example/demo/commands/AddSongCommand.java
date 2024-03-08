package com.example.demo.commands;

import com.example.demo.services.PlaylistService;
import com.example.demo.services.SongService;
import java.util.List;

public class AddSongCommand implements ICommand {
    private final SongService songService;

    public AddSongCommand(SongService songService) {
        this.songService = songService;
    }

    @Override
    public void invoke(List<String> tokens) {
        // Implementation to handle ADD_SONG command using songService
        String songName = tokens.get(1);
        String artist = tokens.get(1);
        String album = tokens.get(1);
        String genre = tokens.get(1);
        Long songId = songService.create(songName, artist, album, genre);
        System.out.println(String.format("Song [id=%d]", songId.intValue()));
    }
}
