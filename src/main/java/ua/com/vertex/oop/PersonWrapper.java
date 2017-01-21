package ua.com.vertex.oop;

/**
 * Created by sweet_home on 21.01.17.
 */
public class PersonWrapper {
    private PersonInterface person;

    public PersonWrapper(PersonInterface person) {
        this.person = person;
    }

    public PersonWrapper(int id, String name) {
        person = new Person.Builder()
                .setId(id)
                .setName(name)
                .getInstance();
    }

    public String getStringId() {
        return Integer.toString(person.getId());
    }

    public String getNameInUpperCase() {
        return person.getName().toUpperCase();
    }

    public int idValue() {
        return person.getId();
    }

    public String nameValue() {
        return person.getName();
    }

}
