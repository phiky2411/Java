package baithuchanh;

import java.util.Scanner;

public class BaiSo2 {

    public static void main(String[] args) {
        int n;
        int sum = 0;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println(" Nhap gia tri n:");
            n = sc.nextInt();

        } while (n < 1);
        for (int i = 1; i <= n; i++) {
            sum = sum + i * i;
        }
        System.out.println("Tong =" + sum);

    }
}
