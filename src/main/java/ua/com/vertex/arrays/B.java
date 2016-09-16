package ua.com.vertex.arrays;

/**
 * Created by sweet_home on 11.09.16.
 */
public class B extends A implements Comparable {

    @Override
    public String toString() {
        return "B " + i;
    }

    public int compareTo(Object toCompare) {
        B that = (B) toCompare;
        return this.i < that.i ? -1 : this.i == that.i ? 0 : 1;
    }
}
