package org.cj.delegate;

public class EmployeeA implements IEmployee {
    public void doWork(String command) {
        System.out.println("A" + command);
    }
}
