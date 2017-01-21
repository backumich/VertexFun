package ua.com.vertex.oop;

import java.util.Random;

/**
 * Created by sweet_home on 21.01.17.
 */
public class PersonProxy implements PersonInterface {

    Person instance;

    @Override
    public int getId() {
        if (instance == null) {
            instance = getPerson();
        }
        return instance.getId();
    }

    @Override
    public String getName() {
        System.out.println("inside getName()");

        if (instance == null) {
            instance = getPerson();
        }

        return instance.getName();
    }

    private Person getPerson() {
        Random random = new Random();
        return new Person.Builder()
                .setId(random.nextInt())
                .setName(Integer.toString(random.hashCode()))
                .getInstance();
    }


}
