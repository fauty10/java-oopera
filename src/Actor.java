import java.util.Objects;

public class Actor extends Person {

    private int height;

    public Actor(String name, String surname, Gender gender, int height) {
        super(name, surname, gender);
        this.height = height;
    }

    @Override
    public String toString() {
        return "{" +
                "Имя='" + name + '\'' +
                ", Фамилия='" + surname + '\'' +
                ", Рост=" + "(" + height + ")" +
                '}';
    }

}
