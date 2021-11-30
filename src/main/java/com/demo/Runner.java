package com.demo;

public class Runner {
    public static void main(String[] args) {
        Subject subject = new ProxySubject(new RealSubject());
        System.out.println(subject.doSomething());
    }
}
