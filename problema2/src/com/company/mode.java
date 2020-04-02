
package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class mode {
    private static int aux;
    int[] a;
    int[] b;
    int n;

    Scanner sc = new Scanner(System.in);

    public void setArray(int[] a, int n) {
        for (int i = 0; i < n; i++) {
            System.out.print("a[" + i + "]=");
            a[i] = sc.nextInt();
        }
    }


    public void getArray(int[] b, int n) {
        for (int i = 0; i < n; i++) {
            System.out.println("a[" + i + "]=" + b[i]);


        }
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

    }

    void heapify(int b[], int n, int i) {
        int largest = i;
        int l = 2 * i + 1;
        int r = 2 * i + 2;

        if (l < n && b[l] < b[largest])
            largest = l;

        if (r < n && b[r] < b[largest])
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

    }
}
