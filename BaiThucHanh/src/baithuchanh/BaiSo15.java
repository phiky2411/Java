package baithuchanh;

import java.util.Scanner;

public class BaiSo15 {

    public static void main(String[] args) {
        int n, denominator = 0;
        float S = 0;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("Nhap n:");
            n = sc.nextInt();
        } while (n <= 0);

        for (int i = 1; i <= n; i++) {
            denominator += i;
            S += (float) 1 / denominator;
        }
        System.out.println("S = " + S);

    }

}
