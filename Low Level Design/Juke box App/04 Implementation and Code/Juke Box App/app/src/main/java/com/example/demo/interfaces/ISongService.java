package com.example.demo.interfaces;
import com.example.demo.entities.Song;

public interface ISongService {
	Long create(String songName, String artistName, String album, String genre);
	Song getById(Long id);
}
