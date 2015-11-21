package com.test.jasperiframetest.entity;


public class Role {
    private int id;
    private String value;

    public Role(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
