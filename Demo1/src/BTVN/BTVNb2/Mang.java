package BTVN.BTVNb2;

import java.util.Scanner;

public class Mang {

    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap n :");
        n = sc.nextInt();
        int[] a = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Nhap a [" + i + "] =");
            a[i] = sc.nextInt();
        }
        System.out.println("Mang vua nhap la :");
        for (int i = 0; i < n; i++) {
            System.out.print(a[i] + " ");
        }
        int max = a[0];
        for (int i = 0; i < n; i++) {
            if (a[i] > max) {
                max = a[i];
            }
        }
        System.out.println("\nSo lon nhat trong mang la:" + max);

        for (int i = 0; i < a.length; i++) {
            if (a[i] % 2 == 1) {
                System.out.println("So le dau tien trong mang la :" + a[i]);
                System.out.println("Chi muc la :" + i);

                break;

            }

        }

        System.out.println("Cac so nguyen to trong mang la: ");
        for (int i = 0; i < a.length; i++) {
            if (isPrime(a[i])) {
                System.out.println(a[i] + "");
            }
        }
    }

    public static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        } else {

            for (int i = 2; i <= Math.sqrt(n); i++) {
                if (n % i == 0) {
                    return false;
                }
            }
        }
        return true;
    }

}