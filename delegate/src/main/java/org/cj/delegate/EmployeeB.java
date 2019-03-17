package org.cj.delegate;

public class EmployeeB implements IEmployee {
    public void doWork(String command) {
        System.out.println("B" + command);
    }
}
