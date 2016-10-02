package ua.com.vertex.collections;

/**
 * Created by sweet_home on 18.09.16.
 */
public class MethodsShowcase {

    private int privateField = 0;

    public static void main(String[] args) {
        IntWrapper count = new IntWrapper();
        count.i = 0;

        primitiveChange(count);

        System.out.println(count.i);
    }

    private static void primitiveChange(IntWrapper count) {
        count.i = count.i + 1;
        System.out.println(count.i);
    }

    @Override
    public String toString() {
        return super.toString();
    }

    private static class IntWrapper {
        public int i;

        @Override
        public String toString() {
            return super.toString();
        }
    }

    private static class Wrapper {
        public int i;

        @Override
        public String toString() {
            return super.toString();
        }
    }
}
