package ua.com.vertex.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * Created by sweet_home on 11.09.16.
 */

public class MainClass {

    public static void main(String[] args) {
//
//        A[] a = new B[3];
//
//        ArrayList<A> list = new ArrayList<>();
//        list.add(new B());

        B b1 = new B(), b2 = new B();

        B[] arrayOfA = {new B(), new B(), new B(), b1, b2};
        System.out.println(arrayOfA);

        Arrays.sort(arrayOfA);

        System.out.println(Arrays.toString(arrayOfA));

    }
}
