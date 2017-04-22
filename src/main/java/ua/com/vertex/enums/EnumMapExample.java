package ua.com.vertex.enums;

import java.util.EnumMap;
import java.util.Map;
import java.util.function.Supplier;

import static ua.com.vertex.enums.Signal.*;

/**
 * Created by sweet_home on 08.10.16.
 */
public class EnumMapExample {

    private static EnumMap<Signal, Supplier<Boolean>> actions = new EnumMap<Signal, Supplier<Boolean>>(Signal.class);

    public static Boolean stop() {
        System.out.println("You should stay where you are!");
        return false;
    }

    public static Boolean ready() {
        System.out.println("You can get ready, but stay where you are, please.");
        return false;
    }

    public static Boolean go() {
        System.out.println("You can go");
        return true;
    }

    public static void main(String[] args) {
        actions.put(RED, EnumMapExample::stop);
        actions.put(YELLOW, EnumMapExample::ready);
        actions.put(GREEN, EnumMapExample::go);

        actions.entrySet().stream().map(Map.Entry::getValue).forEach(Supplier::get);
    }
}
