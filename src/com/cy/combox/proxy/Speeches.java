package com.cy.combox.proxy;

/**
 * @author a123
 * @title: Speeches
 * @projectName thinking-in-java
 * @description: TODO
 * @date 2019/8/219:08 PM
 */
public class Speeches extends SpeechesController{

    private String name;

    public Speeches(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Speeches{" +
                "name='" + name + '\'' +
                '}';
    }

    public static void main(String args[]) {
        SpeechesDelegation speechesDelegation = new SpeechesDelegation("chengyang");
        speechesDelegation.down();
        speechesDelegation.up();
    }
}

class SpeechesController {
    void up() {
        System.out.println("up");
    }
    ;

    void down() {
        System.out.println("down");
    }
    ;


}
