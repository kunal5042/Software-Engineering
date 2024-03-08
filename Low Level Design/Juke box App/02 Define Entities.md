1. MusicPlayer
2. Song
3. PlayList


## Attributes and Methods
1. MusicPlayer
	- Attributes
		- PlayList playlistId
		- int currentlyPlayingSongIdx
		- bool isPlayingSong
		- ArrayList\<Long\> songIds
	- Methods
		- getters
		- setters

2. Song
	- Attributes
		- Long songId
		- String artistName
		- String album
		- Enum genre
	- Methods
		- getters

3. PlayList
	- Attributes
		- Long playListId
		- HashSet\<Long\> songs
	- Methods
		- getters
		- setters

## Relationships and Cardinality

1. **MusicPlayer**

    - **Relationships**:
        - Aggregation relationship with Playlist: MusicPlayer contains a Playlist.
        - Association relationship with Song: MusicPlayer interacts with Song objects.
    - **Cardinality**:
        - One MusicPlayer can have one Playlist.
        - One MusicPlayer can interact with multiple Song objects.
2. **Song**:
    
    - **Relationships**:
        - None explicitly defined in the provided class.
    - **Cardinality**:
        - One Song can belong to multiple Playlists.
        - One Song can be associated with only one Artist.
3. **Playlist**:
    
    - **Relationships**:
        - Association relationship with Song: Playlist contains Songs.
    - **Cardinality**:
        - One Playlist can contain multiple Songs.
        - One Song can belong to multiple Playlists.