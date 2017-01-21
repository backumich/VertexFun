package ua.com.vertex.oop;

/**
 * Created by sweet_home on 21.01.17.
 */
public class OopFactory {

    OopInterface oopInterface = new A();


    public static Object getOopClass(String name) {
        if ("Person".equalsIgnoreCase(name)) {
            return new Person.Builder().getInstance();
        } else {
            if ("A".equalsIgnoreCase(name)) {
                return new A();
            } else {
                throw new IllegalArgumentException("Wrong class name " + name);
            }
        }
    }

}
