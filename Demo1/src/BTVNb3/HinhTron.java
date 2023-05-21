package BTVNb3;

import java.util.Scanner;

public class HinhTron {
    
    private double banKinh;
    Scanner sc = new Scanner(System.in);

    public void nhap() {
        System.out.println("Nhap ban kinh:");
        banKinh = sc.nextDouble();
    }

    public double tinhChuvi() {
        return 2 * Math.PI * banKinh;
    }

    public double tinhDientich() {
        return Math.PI * banKinh * banKinh;
    }

}
