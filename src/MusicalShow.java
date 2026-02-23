import java.util.ArrayList;
import java.util.Arrays;

public class MusicalShow extends Show {

    String musicAuthor;
    String librettoText;

    public MusicalShow(String title, int duration, String director, ArrayList<Actor> listOfActors, String musicAuthor, String librettoText) {
        super(title, duration, director, listOfActors);
        this.musicAuthor = musicAuthor;
        this.librettoText = librettoText;
    }


    public void printlibretto(String libretto) {
        System.out.println("---------------------------------");
        librettoText = libretto;
        System.out.println("Либретто " + title + ":");
        System.out.println(librettoText);
    }


}
