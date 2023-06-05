
package BTVN.BTVN5_5;

import java.util.Scanner;

public class Nguoi {
    protected String hoTen;
    protected String ngaySinh;
    protected String queQuan;
    Scanner sc = new Scanner(System.in);
    
    public void nhap(){
        System.out.println("Nhap ho ten:");
        hoTen = sc.nextLine();
        System.out.println("Nhap ngay sinh:");
        ngaySinh = sc.nextLine();
        System.out.println("Nhap que quan:");
        queQuan = sc.nextLine();
    }

    public void xuat(){
        System.out.println("Ho ten: "+ hoTen);
        System.out.println("Ngay sinh: "+ ngaySinh);
        System.out.println("Que quan: "+ queQuan);

    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public String getNgaySinh() {
        return ngaySinh;
    }

    public void setNgaySinh(String ngaySinh) {
        this.ngaySinh = ngaySinh;
    }

    public String getQueQuan() {
        return queQuan;
    }

    public void setQueQuan(String queQuan) {
        this.queQuan = queQuan;
    }
    
}
