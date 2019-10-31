package com.cy.DuoTai;

/**
 * @author a123
 * @title: 转机
 * @projectName thinking-in-java
 * @description: TODO
 * @date 2019/8/225:52 PM
 */
public class ZhuanJi {

    public static void main(String args[]) {

    }
}

class Instruments{
    void play(Notes notes){
        System.out.println("Instrument paly");
    }
}

enum Notes{
    MIDDLE_C,V_SHARP,B_FLAT;
}

class Wind extends Instrument{
    void play(Notes notes){
        System.out.println("Wind paly");
    }
}