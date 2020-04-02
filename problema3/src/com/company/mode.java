package com.company;

import java.util.Scanner;

public class mode {
    private static int aux;
    mode[] u = new mode[50];
    int n;


    public static void swap(mode u[], int x, int y) {
        mode temp = u[x];
        u[x] = u[y];
        u[y] = temp;
    }

    public void quick(mode u[], int low, int high) {

        int middle = low + (high - low) / 2;
        int pivot = u[middle].getFac();


        int i = low, j = high;
        while (i <= j) {

            while (u[i].getFac() > pivot) {
                i++;
            }

            while (u[j].getFac() < pivot) {
                j--;
            }

            if (i <= j) {
                swap(u, i, j);
                i++;
                j--;
            }
        }

        if (low < j) {
            quick(u, low, j);
        }
        if (high > i) {
            quick(u, i, high);
        }

    }
}




