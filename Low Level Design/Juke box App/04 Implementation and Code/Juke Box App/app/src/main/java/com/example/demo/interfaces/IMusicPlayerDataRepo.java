package com.example.demo.interfaces;
import com.example.demo.entities.MusicPlayer;
import com.example.demo.entities.Playlist;

public interface IMusicPlayerDataRepo {
	Long create(Playlist playlist);
	MusicPlayer getById(Long id);
}
