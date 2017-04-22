package ua.com.vertex.enums;

import java.util.ArrayList;
import java.util.EnumSet;
import java.util.List;

import static ua.com.vertex.enums.Signal.*;


public class EnumSetExperiments {

    public static void main(String[] args) {
//        List<String> signals = Arrays.stream(Signal.values()).map(p -> p.toString()).collect(Collectors.toList());

        List<Signal> signals = new ArrayList<>();
        signals.add(RED);
        signals.add(RED);

        EnumSet<Signal> set = EnumSet.copyOf(signals);
        print(set);

        set = EnumSet.noneOf(Signal.class); // Empty set
        set.add(GREEN);
        print(set);
        set.addAll(EnumSet.of(GREEN, YELLOW));
        print(set);
        set = EnumSet.allOf(Signal.class);
        set.removeAll(EnumSet.of(RED, GREEN));
        print(set);
        EnumSet<Signal> range = EnumSet.range(GREEN, RED);
        print(range);
        set.removeAll(range);
        print(set);
        set = EnumSet.complementOf(set);
        print(set);
    }

    private static void print(EnumSet set) {
        System.out.println(set);
    }
}
