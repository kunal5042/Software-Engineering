package com.example.demo.entities;

import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;

@Getter
@Setter
public class MusicPlayer {
  private Long id;
  private Playlist playlist;
  private int currentlyPlayingSongIdx;
  private boolean isPlayingSong;
  private ArrayList<Long> songIds;
  public MusicPlayer(Long id, Playlist playlist){
    this.id = id;
    this.playlist = playlist;
  }
}
