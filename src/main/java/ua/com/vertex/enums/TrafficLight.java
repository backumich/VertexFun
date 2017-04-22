package ua.com.vertex.enums;


import java.util.Map;

import static ua.com.vertex.enums.Signal.*;

enum Signal {GREEN, YELLOW, RED}

public class TrafficLight {
    Map<String, Signal> signals;
    Signal color = RED;

    public static void main(String[] args) {
        TrafficLight trafficLight = new TrafficLight();
        for (int i = 0; i < 7; i++) {
            System.out.println(trafficLight);
            trafficLight.change();
        }
    }

    public void change() {
        switch (color) {
            // Note that you don’t have to say Signal.RED
            // in the case statement:
            case RED:
                color = GREEN;
                break;
            case GREEN:
                color = YELLOW;
                break;
            case YELLOW:
                color = RED;
                break;
            default:
                color = RED;
                break;
        }
    }

    public String toString() {
        return "The traffic light is " + color;
    }
}
