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

    public static void main(String[] args) {
        HinhTron hinhTron = new HinhTron();
        hinhTron.nhap();
        System.out.println("Chu vi hinh tron la :" + hinhTron.tinhChuvi());
        System.out.println("Dien tich hinh tron la:" + hinhTron.tinhDientich());

    }

}
