import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Artist {
    final private String name;
    final private String genre;
    final private List<Album> albums = new ArrayList<>();

    Artist(String name, String genre){
        this.name = name;
        this.genre = genre;
    }

    void add_album(Album al){
        this.albums.add(al);
        al.genre = this.genre;
        for(int i = 0; i < al.getSizeListSong(); i++){
            al.getListSong(i).genre = this.genre;
        }
    }

    String getName(){
        return this.name;
    }

    String getGenre(){
        return this.genre;
    }

    Integer getSizeAlbums(){
        return albums.size();
    }

    Album getAlbums(int i){
        return albums.get(i);
    }


}
