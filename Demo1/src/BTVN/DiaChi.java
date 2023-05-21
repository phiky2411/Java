
package BTVN;

import java.util.Scanner;


public class DiaChi {
    private String xa;
    private String huyen;
    private String tinh;
    Scanner sc = new Scanner(System.in);
    
    public void nhapDiaChi(){
        System.out.println("Nhap xa:");
        xa = sc.nextLine();
        System.out.println("Nhap huyen:");
        huyen = sc.nextLine();
        System.out.println("Nhap tinh:");
        tinh = sc.nextLine();
    }
    public void xuatDiaChi(){
        System.out.println(xa +" - "+ huyen +" - "+ tinh);
    }
            
    
}
