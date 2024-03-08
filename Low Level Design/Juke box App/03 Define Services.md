1. interface IMusicPlayerService
	- Methods
		- create()
		- getById()
		- play()
		- pause()
		- getNowPlaying()
		- forward()
		- backward()
		- shuffle()
		- shuffle()
		- updatePlayList(Long playListId)

2. interface IMusicPlayerDataRepo
	- Methods
		- create()
		- getById()

3. interface ISongService
	- Methods
		- create()
		- getById()
		
4. interface ISongDataRepo
	- Methods
		- create()
		- getById()

5. interface IPlayListService
	- Methods
		- create()
		- getById()
		- addSong(Long songId)
		- removeSong(Long songId)

6. interface IPlayListDataRepo
	- Methods
		- create()
		- getById()