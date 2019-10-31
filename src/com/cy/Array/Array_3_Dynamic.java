package com.cy.Array;

/**
 * @author a123
 * @title: Array_3_Dynamic
 * @projectName thinking-in-java
 * @description: TODO
 * @date 2019/8/217:47 PM
 */
public class Array_3_Dynamic {


    public static void main(String args[]) {
        others others = new others();
        others.main(new String[]{"a","b","c"});
    }


}

class others {
    public static void main(String args[]) {
        for (String s:args
             ) {
            System.out.println(s);
        }
    }

}
