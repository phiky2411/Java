package baithuchanh;

import java.util.Scanner;

public class BaiSo3 {

    public static void main(String[] args) {
        int i, n;
        float sum = 0;
        Scanner sc = new Scanner(System.in);

        do {
            System.out.println("Nhap gia tri n:");
            n = sc.nextInt();

        } while (n < 1);
        for (i = 1; i <= n ; i++) {
            sum += (float) 1/i;

        }
        System.out.println("Tong ="+ sum);
    }
}
