package ua.com.vertex.generics.bounds;

class Colored<T extends HasColor> {
    T item;

    Colored(T item) {
        this.item = item;
    }

    public static void main(String[] args) {
        Solid<Bounded> solid =
                new Solid<Bounded>(new Bounded());
        solid.color();
        solid.getY();
        solid.weight();
    }

    T getItem() {
        return item;
    }

    // The bound allows you to call a method:
    java.awt.Color color() {
        return item.getColor();
    }

    interface Weight {
        int weight();
    }

    static class Dimension {
        public int x, y, z;
    }

    // As with inheritance, you can have only one
    // concrete class but multiple interfaces:
    static class Solid<T extends Dimension & HasColor & Weight> {
        T item;

        Solid(T item) {
            this.item = item;
        }

        T getItem() {
            return item;
        }

        java.awt.Color color() {
            return item.getColor();
        }

        int getX() {
            return item.x;
        }

        int getY() {
            return item.y;
        }

        int getZ() {
            return item.z;
        }

        int weight() {
            return item.weight();
        }
    }


    static class Bounded extends Dimension implements HasColor, Weight {
        public java.awt.Color getColor() {
            return null;
        }

        public int weight() {
            return 0;
        }
    }

    // This won’t work -- class must be first, then interfaces:
//     class ColoredDimension<T extends HasColor, Dimension> {
    // Multiple bounds:
    class ColoredDimension<T extends Dimension & HasColor> {
        T item;

        ColoredDimension(T item) {
            this.item = item;
        }

        T getItem() {
            return item;
        }

        java.awt.Color color() {
            return item.getColor();
        }

        int getX() {
            return item.x;
        }

        int getY() {
            return item.y;
        }

        int getZ() {
            return item.z;
        }
    }
}
