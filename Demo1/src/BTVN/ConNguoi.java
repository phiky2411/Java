
package BTVN;

import java.util.Scanner;

public class ConNguoi {
    private String ten;
    private int tuoi;
    private DiaChi diaChi = new DiaChi();
    Scanner sc = new Scanner(System.in);
    
    public void nhap(){
        System.out.println("Nhap ten:");
        ten = sc.nextLine();
        System.out.println("Nhap tuoi:");
        tuoi = sc.nextInt();
        
        sc.nextLine();
        System.out.println("Nhap dia chi:");
        diaChi.nhapDiaChi();
        
    }
    public void xuat(){
        System.out.println("ten:"+ ten);
        System.out.println("tuoi:"+ tuoi);
        System.out.print("dia chi:");
        diaChi.xuatDiaChi();
    }
    
}
