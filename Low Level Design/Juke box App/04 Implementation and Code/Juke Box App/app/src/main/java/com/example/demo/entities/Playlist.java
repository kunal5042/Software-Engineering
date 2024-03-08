package com.example.demo.entities;

import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.HashSet;

@Getter
@Setter
public class Playlist {
  private Long id;
  private ArrayList<Long> songs;
  public Playlist(Long id){
    this.id = id;
    this.songs = new ArrayList<>();
  }
}