package com.cy.DuoTai;

import com.sun.tools.corba.se.idl.constExpr.Not;

/**
 * @author a123
 * @title: 向上转型
 * @projectName thinking-in-java
 * @description: TODO
 * @date 2019/8/225:08 PM
 */
public class ChangeUp extends Instrument{

    public void play(Note note){
        System.out.println("changeUp.paly()");

    }

}
class Instrument{
    public void play(Note note){
        System.out.println("Instrument.paly()");
    }
}

 enum Note{
    MIDDLE_C,SHARP_C,B_FLAT;
}

class music{
    public static void tune(Instrument instrument){
        instrument.play(Note.MIDDLE_C);
    }
    public static void main(String args[]) {
        ChangeUp changeUp = new ChangeUp();
        tune(changeUp);
    }
}
class music2{
    public static void tune(Instrument instrument){
        instrument.play(Note.MIDDLE_C);
    }
    public static void main(String args[]) {
        ChangeUp changeUp = new ChangeUp();
        tune(changeUp);
    }
}

class stringed extends Instrument{
    public void play(Note note){
        System.out.println("stringed.play()");
    }
}
class stringed2 extends Instrument{
    public void play(Note note){
        System.out.println("stringed.play()");
    }
}