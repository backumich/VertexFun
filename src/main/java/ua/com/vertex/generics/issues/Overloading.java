package ua.com.vertex.generics.issues;

/**
 * Created by sweet_home on 04.03.17.
 */
public class Overloading<T extends String, U extends Byte> {

    public void myMethod(T t) {
        System.out.println(t);
    }

    public void myMethod(U u) {
        System.out.println(u);
    }
}
