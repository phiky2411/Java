
package BTVN.BTVNb4;

import java.util.Scanner;


public class HANg {
    private int mahang;
    private String tenhang;
    private NSX NSx = new NSX();
    Scanner sc = new Scanner(System.in);
    
    public void nhap(){
        System.out.println("Nhap ma hang:");
        mahang = sc.nextInt();
        sc.nextLine();
        System.out.println("Nhap ten hang:");
        tenhang = sc.nextLine();
        System.out.println("Nhap NSX:");
        NSx.nhapNSX();
    }
    public void xuat(){
        System.out.println("Ma hang: "+ mahang);
        System.out.println("Ten hang: "+ tenhang);
        System.out.print("NSX: ");
        NSx.xuatNSX();
    }
}
