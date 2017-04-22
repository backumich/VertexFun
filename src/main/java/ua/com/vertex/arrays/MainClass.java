package ua.com.vertex.arrays;

import java.util.Arrays;
import java.util.stream.IntStream;

/**
 * Created by sweet_home on 11.09.16.
 */

public class MainClass {

    public static void main(String[] args) {
//
//        A[] a = new Person[3];
//
//        ArrayList<A> list = new ArrayList<>();
//        list.add(new Person());

//        Person b1 = new Person(), b2 = new Person();
//
//        Person[] arrayOfA = {new Person(), new Person(), new Person(), b1, b2};
//        Stream<A> stream = Arrays.stream(arrayOfA);
//
//        arrayOfA[0] = null;
//
//        stream.forEach(System.out::println);


//        Collection<A> arrayList = Arrays.asList(arrayOfA);
//        stream = arrayList.stream();
//        stream.limit(3).map(instanceOfA -> {
//            A toReturn = instanceOfA;
////            change(toReturn);
//            return toReturn.hashCode();
//        }).forEach(System.out::print);


        int[] ints = new int[]{1, 2, 3, 4, 5};

        IntStream stream1 = Arrays.stream(ints);

        IntStream intStream = stream1.map(i -> ++i);
        intStream.forEach(System.out::println);

        stream1.forEach(System.out::println);

        System.out.println(Arrays.toString(ints));


    }
}
