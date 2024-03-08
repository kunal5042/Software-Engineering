package com.example.demo.services;

import com.example.demo.entities.MusicPlayer;
import com.example.demo.entities.Playlist;
import com.example.demo.entities.Song;
import com.example.demo.interfaces.IMusicPlayerDataRepo;
import com.example.demo.interfaces.IMusicPlayerService;
import com.example.demo.interfaces.IPlaylistDataRepo;
import com.example.demo.interfaces.IPlaylistService;
import com.example.demo.interfaces.ISongService;

import java.util.ArrayList;

public class MusicPlayerService implements IMusicPlayerService {
	private IMusicPlayerDataRepo musicPlayerDataRepo;
	private ISongService songService;
	private IPlaylistService playlistService;

	public MusicPlayerService(IMusicPlayerDataRepo musicPlayerDataRepo, ISongService songService, IPlaylistService playlistService) {
		this.musicPlayerDataRepo = musicPlayerDataRepo;
		this.songService = songService;
		this.playlistService = playlistService;
	}

	public Long create(Playlist playlist) {
		Long musicPlayerId = musicPlayerDataRepo.create(playlist);
		return musicPlayerId;
	}

	public MusicPlayer getById(Long id) {
		return musicPlayerDataRepo.getById(id);
	}

	public void play(Long id) {
		MusicPlayer musicPlayer = musicPlayerDataRepo.getById(id);
		ArrayList<Long> songIds = musicPlayer.getSongIds();
		if(musicPlayer.isPlayingSong()){
			musicPlayer.setPlayingSong(false);
			Long songId = musicPlayer.getSongIds().get(musicPlayer.getCurrentlyPlayingSongIdx());
			System.out.printf("Song [id=%d] is paused!\n", songId.intValue());
		} else if(songIds.isEmpty()){
			throw new IllegalArgumentException("No songs in the playlist!\n");
		}
		else{
			musicPlayer.setPlayingSong(true);
			musicPlayer.setCurrentlyPlayingSongIdx(0);
			Long songId = musicPlayer.getSongIds().get(musicPlayer.getCurrentlyPlayingSongIdx());
			System.out.printf("Song [id=%d] is playing!\n", songId.intValue());
		}
	}

	public Song stop(Long id) {
		MusicPlayer musicPlayer = musicPlayerDataRepo.getById(id);
		musicPlayer.setPlayingSong(false);
		int idx = musicPlayer.getCurrentlyPlayingSongIdx();
		Long songIdPaused = musicPlayer.getSongIds().get(idx);
		return songService.getById(songIdPaused);
	}

	public Song getNowPlaying(Long id) {
		MusicPlayer musicPlayer = musicPlayerDataRepo.getById(id);
		if(!musicPlayer.isPlayingSong()){
			throw new IllegalStateException("Not playing any songs currently!");
		}
		ArrayList<Long> songIds = musicPlayer.getSongIds();
		Long playingSongId = songIds.get(musicPlayer.getCurrentlyPlayingSongIdx());
		return songService.getById(playingSongId);
	}

	@Override
	public Song forward(Long id) {
		MusicPlayer musicPlayer = musicPlayerDataRepo.getById(id);
		if (!musicPlayer.isPlayingSong()) {
			throw new IllegalStateException("Not playing any songs currently!");
		}
		ArrayList<Long> songIds = musicPlayer.getSongIds();
		int currentIndex = musicPlayer.getCurrentlyPlayingSongIdx();
		int nextIndex = (currentIndex + 1) % songIds.size();
		musicPlayer.setCurrentlyPlayingSongIdx(nextIndex);
		Long nextSongId = songIds.get(nextIndex);
		return songService.getById(nextSongId);
	}

	@Override
	public Song backward(Long id) {
		MusicPlayer musicPlayer = musicPlayerDataRepo.getById(id);
		if (!musicPlayer.isPlayingSong()) {
			throw new IllegalStateException("Not playing any songs currently!");
		}
		ArrayList<Long> songIds = musicPlayer.getSongIds();
		int currentIndex = musicPlayer.getCurrentlyPlayingSongIdx();
		int previousIndex = (currentIndex - 1 + songIds.size()) % songIds.size();
		musicPlayer.setCurrentlyPlayingSongIdx(previousIndex);
		Long previousSongId = songIds.get(previousIndex);
		return songService.getById(previousSongId);
	}

	public void shuffle(Long id) {
	}

	public void updatePlaylist(Long id, Long playlistId) {
		MusicPlayer musicPlayer = musicPlayerDataRepo.getById(id);
		Playlist newPlaylist = playlistService.getById(playlistId);
		musicPlayer.setPlaylist(newPlaylist);
		musicPlayer.setCurrentlyPlayingSongIdx(0);
		musicPlayer.setPlayingSong(true);
	}
}