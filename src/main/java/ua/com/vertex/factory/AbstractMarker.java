package ua.com.vertex.factory;


public abstract class AbstractMarker implements Marker {

    protected final String closeTag;
    private final String openTag;
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


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        AbstractMarker that = (AbstractMarker) o;

        return color != null ? color.equals(that.color) : that.color == null;

    }

    @Override
    public int hashCode() {
        return color != null ? color.hashCode() : 0;
    }
}
