package com.example.demo.services;

import com.example.demo.entities.Playlist;
import com.example.demo.interfaces.IPlaylistDataRepo;
import com.example.demo.interfaces.IPlaylistService;

import java.util.HashMap;
import java.util.Map;

public class PlaylistService implements IPlaylistService {
	private final IPlaylistDataRepo playlistDataRepo;

	public PlaylistService(IPlaylistDataRepo playlistDataRepo) {
		this.playlistDataRepo = playlistDataRepo;
	}

	public Long create() {
		return playlistDataRepo.create();
	}

	public Playlist getById(Long id) {
		return playlistDataRepo.getById(id);
	}

	public void addSong(Long playlistId, Long songId) {
		playlistDataRepo.addSong(playlistId, songId);
	}

	public void removeSong(Long playlistId, Long songId) {
		playlistDataRepo.removeSong(playlistId, songId);
	}

}
