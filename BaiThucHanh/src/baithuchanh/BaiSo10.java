package baithuchanh;

import java.util.Scanner;

public class BaiSo10 {

    public static void main(String[] args) {
        double x, n, exponential;
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap x:");
        x = sc.nextDouble();
        System.out.println("Nhap n:");
        n = sc.nextDouble();
        exponential = Math.pow(x, n);
        System.out.println(x + "^" + n + "=" + exponential);

    }
}
