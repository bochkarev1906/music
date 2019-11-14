import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Genre {
    private enum GenreEnum {
        Поп(1), Рэп(2), Рок(3), Классика(4), Джаз(5), Шансон(6), Электронная(7);
        public final int value;

        GenreEnum(final int value) {
            this.value = value;
        }
        }

    String getGenreEnum(){
        return Arrays.toString(GenreEnum.values());
    }

    public static String getNameByCode(int code){
        for(GenreEnum e : GenreEnum.values()){
            if(code == e.value) return e.name();
        }
        return null;
    }

    //add exceptions and other useful functions for your best workflow
}
