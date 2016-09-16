package ua.com.vertex.immutable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Created by sweet_home on 10.09.16.
 */
public final class Human {

    private String name;
    private int age;
    private List<Human> friends;

    private Human() {
    }

    public Human(String name, int age, List<Human> friends) {
        this.name = name;
        this.age = age;
        this.friends = friends;
    }

//    public void addFriend(Human friend){
//        friends.add(friend);
//    }

    public static void main(String[] args) {
        Human friend = new Human("Petia", 19, new ArrayList<Human>());

        Human test = new Human.Builder().setName(getVasiaName()).
                setAge(19).addFriend(friend).getInstance();
    }

    private static String getVasiaName() {
        return "Vasia";
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public List<Human> getFriends() {
        return Collections.unmodifiableList(friends);
    }

    public static class Builder {
        final private Human instance;

        public Builder() {
            instance = new Human();
            instance.friends = new ArrayList<Human>();
        }

        public Builder setName(String name) {
            instance.name = name;
            return this;
        }

        public Builder setAge(int age) {
            instance.age = age;
            return this;
        }

        public Builder addFriend(Human friend) {
            instance.friends.add(friend);

            return this;
        }

        public Builder addFriends(List<Human> friends) {
            instance.friends.addAll(friends);
            return this;
        }

        public Human getInstance() {
            return instance;
        }
    }
}
