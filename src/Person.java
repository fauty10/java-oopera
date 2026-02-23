import java.util.Objects;

public class Person {

    protected String name;
    protected String surname;
    protected Gender gender;

    public Person(String name, String surname, Gender gender) {
        this.name = name;
        this.surname = surname;
        this.gender = gender;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Actor actor = (Actor) o;
        return Objects.equals(name, actor.name) && Objects.equals(surname, actor.surname);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(name, surname);
        result = 31 * result;
        return result;
    }

}
