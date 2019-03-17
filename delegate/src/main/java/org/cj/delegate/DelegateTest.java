package org.cj.delegate;

public class DelegateTest {
    public static void main(String[] args) {
        Leader leader = new Leader();
        leader.doWork("a");
        leader.doWork("b");
    }
}
