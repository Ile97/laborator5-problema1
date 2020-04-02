package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class games {
    int[] a;
    int[] b;
    int n;
    int temp;
    Scanner sc = new Scanner(System.in);

    public static void swap(int b[], int x, int y) {
        int temp = b[x];
        b[x] = b[y];
        b[y] = temp;
    }

    public void setArray(int[] a, int[] b, int n) {
        for (int i = 0; i < n; i++) {
            int j = i + 1;
            System.out.print("a[" + j + "]=");
            a[i] = b[i] = sc.nextInt();
        }
    }

    public void getArray(int[] b, int n) {
        for (int i = 0; i < n; i++) {
            int j = i + 1;
            System.out.println("a[" + j + "]=" + b[i]);


        }
    }

    public void reset(int[] a, int[] b, int n) {
        for (int i = 0; i < n; i++) {
            b[i] = a[i];
        }
        getArray(b, n);
    }

    public void quick(int[] b, int low, int high) {

        int middle = low + (high - low) / 2;
        int pivot = b[middle];


        int i = low, j = high;
        while (i <= j) {

            while (b[i] < pivot) {
                i++;
            }

            while (b[j] > pivot) {
                j--;
            }

            if (i <= j) {
                swap(b, i, j);
                i++;
                j--;
            }
        }

        if (low < j) {
            quick(b, low, j);
        }
        if (high > i) {
            quick(b, i, high);
        }
        getArray(b, n);
    }

    public void heap(int[] b, int n) {


        for (int i = n / 2 - 1; i >= 0; i--)
            heapify(b, n, i);

        for (int i = n - 1; i >= 0; i--) {
            int temp = b[0];
            b[0] = b[i];
            b[i] = temp;

            heapify(b, i, 0);
        }
        getArray(b, n);
    }

    void heapify(int b[], int n, int i) {
        int largest = i;
        int l = 2 * i + 1;
        int r = 2 * i + 2;

        if (l < n && b[l] > b[largest])
            largest = l;

        if (r < n && b[r] > b[largest])
            largest = r;

        if (largest != i) {
            int swap = b[i];
            b[i] = b[largest];
            b[largest] = swap;

            heapify(b, n, largest);
        }
    }


    public void shell(int[] b, int n) {
        for (int gap = n / 2; gap > 0; gap /= 2) {

            for (int i = gap; i < n; i += 1) {

                int temp = b[i];

                int j;
                for (j = i; j >= gap && b[j - gap] > temp; j -= gap)
                    b[j] = b[j - gap];

                b[j] = temp;
            }
        }
        getArray(b, n);
    }
}
