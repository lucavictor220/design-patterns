package composite;

/**
 * Created by vitiok on 12/12/17.
 */
public class RetroDisk {
    private SongComponent songList;

    public RetroDisk(SongComponent newSongList){
        songList = newSongList;
    }

    public void getSongList(){
        songList.displaySongInfo();
    }
}
