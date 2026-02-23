import java.util.ArrayList;
import java.util.Arrays;

public class MusicalShow extends Show {

    private Person musicAuthor;
    private String librettoText;

    public MusicalShow(String title, int duration, String director, ArrayList<Actor> listOfActors, String musicAuthor, String librettoText) {
        super(title, duration, director, listOfActors);
        this.librettoText = librettoText;
    }


    public void printlibretto() {
        System.out.println("---------------------------------");
        System.out.println("Либретто " + title + ":");
        System.out.println(librettoText);
    }


}
