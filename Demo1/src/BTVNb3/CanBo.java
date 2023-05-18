
package BTVNb3;

import java.util.Scanner;
import javax.swing.plaf.nimbus.NimbusLookAndFeel;


public class CanBo {
    private int maCanbo;
    private String hoTen;
    private int ngaySinh;
    private double ngayLam;
    Scanner sc = new Scanner(System.in);
    public void nhap (){
        System.out.println("Nhap ma can bo:");
        maCanbo = sc.nextInt();
        sc.nextLine();
        System.out.println("Nhap ho ten:");
        hoTen = sc.nextLine();
        System.out.println("Nhap ngay sinh:");
        ngaySinh = sc.nextInt();
        System.out.println("Nhap so ngay lam viec:");
        ngayLam = sc.nextDouble();
    }
    public double TinhLuong(){
        return ngayLam * 250000;
    }
    public void xuat(){
        System.out.println("Ma can bo:"+ maCanbo);
        System.out.println("Ho ten:"+ hoTen);
        System.out.println("Ngay sinh:"+ ngaySinh);
        System.out.println("So ngay lam viec:"+ ngayLam);
        
    }
    public static void main(String[] args) {
        CanBo canBo = new CanBo();
        canBo.nhap();
        System.out.println("Thong tin vua nhap la:");
        System.out.println("Luong thuc nhan la:"+ canBo.TinhLuong());
        canBo.xuat();
    }
    
}
