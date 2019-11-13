import java.lang.reflect.Array;
import java.util.Arrays;


public class Main {
    public static void main(String[] args){
        Catalog catalog1 = new Catalog();
        Collection collectiona1 = new Collection();
        Genre genre = new Genre();
        System.out.println(genre.getGenreEnum());
        Artist artist1 = new Artist("Егор Крид",  genre.getNameByCode(2));
        Artist artist2 = new Artist("Сергей Лазарев", genre.getNameByCode(1));

        Album album1 = new Album("Холостяк", 2015);
        Album album2 = new Album("Что они знают?", 2017);
        Album album3 = new Album("Don't Be Fake", 2005);
        Album album4 = new Album("TV Show", 2007);
        Album album5 = new Album("Electric Touch", 2008);
        Album album6 = new Album("Лазарев",2012);
        Album album7 = new Album("The one", 2016);
        Album album8 = new Album("В эпицентре", 2016);

        Song song1 = new Song("Самая Самая");
        Song song2 = new Song("Мало так мало");
        Song song3 = new Song("Берегу");
        Song song4 = new Song("Миллион алых роз");
        Song song5 = new Song("Гучи");
        Song song6 = new Song("Eye Of The Storm");
        Song song7 = new Song("Lost Without Your Love");
        Song song8 = new Song("TV Or Radio");
        Song song9 = new Song("Girlfriend");
        Song song10 = new Song("Найди меня");
        Song song11 = new Song("Alarm");
        Song song12 = new Song("Нереальная любовь");
        Song song13 = new Song("Слёзы в моём сердце");
        Song song14 = new Song("7 Wonders");
        Song song15 = new Song("You Are the Only One");
        Song song16 = new Song("Идеальный мир");
        Song song17 = new Song("Сдавайся");
        Song song18 = new Song("Шёпотом");

        album1.add_song(song1);
        album1.add_song(song2);
        album2.add_song(song3);
        album2.add_song(song4);
        album2.add_song(song5);
        album3.add_song(song6);
        album3.add_song(song7);
        album4.add_song(song8);
        album4.add_song(song9);

        album5.add_song(song10);
        album5.add_song(song11);
        album5.add_song(song12);
        album6.add_song(song13);
        album6.add_song(song14);
        album6.add_song(song15);
        album7.add_song(song16);
        album8.add_song(song17);
        album8.add_song(song18);

        artist1.add_album(album1);
        artist1.add_album(album2);
        artist2.add_album(album3);
        artist2.add_album(album4);
        artist2.add_album(album5);
        artist2.add_album(album6);
        artist2.add_album(album7);
        artist2.add_album(album8);

        catalog1.add_artists(artist1);
        catalog1.add_artists(artist2);

        collectiona1.add_song(song1);
        collectiona1.add_song(song5);
        collectiona1.add_song(song9);
        collectiona1.add_song(song2);
        collectiona1.add_song(song10);
        catalog1.add_collection(collectiona1);
        //System.out.print(collectiona1.get_collection());

        // print query
        // e.g., All rap songs: [..., ..., ...]
        System.out.println("all rap songs:" + catalog1.findSongsByGenre("Рэп"));
        //System.out.println(catalog1.find_artists_genre("Поп"));
        System.out.println(catalog1.find_albums_more_years(2012));

        System.out.println(collectiona1.get_collection());


        /*for(int i = 0; i < 3; i++){
            Artist art = new Artist(Integer.toString(i), "Поп");
            for(int j = 0; j < 3; j++) {
                Album alb = new Album(Integer.toString(i % 2 + j), i + 1990);
                for(int k = 0; k < 3; k++){
                     Song song = new Song(Integer.toString(j % 2 + k));
                     alb.add_song(song);
                }
                art.add_album(alb);
            }
            catalog1.add_artists(art);
        }*/


        //catalog1.print_catalog();
    }


}
