package com.company;

import java.util.Scanner;

public class nume {
    String n;
    int add;
    int tel;
    int fac;
    Scanner sc = new Scanner(System.in);

    public void setN(String n) {
        this.n = n ;
    }

    public String getN() {
        return n;
    }

    public void setAdd(int add) {
        this.add = add;
    }

    public int getAdd() {
        return add;
    }

    public void setFac(int fac) {
        this.fac = fac;
    }

    public int getFac() {
        return fac;
    }

    public void setTel(int tel) {
        this.tel = tel;
    }

    public int getTel() {
        return tel;
    }
    public void info(String n,int fac){
        System.out.println(
                "Numele: " + n + "\n" +
                        "Plata: " + fac);
    }
}

