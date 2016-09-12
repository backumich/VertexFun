package ua.com.vertex.factory;

/**
 * Created by sweet_home on 10.09.16.
 */
public abstract class AbstractMarker implements Marker{

    private final String color;
    protected final String openTag;
    protected final String closeTag;

//    protected AbstractMarker(){}

    protected AbstractMarker(String color) {
        this.color = color;
        this.openTag = "<" + color + ">";
        this.closeTag = "</" + color + ">";
    }

    @Override
    public void print(String string) {
        System.out.println(openTag + string + closeTag);
    }
}
