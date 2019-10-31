package com.cy.combox;

/**
 * @author a123
 * @title: Hide
 * @projectName thinking-in-java
 * @description: TODO
 * @date 2019/8/2210:12 AM
 */


/**
 * 非重载 返回类型不同
 */

public class Hide {

    public static void main(String args[]) {
        Bart bart = new Bart();
        bart.c(new MiHouse());
        bart.c('c');
        bart.c(2.0f);
    }
}

class Homer{
    char c(char c){
        System.out.println("char c");
        return c;
    }
    float c(float c){
        System.out.println("float c");
        return c;
    }
}

class MiHouse{}

class Bart extends Homer{
    void c(MiHouse m){
        System.out.println("Bart void c");
    }

}