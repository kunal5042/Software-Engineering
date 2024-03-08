package com.example.demo.interfaces;

import com.example.demo.entities.Playlist;

public interface IPlaylistService {
	Long create();
	Playlist getById(Long id);
	void addSong(Long playlistId, Long songId);
	void removeSong(Long playlistId, Long songId);
}
