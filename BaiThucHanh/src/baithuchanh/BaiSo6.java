package baithuchanh;

import java.util.Scanner;

public class BaiSo6 {

    public static void main(String[] args) {
        int n;
        float sum = 0;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("Nhap gia tri n:");
            n = sc.nextInt();

        } while (n <= 1);
        for (int i = 1; n >= i; i++) {
            sum += (float) 1 / (i * i);

        }
        System.out.println("Tong =" + sum);
    }

}
