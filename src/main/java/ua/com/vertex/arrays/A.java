package ua.com.vertex.arrays;

/**
 * Created by sweet_home on 11.09.16.
 */
public class A {
    private static int COUNT = 0;

    protected int i = COUNT++;

    @Override
    public String toString() {
        return "A " + i;
    }
}
