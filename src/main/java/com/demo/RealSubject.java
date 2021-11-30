package com.demo;

public class RealSubject implements Subject{
    @Override
    public String doSomething() {
        return "Do Something ::";
    }

    //RealSubject is same type of Subject Interface so this RealSubject is both of target class and this
}
