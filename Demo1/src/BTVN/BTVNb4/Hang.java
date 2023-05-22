
package BTVN.BTVNb4;

import java.util.Scanner;


public class Hang {
    private int maHang;
    private String tenHang;
    private NSX NSXx = new NSX();
    Scanner sc = new Scanner(System.in);
    
    public void nhap(){
        System.out.println("Nhap ma hang:");
        maHang = sc.nextInt();
        sc.nextLine();
        System.out.println("Nhap ten hang:");
        tenHang = sc.nextLine();
        System.out.println("Nhap NSX:");
        NSXx.nhapNSX();
    }
    public void xuat(){
        System.out.println("Ma hang: "+ maHang);
        System.out.println("Ten hang: "+ tenHang);
        System.out.print("NSX: ");
        NSXx.xuatNSX();
    }
}
