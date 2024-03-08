package com.example.demo.interfaces;
import com.example.demo.entities.Song;

import java.util.ArrayList;

public interface ISongDataRepo {
	Song getById(Long id);
	Long create(String songName, String artistName, String album, String genre);
	ArrayList<Long> getAllSongIds();
}
