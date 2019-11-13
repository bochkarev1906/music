import java.lang.instrument.UnmodifiableModuleException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Stream;

public class Album{
    final private String name;
    final private int year;
    public String genre;
    final private List<Song> list_song = new ArrayList<>();

    Album(String name, int year){
        this.name = name;
        this.year = year;
    }

    void add_song(Song art){
        this.list_song.add(art);
    }

    String getName(){
        return this.name;
    }

    Integer getYear(){
        return this.year;
    }

    Integer getSizeListSong(){
        return list_song.size();
    }

    Song getListSong(int i){
        return list_song.get(i);
    }

}
