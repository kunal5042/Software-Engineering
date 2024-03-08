package com.example.demo.entities;

import com.example.demo.enums.Genre;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Song {
  private Long id;
  private String artistName;
  private String album;
  private String genre;
  private String songName;

  public Song(Long id, String songName, String artistName, String album, String genre){
    this.id = id;
    this.songName = songName;
    this.genre = genre;
    this.artistName = artistName;
    this.album = album;
  }
}