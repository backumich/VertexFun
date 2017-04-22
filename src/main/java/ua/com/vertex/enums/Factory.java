package ua.com.vertex.enums;

import ua.com.vertex.util.Apple;
import ua.com.vertex.util.Fruit;
import ua.com.vertex.util.Orange;

import java.util.Arrays;

public enum Factory {

    FRUIT {
        int count = 0;

        @Override
        public Fruit getInstance() {
            count++;
            return new Fruit();
        }
    }, APPLE {
        @Override
        public Fruit getInstance() {
            return new Apple();
        }
    }, ORANGE {
        @Override
        public Fruit getInstance() {
            return new Orange();
        }

        @Override
        public String toString() {
            return "It's orange, baby!";
        }
    };

    public static void main(String[] args) {
        System.out.println(Factory.valueOf("Apple".toUpperCase()).
                getInstance().getClass().getSimpleName());

        Arrays.stream(Factory.values()).forEach(System.out::println);
    }

    public static Fruit getInstance(String className) {
        Factory factory = Factory.valueOf(className.toUpperCase());
        return factory == null ? null : factory.getInstance();
    }

    abstract public Fruit getInstance();

    @Override
    public String toString() {
        return name() + " with changed toString";
    }
}
