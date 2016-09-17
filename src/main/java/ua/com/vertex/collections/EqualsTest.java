package ua.com.vertex.collections;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by sweet_home on 17.09.16.
 */
public class EqualsTest {

    public static void main(String[] args) throws IllegalAccessException, InstantiationException, ClassNotFoundException {
        List<Integer> list = new ArrayList();

        System.out.println(Integer.MAX_VALUE);

        for (int i = 0; i <= Integer.MAX_VALUE; i++) {
            if (i % 10000 == 0) {
                System.out.println(i);
            }
            list.add(i);
        }

        list.add(new Integer(-1));

    }
}
