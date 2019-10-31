package com.cy.Interfaces;

/**
 * @author a123
 * @title: Apply
 * @projectName thinking-in-java
 * @description: TODO
 * @date 2019/8/233:52 PM
 */

/**
 * 继承之后 可以方法多态
 */

public class Apply {


}
class processor{
    public String name(){
        return getClass().getName();
    }
    Object pro(Object o){
        return o;
    }
}

class Upcase extends processor{
    String pro(Object o) {
        return (String) o;

    }
}