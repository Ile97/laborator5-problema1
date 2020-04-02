package com.company;

import java.util.List;
import java.util.Scanner;

public class Main {

    public static  void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        nume[] u = new nume[50];
         mode ABC = new mode();
        System.out.println("Cati oameni?");
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            u[i] = new nume();
        }
        for (int i = 0; i < n; i++) {
            int j = i+1;
            System.out.println("Persoana " + j );
            System.out.print("Numele: ");
            u[i].setN(sc.next());
            System.out.print("Adresa: ");
            u[i].setAdd(sc.nextInt());
            System.out.print("Numar telefon: ");
            u[i].setTel(sc.nextInt());
            System.out.print("Plata: ");
            u[i].setFac(sc.nextInt());


        }
        for (int i = 0; i < n; i++) {

        }

        ABC.quick(u, 0, n-1);
        System.out.println("\nCele mai mari plati: ");
        for (int i = 0; i < 3; i++) {
            u[i].info(u[i].getN(), u[i].getFac());
        }

    }

}

