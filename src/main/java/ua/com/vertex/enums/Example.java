package ua.com.vertex.enums;

public enum Example {

    INSTANCE_ONE("Example one"), INSTANCE_TWO("Example two"),
    INSTANCE_TREE(String.class);

    private String description;

    Example(String description) {
        this.description = description;
    }

    Example(Class<?> clazz) {
        this.description = clazz.getName();
    }

    public static void main(String[] args) {
//        Arrays.stream(Example.values()).map(Enum::name).forEach(System.out::println);
//        Arrays.stream(Example.values()).forEach(System.out::println);

        System.out.println(INSTANCE_ONE.getDescription());

    }

    public String getDescription() {
        return description;
    }

    @Override
    public String toString() {
        return getDescription();
    }
}
