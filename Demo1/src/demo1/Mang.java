package demo1;

import java.util.Scanner;

public class Mang {

    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap n :");
        n = sc.nextInt();
        int[] a = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Nhap a [" + i + "] = ");
            a[i] = sc.nextInt();

        }
        System.out.println("Mang vua nhâp la :");
        for (int i = 0; i < n; i++) {
            System.out.print(a[i] + " ");
        }
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (a[i] > a[j]) {
                    int tam = a[i];
                    a[i] = a[j];
                    a[j] = tam;

                }
            }
        }
        System.out.println("\nMang sau sap xep la :");
        for (int i = 0; i < n; i++) {
            System.out.print(a[i] + " ");
        }
    }

}
