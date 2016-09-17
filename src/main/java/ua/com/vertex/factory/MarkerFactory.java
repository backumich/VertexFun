package ua.com.vertex.factory;

import org.openjdk.jmh.annotations.Benchmark;
import ua.com.vertex.factory.impl.GreenMarker;
import ua.com.vertex.factory.impl.RedMarker;

/**
 * Created by sweet_home on 10.09.16.
 */
public class MarkerFactory {

    public static final String RED = "Red";
    public static final String GREEN = "Green";

    public static Marker getInstance(String color) throws ClassNotFoundException, IllegalAccessException, InstantiationException {
        Marker toReturn;
//        Marker toReturn =
//                (Marker) Class.forName("ua.com.vertex.factory.impl." +
//                        color + "Marker").newInstance();

        if (RED.equalsIgnoreCase(color)) {
            toReturn = new RedMarker();
        } else if (GREEN.equalsIgnoreCase(color)) {
            toReturn = new GreenMarker();
        } else {
            throw new IllegalArgumentException("No such implementation");
        }
        return toReturn;
    }

    public static void main(String[] args) throws IllegalAccessException, InstantiationException, ClassNotFoundException {
        Marker red = MarkerFactory.getInstance(MarkerFactory.RED);
        Marker green = MarkerFactory.getInstance(MarkerFactory.GREEN);

        red.print("red test");
        green.print("green string");
    }

    @Benchmark
    public void measureName() throws IllegalAccessException, InstantiationException, ClassNotFoundException {
        MarkerFactory.getInstance("Red");
    }
}
