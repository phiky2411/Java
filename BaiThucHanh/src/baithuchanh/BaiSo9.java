package baithuchanh;

import java.util.Scanner;

public class BaiSo9 {

    static int factorial(int n) {
        if (n == 1) {
            return 1;
        } else {
            return (n * factorial(n - 1));
        }
    }

    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);

        System.out.println("Nhap n:");
        n = sc.nextInt();
        System.out.println("Vay T = " + factorial(n));
    }

}
