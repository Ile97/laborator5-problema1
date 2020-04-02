package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        mode ABC = new mode();
        int[] a = new int[50];
        int[] b = new int[50];
        int[] par = new int[50];
        int k = 0;
        int[] imp = new int[50];
        int l = 0;
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduceti numarul: ");
        n = sc.nextInt();
        ABC.setArray(a, n);
        ABC.getArray(a, n);
        for (int i = 0; i < n; i++) {
            if (i % 2 == 0) {
                par[k] = a[i];
                k++;
            } else {
                imp[l] = a[i];
                l++;
            }
        }
        ABC.shell(par, k);
        ABC.heap(imp, l);
        k = l = 0;
        for (int i = 0; i < n; i++) {
            if (i % 2 == 0) {
                b[i] = par[k];
                k++;
            } else {
                b[i] = imp[l];
                l++;
            }

        }
        System.out.println("Noul sir sortat:");
        ABC.getArray(b, n);


    }
}
