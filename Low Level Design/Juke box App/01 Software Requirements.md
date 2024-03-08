# Design a Music Player

Everyone listens to songs on their favourite app ( Savvn, Wynk ) but have you ever thought How you will make your own music player? Now you have to design a music player with the given below features.

## Assumptions

1. On choosing a playlist, the first song in the playlist will start playing.
2. On reaching the end, Next command will switch to the first song in the current playlist.
3. On reaching the start, Back command will switch to the last song in the current playlist.
4. You can assume that songId and playlistId are always valid.
5. Song will contain the artist, album and genre.
6. In the Add_Song and Create_playlist command, You have to create an ID by yourself.

## Features

1. A user can create a playlist from an available pool of songs.
2. A user can add songs to the playlist.
3. User can play the playlist and be able to switch songs (forward or backward)
4. List all the songs in the pool.

## Bonus Features

1. Users can search songs by name (Only prefix name matches should return).
2. Get the list of top 10 most played songs in a non-increasing order.

## Commands

1. ADD_SONG <song-name>,<artist/band-name>,<album-name>,<genre>

                        Eg : ADD_SONG Something In the Way, Nirvana, NeverMind, Rock

                     Output: Song [id=1]

2. CREATE_PLAYLIST <playlist-name> <song-ids>

Eg : CREATE_PLAYLIST  PLAYLIST_2  1 2 3

Output : Playlist [id=1]

3. ADD_SONG_TO_PLAYLIST <playlist-name> <song-id>

                         Eg : ADD_SONG_TO_PLAYLIST  PLAYLIST_2  8

                Output : Playlist PLAYLIST_2 is revised with [Song [id=1], Song [id=3], Song [id=5], Song [id=7], Song [id=9], Song [id=8]]

4. DELETE_SONG_FROM_PLAYLIST <playlist-name> <song-id>

                         Eg : DELETE_SONG_FROM_PLAYLIST PLAYLIST_2 9

                Output : Playlist PLAYLIST_2 is revised with [Song [id=1], Song [id=3], Song [id=5], Song [id=7], Song [id=8]]

5. DELETE_PLAYLIST <playlist-name>

                         Eg : DELETE_PLAYLIST PLAYLIST_1

                Output : Playlist PLAYLIST_1 is deleted!

6. LOAD_PLAYLIST <playlist-name>

                Eg: LOAD_PLAYLIST PLAYLIST_2

Output : Playlist PLAYLIST_2 is loaded!

7. PLAY_SONG 

                Eg: PLAY_SONG

Output :Song [id=2] is playing!

8. NEXT_SONG

Eg: NEXT_SONG

Output : Song [id=4] is playing!

9. PREVIOUS_SONG

                          Eg: PREVIOUS_SONG

                Output : Song [id=2] is playing!

10. STOP_SONG

                          Eg: STOP_SONG

                Output : Song [id=2] is stopped!

11. LIST_SONGS

                 Output : List of all songs with name

                [Song [id=1], Song [id=2], Song [id=3], Song [id=4], Song [id=5], Song [id=6], Song [id=7], Song [id=8], Song [id=9], Song [id=10]]