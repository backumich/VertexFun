package ua.com.vertex.generics.issues;

interface Payable<T> {
}

/**
 * Created by sweet_home on 01.10.16.
 */
public class ParameteryzedInterface {
}

class Employee implements Payable<Employee> {
}
//class Hourly extends Employee
//        implements Payable<Hourly> {}