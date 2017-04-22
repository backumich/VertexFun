package ua.com.vertex.generics.wildcard;

import ua.com.vertex.util.Apple;
import ua.com.vertex.util.Fruit;
import ua.com.vertex.util.Jonathan;

import java.util.ArrayList;
import java.util.List;


public class SuperTypeWildcard {
    static void writeTo(List<? super Apple> apples) {
        apples.add(new Apple());
        apples.add(new Jonathan());
        // apples.add(new Fruit()); // Error

        Object object = apples.get(0);// !!! Object
    }

    static List<? extends Fruit> asList(Fruit... fruits) {
        List<Fruit> fruitsList = new ArrayList<>();

        for (int i = 0; i < fruits.length; i++) {
            Fruit fruit = fruits[i];
        }

        for (Fruit fruit : fruits) {
            fruitsList.add(fruit);
        }
        return fruitsList;
    }

    public static void main(String[] args) {
        ArrayList<Object> objects = new ArrayList<>();
        objects.add(new Object());
        SuperTypeWildcard.writeTo(objects);

        System.out.println(objects);
    }
}

class GenericWriting {

    static List<Apple> apples = new ArrayList<Apple>();
    static List<Fruit> fruit = new ArrayList<Fruit>();

    static <T> void writeExact(List<T> list, T item) {
        list.add(item);
    }

    static void f1() {
        writeExact(apples, new Apple());
        writeExact(fruit, new Jonathan()); // Error:
        // Incompatible types: found Fruit, required Apple
    }

    static <T> void
    writeWithWildcard(List<? super T> list, T item) {
        list.add(item);
    }

    static void f2() {
        writeWithWildcard(apples, new Apple());
        writeWithWildcard(fruit, new Apple());
    }

    public static void main(String[] args) {
        f1();
        f2();
    }
}
