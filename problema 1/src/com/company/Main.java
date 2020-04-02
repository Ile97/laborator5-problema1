package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        games ABC = new games();
        int[] a = new int[50];
        int[] b = new int[50];
        String d = "";
        boolean t = true;
        int n = 0;
        int[] aux = new int[1];
        System.out.println(
                "- C “ initializeaza tabloul de sortat cu valori generate aleator \n" +
                        "- V - vizualizeaza tablou \n" +
                        "- R - reinitializeaza tabloul: pentru aducerea tabloului la forma initializeaza dupa ce acesta a fost sortat, in vederea aplicarii unei alte sortari \n" +
                        "- S - sortare shellsort   \n" +
                        "- H - sortare heapsort    \n" +
                        "- Q- sortare quicksort    \n" +
                        "- X - paraseste  programului. \n ");
        Scanner sc = new Scanner(System.in);
        while (t) {
            System.out.print("Ce doriti?");
            String c = sc.nextLine();
            d = c.toLowerCase();
            switch (d) {

                case "c":
                    System.out.println("Introduceti numarul dorit: ");
                    n = sc.nextInt();
                    ABC.setArray(a, b, n);
                    break;
                case "v":
                    ABC.getArray(b, n);
                    break;
                case "r":
                    ABC.reset(a, b, n);
                    break;
                case "s":
                    ABC.shell(b, n);
                    break;
                case "h":
                    ABC.heap(b, n);
                    break;
                case "q":
                    ABC.quick(b, 0, n - 1);
                    ABC.getArray(b, n);
                case "x":
                    System.exit(0);
                    break;
                default:
                    System.out.println("Reintroduceti o litera valida");
                    break;
            }

        }

    }
}

