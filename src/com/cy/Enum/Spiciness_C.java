package com.cy.Enum;

/**
 * @author a123
 * @title: Spiciness_C
 * @projectName thinking-in-java
 * @description: TODO
 * @date 2019/8/218:07 PM
 */
public class Spiciness_C {
    public static void main(String args[]) {
        System.out.println(Spiciness.A.getCode()+":"+Spiciness.A.getStatus());
        A a = new A(Spiciness.A.getStatus());
        a.hello();
    }
}

class A{
    String name;

    public A(String name) {
        this.name = name;
    }
    public void hello(){
        System.out.println(name);
    }
}
