package baithuchanh;

import java.util.Scanner;

public class BaiSo8 {

    public static void main(String[] args) {
        int n;
        float sum = 0;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("Nhap gia tri n:");
            n = sc.nextInt();

        } while (n < 0);
        for (int i = 1; i <= n; i++) {
            sum += (float) (2*i + 1) / (2 * i + 2);

        }
        System.out.println("Tong =" + sum);
    }
}
