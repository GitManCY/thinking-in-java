package com.cy.Enum;

/**
 * @author a123
 * @title: Spiciness
 * @projectName thinking-in-java
 * @description: TODO
 * @date 2019/8/218:03 PM
 */
public enum Spiciness {

    A(1,"a"),
    B(2,"b"),
    C(3,"c"),
    D(4,"d");
    private Integer code;
    private String status;

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    Spiciness(Integer code, String status) {
        this.code = code;
        this.status = status;
    }


}
