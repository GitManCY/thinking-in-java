package com.cy.Array;

import com.sun.org.apache.xml.internal.security.utils.JavaUtils;

import java.util.Arrays;
import java.util.Random;

/**
 * @author a123
 * @title: Array_1
 * @projectName thinking-in-java
 * @description: TODO
 * @date 2019/8/217:40 PM
 */
public class Array_1 {

    public static void main(String args[]) {
        int[] arr1 = new int[new Random().nextInt(20)];
        System.out.println(Arrays.toString(arr1));
    }
}
