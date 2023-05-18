package baithuchanh;

import java.util.Scanner;

public class BaiSo7 {

    public static void main(String[] args) {
        int n;
        float sum = 0;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("Nhap gia tri n:");
            n = sc.nextInt();

        } while (n < 0);
        for (int i = 1; i <= n; i++) {
            sum += (float) i / (i + 1);
        }
        System.out.println("Tong =" + sum);

    }

}
