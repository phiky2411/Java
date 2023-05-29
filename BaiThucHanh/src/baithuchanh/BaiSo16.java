package baithuchanh;

import java.util.Scanner;

public class BaiSo16 {

    public static void main(String[] args) {
        int n;
        float x, S = 0;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("Nhap x:");
            x = sc.nextFloat();
            System.out.println("Nhap n:");
            n = sc.nextInt();
        } while (n <= 0);

        Math.pow(x, n);
        for (int i = 1; i <= n; i++) {
            S += Math.pow(x, i) / i;
        }
        System.out.println("S = " + S);
    }
}
