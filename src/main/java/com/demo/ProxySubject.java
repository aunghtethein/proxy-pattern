package com.demo;

public class ProxySubject implements Subject{

    private RealSubject realSubject;

    public ProxySubject(RealSubject realSubject) {
        this.realSubject = realSubject;
    }

    @Override
    public String doSomething() {
        doSomethingExtra();
        return realSubject.doSomething();
    }
    //alter extra behaviour
    private void doSomethingExtra() {
        System.out.println("Do Extra Behaviour ::");
    }

    //ProxySubject is the same type of Subject interface so this ProxySubject is only this, not target class
}
