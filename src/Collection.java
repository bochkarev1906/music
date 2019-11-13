import java.util.ArrayList;
import java.util.List;

class Collection {
    private final List<Song> list_song = new ArrayList<>();

    void add_song(Song song){
        this.list_song.add(song);
    }

    String get_collection(){
        String s = "";
        for(int i = 0; i < this.list_song.size(); i++){
            s += "\"" + this.list_song.get(i).getName() + "\"";
            if(i != this.list_song.size() - 1 ){
                s += ", ";
            }
            else{
                s += ".";
            }
        }
        return s;
    }
}
