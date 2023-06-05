package BTVN.BTVN5_2;

import java.util.Scanner;

public class SoPhuc {

    private int thuc, ao;
    Scanner sc = new Scanner(System.in);

    public void nhap() {
        System.out.println("Nhap phan thuc:");
        thuc = sc.nextInt();
        System.out.println("Nhap phan ao:");
        ao = sc.nextInt();
    }

    public void xuat() {
        System.out.println(thuc + " + i*" + ao);
    }

    public SoPhuc Cong(SoPhuc b) {
        SoPhuc c = new SoPhuc();
        c.thuc = thuc + b.thuc;
        c.ao = ao + b.ao;
        return c;
    }

    public SoPhuc Tru(SoPhuc b) {
        SoPhuc c = new SoPhuc();
        c.thuc = thuc - b.thuc;
        c.ao = ao - b.ao;
        return c;
    }

}
