package ua.com.vertex.oop;

/**
 * Created by sweet_home on 21.01.17.
 */
public class Person extends A implements PersonInterface {

    private int id;
    private String name;

    private Person() {
    }

    public static void main(String[] args) {
        PersonInterface person = new Person.Builder()
                .setId(3)
//                .setName("testName")
                .getInstance();
    }

    @Override
    public int getId() {
        return id;
    }

    @Override
    public String getName() {
        return name;
    }

    public static class Builder {
        Person instance;

        public Builder() {
            instance = new Person();
        }

        Builder setId(int id) {
            instance.id = id;
            return this;
        }

        Builder setName(String name) {
            instance.name = name;
            return this;
        }

        public Person getInstance() {
            return instance;
        }
    }
}
