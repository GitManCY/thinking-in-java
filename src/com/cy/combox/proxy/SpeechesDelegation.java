package com.cy.combox.proxy;

/**
 * @author a123
 * @title: SpeechesDelegation
 * @projectName thinking-in-java
 * @description: TODO
 * @date 2019/8/219:13 PM
 */
public class SpeechesDelegation {

    private String name;
    private SpeechesController speechesController = new SpeechesController();

    public SpeechesDelegation(String name) {
        this.name = name;
    }

    void up() {
        speechesController.up();
    }
    ;

    void down() {
        speechesController.down();
    }
    ;
}
