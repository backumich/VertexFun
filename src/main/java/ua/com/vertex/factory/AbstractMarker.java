package ua.com.vertex.factory;

/**
 * Created by sweet_home on 10.09.16.
 */
public abstract class AbstractMarker implements Marker {

    protected final String openTag;
    protected final String closeTag;
    private final String color;

//    protected AbstractMarker(){}

    protected AbstractMarker(String color) {
        this.color = color;
        this.openTag = "<" + color + ">";
        this.closeTag = "</" + color + ">";
    }

    public void print(String string) {
        System.out.println(openTag + string + closeTag);
    }
}
