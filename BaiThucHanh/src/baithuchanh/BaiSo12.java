package baithuchanh;

import java.util.Scanner;

public class BaiSo12 {

    public static void main(String[] args) {
        int n;
        double x, sum = 0, exponential;
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap x:");
        x = sc.nextDouble();
        System.out.println("Nhap n:");
        n = sc.nextInt();
        exponential = Math.pow(x, n);
        for (int i = 1; i < n; i++) {
            sum += exponential;
        }
        System.out.println("Tong S =" + sum);

    }
}
