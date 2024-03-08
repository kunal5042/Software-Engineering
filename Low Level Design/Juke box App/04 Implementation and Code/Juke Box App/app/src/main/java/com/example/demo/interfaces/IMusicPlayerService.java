package com.example.demo.interfaces;
import com.example.demo.entities.MusicPlayer;
import com.example.demo.entities.Playlist;
import com.example.demo.entities.Song;

public interface IMusicPlayerService {
	Long create(Playlist playlist);
	MusicPlayer getById(Long id);
	void play(Long id);
	Song stop(Long id);
	Song getNowPlaying(Long id);
	Song forward(Long id);
	Song backward(Long id);
	void shuffle(Long id);
	void updatePlaylist(Long id, Long playlistId);
}
