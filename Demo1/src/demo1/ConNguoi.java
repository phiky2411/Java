
package demo1;

import java.util.Scanner;


public class ConNguoi {
    
    private String ten;
    private int tuoi;
    private String diaChi;
    Scanner sc = new Scanner(System.in);
    
    public void nhap(){
        System.out.println("Nhap ten:");
        ten = sc.nextLine();
        System.out.println("Nhap tuoi:");
        tuoi = sc.nextInt();
        sc.nextLine();
        System.out.println("Nhap dia chi:");
        diaChi = sc.nextLine();
    }
    public void xuat(){
        System.out.println("ten:"+ ten);
        System.out.println("tuoi:"+ tuoi);
        System.out.println("dia chi:"+ diaChi);
    }
    
}
