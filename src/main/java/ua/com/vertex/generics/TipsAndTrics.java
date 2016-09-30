package ua.com.vertex.generics;

import java.lang.reflect.Array;
import java.util.*;

public class TipsAndTrics {

    private static final int SIZE = 100;

    public static void main(String[] args) {

//        equalsClasses();
//        lostInfo();

//        System.out.println("New string is: " + new String());
//        List[] strings = sillyThings(List.class);

//        System.out.println(strings instanceof Object[]);
//        System.out.println(strings instanceof String[]);
//        System.out.println(strings[0] instanceof TreeMap);
//        System.out.println(strings);

        cast();
    }

    private static void cast() {
        Integer[] ints = new Integer[]{
                0, 1, 2
        };

//        ArrayList<Integer>[] integers = Arrays.fill();

        Car<Integer>[] gia = (Car<Integer>[]) new Car[100];
//         Compiles; produces ClassCastException:
//        gia = (Car<Integer>[])new Object[SIZE];
//         Runtime type is the raw (erased) type:
        gia[0] = new Car();
        System.out.println(gia.getClass().getSimpleName());
        //! gia[1] = new Object(); // Compile-time error
        // Discovers type mismatch at compile time:
        Car<Double> doubleCar = new Car<>();
        doubleCar.setT(3.14);
//        gia[2] = doubleCar;

//        Double t = (Double) gia[2].getT();

//        System.out.println(t);

    }

    public static <T> T[] sillyThings(Class<T> kind) {
        return (T[]) Array.newInstance(kind, 10);
    }

    private static void equalsClasses() {
        ArrayList<String> stringArrayList = new ArrayList<>();
        ArrayList<Integer> integerArrayList = new ArrayList<>();

        Class strClass = stringArrayList.getClass();
        Class intClass = integerArrayList.getClass();
        // !!!!! Classes are generics too, but they are "downcasted" because of migration (erasure).
        // The cost of this ability is - casts, instanceof, new on generics are forbidden

        System.out.println(strClass == intClass);
        System.out.println(strClass.isInstance(integerArrayList));


    }

    public static void lostInfo() {
        List<Frob> list = new ArrayList<Frob>();
        Map<Frob, Fnorkle> map = new HashMap<Frob, Fnorkle>();
        Quark<Fnorkle> quark = new Quark<Fnorkle>();
        Particle<Long, Double> p = new Particle<Long, Double>();
        System.out.println(Arrays.toString(list.getClass().getTypeParameters()));
        System.out.println(Arrays.toString(map.getClass().getTypeParameters()));
        System.out.println(Arrays.toString(quark.getClass().getTypeParameters()));
        System.out.println(Arrays.toString(p.getClass().getTypeParameters()));
    }

    static class Car<T> {
        T t;

        public T getT() {
            return t;
        }

        public void setT(T t) {
            this.t = t;
        }
    }

    static class Quark<Q> {
    }

    static class Particle<POSITION, MOMENTUM> {
    }

    class Frob {
    }

    class Fnorkle {
    }
}
