package org.cj.delegate;

/**
 * 委派模式-通过一个处理类，不管过程，根据不同要求进行不同处理，只关心结果，行为型。
 * 主要
 */
public class DelegateTest {


    public static void main(String[] args) {
        Leader leader = new Leader();
        leader.doWork("a");
        leader.doWork("b");
    }
}
