package ua.com.vertex.generics;


class Customer {
    private static long counter = 1;
    private final long id = counter++;

    private Customer() {
    }

    // A method to produce Generator objects:
    public static Generator<Customer> generator() {
        return new Generator<Customer>() {
            public Customer next() {
                return new Customer();
            }
        };
    }

    public String toString() {
        return "Customer " + id;
    }
}
