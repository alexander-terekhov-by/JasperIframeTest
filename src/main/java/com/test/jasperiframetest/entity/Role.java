package com.test.jasperiframetest.entity;

import com.sun.istack.internal.NotNull;

import javax.persistence.*;

@Entity
@Table(name = "roles")
public class Role {
    @Id
    @Column(name = "id")
    @NotNull
    private int id;

    @Column(name = "value")
    @NotNull
    private String value;

    public Role(String value) {
        this.value = value;
    }

    public Role() {
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
