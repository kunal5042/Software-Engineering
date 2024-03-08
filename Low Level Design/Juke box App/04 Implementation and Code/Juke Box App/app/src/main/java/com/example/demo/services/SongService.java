package com.example.demo.services;

import com.example.demo.entities.Song;
import com.example.demo.interfaces.ISongDataRepo;
import com.example.demo.interfaces.ISongService;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class SongService implements ISongService {
	private Map<Long, Song> songMap = new HashMap<>();
	private ISongDataRepo songDataRepo;

	public SongService(ISongDataRepo songDataRepo) {
		this.songDataRepo = songDataRepo;
	}

	public Long create(String songName, String artistName, String album, String genre) {
		Long songId = songDataRepo.create(songName, artistName, album, genre);
		return songId;
	}

	public Song getById(Long id) {
		return songDataRepo.getById(id);
	}

	public ArrayList<Long> getAllSongs(){
		return songDataRepo.getAllSongIds();
	}

}
