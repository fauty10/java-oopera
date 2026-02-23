import java.util.ArrayList;

public class Show {

    protected String title;
    protected int duration;
    protected String director;
    protected ArrayList<Actor> listOfActors;

    public Show(String title, int duration, String director, ArrayList<Actor> listOfActors) {
        this.title = title;
        this.duration = duration;
        this.director = director;
        this.listOfActors = listOfActors;
    }

    public void printActors() {
        System.out.println("---------------------------------");
        System.out.println("Актеры постановки " + title + ":");
        for (Actor actor: listOfActors) {

            System.out.println(actor);
        }
    }


    public void addActor(Actor actor) {
        if (listOfActors.contains(actor)) {
            System.out.println("Такой актер уже есть в спектакле!");
        } else {
            listOfActors.add(actor);
        }
    }


    public void printDirector(Director director) {
        System.out.println("---------------------------------");
        System.out.println("Режиссер постановки " + title + ": " + director);
    }


    public void changeActor(Actor oldActor, Actor newActor) {
        if (listOfActors.contains(oldActor)) {
            listOfActors.remove(oldActor);
            System.out.println("---------------------------------");
            System.out.println("Актер " + oldActor + " больше не участвует в постановке");
            listOfActors.add(newActor);
            System.out.println("теперь вместо него: " + newActor);
        } else {
            System.out.println("---------------------------------");
            System.out.println("Актера " + oldActor + " нет в постановке");
        }
    }
}
