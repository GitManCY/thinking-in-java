package com.cy.combox;

/**
 * @author a123
 * @title: CADSystem
 * @projectName thinking-in-java
 * @description: TODO
 * @date 2019/8/219:30 PM
 */
public class CADSystem extends shape {
    private circle c;
    private traingle t;
    private line[] lines = new line[3];

    CADSystem(int i) {
        super(i);
        for (Object li : lines
                ) {
            System.out.println(li);
        }
        c = new circle(2);
        t = new traingle(1);
        System.out.println("combox constructor");
    }

    public void dispose(){
        System.out.println("CAD SYSTEM");
    }


    public static void main(String args[]) {
        CADSystem cadSystem = new CADSystem(2);
        System.out.println(cadSystem.toString());
        cadSystem.dispose();

    }
}


class shape {
    shape(int i) {
        System.out.println("shape");
    }

    void dispose() {
        System.out.println("shape.dispose");
    }
}

class circle extends shape {

    circle(int i) {
        super(i);
        System.out.println("circle");
    }

    void dispose() {
        System.out.println("circle.dispose");
        super.dispose();
    }
}

class traingle extends shape {
    traingle(int i) {
        super(i);
        System.out.println("traingle");
    }

    @Override
    void dispose() {
        System.out.println("traingle dispose");
        super.dispose();
    }
}

class line extends shape {
    private Integer name;
    private Integer code;

    public line(int i, Integer name, Integer code) {
        super(i);
        this.name = name;
        this.code = code;
        System.out.println("line");
    }

    @Override
    void dispose() {
        System.out.println("line dispose");
        super.dispose();
    }
}