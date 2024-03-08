package com.example.demo;

import com.example.demo.commands.*;
import com.example.demo.interfaces.IMusicPlayerDataRepo;
import com.example.demo.interfaces.IPlaylistDataRepo;
import com.example.demo.interfaces.ISongDataRepo;
import com.example.demo.repositories.*;
import com.example.demo.services.*;

public class Configuration {
  // Singleton Pattern
  private static Configuration instance = new Configuration();

  private Configuration(){}

  public static Configuration getInstance(){
    return instance;
  }

  // Initialize repositories
  private final IMusicPlayerDataRepo musicPlayerDataRepo = new MusicPlayerDataRepo();
  private final ISongDataRepo songDataRepo = new SongDataRepo();
  private final IPlaylistDataRepo playlistDataRepo = new PlaylistDataRepo();

  // Initialize services

  private final SongService songService = new SongService(songDataRepo);
  private final PlaylistService playlistService = new PlaylistService(playlistDataRepo);
  private final MusicPlayerService musicPlayerService = new MusicPlayerService(musicPlayerDataRepo, songService, playlistService);

  // Initialize commands
  private final AddSongCommand addSongCommand = new AddSongCommand(songService);
  private final CreatePlaylistCommand createPlaylistCommand = new CreatePlaylistCommand(playlistService);
  private final AddSongToPlaylistCommand addSongToPlaylistCommand = new AddSongToPlaylistCommand(playlistService);
  private final DeleteSongFromPlaylistCommand deleteSongFromPlaylistCommand = new DeleteSongFromPlaylistCommand(playlistService);
  private final DeletePlaylistCommand deletePlaylistCommand = new DeletePlaylistCommand(playlistService);
  private final LoadPlaylistCommand loadPlaylistCommand = new LoadPlaylistCommand(playlistService, musicPlayerService);
  private final PlaySongCommand playSongCommand = new PlaySongCommand(musicPlayerService);
  private final NextSongCommand nextSongCommand = new NextSongCommand(musicPlayerService);
  private final PreviousSongCommand previousSongCommand = new PreviousSongCommand(musicPlayerService);
  private final StopSongCommand stopSongCommand = new StopSongCommand(musicPlayerService);
  private final ListSongsCommand listSongsCommand = new ListSongsCommand(songService);

  // Initialize commandRegistry
  private final CommandRegistry commandRegistry = new CommandRegistry();

  // Register commands
  private void registerCommands(){
    commandRegistry.registerCommand(CommandKeyword.ADD_SONG.getName(), addSongCommand);
    commandRegistry.registerCommand(CommandKeyword.CREATE_PLAYLIST.getName(), createPlaylistCommand);
    commandRegistry.registerCommand(CommandKeyword.ADD_SONG_TO_PLAYLIST.getName(), addSongToPlaylistCommand);
    commandRegistry.registerCommand(CommandKeyword.DELETE_SONG_FROM_PLAYLIST.getName(), deleteSongFromPlaylistCommand);
    commandRegistry.registerCommand(CommandKeyword.DELETE_PLAYLIST.getName(), deletePlaylistCommand);
    commandRegistry.registerCommand(CommandKeyword.LOAD_PLAYLIST.getName(), loadPlaylistCommand);
    commandRegistry.registerCommand(CommandKeyword.PLAY_SONG.getName(), playSongCommand);
    commandRegistry.registerCommand(CommandKeyword.NEXT_SONG.getName(), nextSongCommand);
    commandRegistry.registerCommand(CommandKeyword.PREVIOUS_SONG.getName(), previousSongCommand);
    commandRegistry.registerCommand(CommandKeyword.STOP_SONG.getName(), stopSongCommand);
    commandRegistry.registerCommand(CommandKeyword.LIST_SONGS.getName(), listSongsCommand);
  }

  public CommandRegistry getCommandRegistry(){
    registerCommands();
    return commandRegistry;
  }
}
