package ua.com.vertex.collections;

/**
 * Created by sweet_home on 17.09.16.
 */
public class CollectionsShowcase {

    private static int field = 0;

    private CollectionsShowcase() {
        System.out.println("default constructor");
    }

    private CollectionsShowcase(int i) {
        System.out.println(i);
    }
    public static void main(String[] args) {


        Tester tester = () -> {
            int i = 1;
            return i;
        };

        System.out.println(tester);
        System.out.println(tester.getClass().getSimpleName());
        System.out.println(tester instanceof Tester);

//        Tester tester = new Tester() {
//            @Override
//            public int test1() {
//                return 1;
//            }
//        } ;

        System.out.println(tester.test1());
        System.out.println(tester.test2());

//        tester::test1() = () -> 1;

    }

    public interface Tester {

        int test1();

        default int test2() {
            return 2;
        }
    }

}
