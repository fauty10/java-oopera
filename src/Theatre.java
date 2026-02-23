import java.util.ArrayList;

public class Theatre {

    public static void main(String[] args) {

        Actor actor1 = new Actor("Иван", "Иванов", Gender.MALE, 180);
        Actor actor2 = new Actor("Петр", "Петров", Gender.MALE, 170);
        Actor actor3 = new Actor("Марфа", "Васильевна", Gender.FEMALE, 160);
        Director director1 = new Director("Василий", "Пупкин", Gender.MALE, 3);
        Director director2 = new Director("Сидор", "Сидоров", Gender.MALE, 2);
        Person musicAuthor = new Person("Андрей", "Петров", Gender.MALE);
        Person choreographer = new Person("Алекс", "Фрай", Gender.MALE);
        Show show = new Show("Гамлет", 2, director1.toString(), new ArrayList<>());
        Opera opera = new Opera("Призрак оперы", 2, director2.toString(), new ArrayList<>(), musicAuthor.toString(), "Начало. \n" +
                "1. Призрак появился\n" +
                "2. Все поют\n" +
                "3. Призрак без маски\n" +
                "4. Все поют\n" +
                "Конец\n", 10);
        Ballet ballet = new Ballet("Наполеон", 2, director2.toString(), new ArrayList<>(), musicAuthor.toString(), "Начало.\n" +
                "1. Наполеон думает\n" +
                "2. Наполеон уехал из Парижа\n" +
                "3. Все танцуют\n" +
                "4. Наполеон вернулся в Париж\n" +
                "Конец\n", choreographer.toString());
        show.printDirector(director1);
        show.addActor(actor1);
        show.addActor(actor2);
        show.addActor(actor3);
        show.printActors();

        opera.printDirector(director2);
        opera.addActor(actor1);
        opera.addActor(actor3);
        opera.printActors();
        opera.printlibretto();

        ballet.printDirector(director2);
        ballet.addActor(actor2);
        ballet.addActor(actor3);
        ballet.printActors();
        ballet.printlibretto();

        ballet.changeActor(actor2, actor1);
        ballet.printActors();

        opera.changeActor(actor2, new Actor("Данила", "Багров", Gender.MALE, 190));
        opera.printActors();

    }
}
