package baithuchanh;

import java.util.Scanner;

public class BaiSo12 {

    public static void main(String[] args) {
        int n, x, S = 0;

        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap x:");
        x = sc.nextInt();
        System.out.println("Nhap n:");
        n = sc.nextInt();
        Math.pow(x, n);
        for (int i = 1; i <= n; i++) {
            S += Math.pow(x, i);
        }
        System.out.println("Tong S = " + S);

    }
}
