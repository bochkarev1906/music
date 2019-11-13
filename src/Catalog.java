import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Catalog {
    final private List<Artist> list_artist = new ArrayList<>();
    final private List<Collection> list_collection = new ArrayList<>();

    public Catalog() {
    }

    void add_artists(Artist art) {
        this.list_artist.add(art);
    }
    void add_collection(Collection collection) {
        this.list_collection.add(collection);
    }


    String findSongsByGenre(String genre) {
        String s = "";
       for(int i = 0; i < this.list_artist.size(); i++){
            for(int j = 0; j < this.list_artist.get(i).getSizeAlbums(); j++){
                for(int k = 0; k < this.list_artist.get(i).getAlbums(j).getSizeListSong(); k++){
                    if(genre.equals(this.list_artist.get(i).getAlbums(j).getListSong(k).genre)){
                        s += "\"" + this.list_artist.get(i).getAlbums(j).getListSong(k).getName() + "\" ";
                    }
                }
            }
      }
      return s;
    }

    String find_artists_genre(String genre) {
        String s = "";
        for (int i = 0; i < this.list_artist.size(); i++) {
            if (genre.equals(this.list_artist.get(i).getGenre())) {
                s += this.list_artist.get(i).getName() + " ";
            }
        }
        return s;
    }


    String find_albums_more_years(int year) {
        String s = "";
        for (int i = 0; i < this.list_artist.size(); i++) {
            for (int j = 0; j < this.list_artist.get(i).getSizeAlbums(); j++) {
                if (this.list_artist.get(i).getAlbums(j).getYear() > year) {
                    s += "\"" + this.list_artist.get(i).getAlbums(j).getName() + "\" ";
                }
            }
        }
        return s;
    }

     /*void print_catalog(){
        for(int i = 0; i < this.list_artist.size(); i++){
            System.out.println(this.list_artist.get(i).name);
            for(int j = 0; j < this.list_artist.get(i).list_album.size(); j++){
                System.out.println("    " + this.list_artist.get(i).list_album.get(j).name + "(" + this.list_artist.get(i).list_album.get(j).year + ")");
                for(int k = 0; k < this.list_artist.get(i).list_album.get(j).list_song.size(); k++){
                    System.out.println("        " + this.list_artist.get(i).list_album.get(j).list_song.get(k).name);
                }
            }
        }
    }*/
}
