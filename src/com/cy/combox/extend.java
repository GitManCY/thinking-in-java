package com.cy.combox;

import jdk.nashorn.internal.objects.annotations.Getter;

/**
 * @author a123
 * @title: extend
 * @projectName thinking-in-java
 * @description: TODO
 * @date 2019/8/218:54 PM
 */
public class extend extends B{


    public static void main(String args[]) {
        B b = new extend();
        b.hello();
    }


}
class B{
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void hello(){
        System.out.println("hello");
    }

    public static void main(String args[]) {
        B b = new B();
        b.hello();
    }
}
