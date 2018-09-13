package com.kenjin.helloword;

import java.io.Serializable;

public class Isi implements Serializable {
    private String a="a";
    private String b;

    public Isi() {
    }

    public Isi(String a, String b) {
        this.a = a;
        this.b = b;
    }

    public Isi(String a) {
        this.a = a;
    }

    public String getA() {
        return a;
    }

    public void setA(String a) {
        this.a = a;
    }

    public String getB() {
        return b;
    }

    public void setB(String b) {
        this.b = b;
    }
}
