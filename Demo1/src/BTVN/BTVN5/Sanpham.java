
package BTVN.BTVN5;

import java.util.Scanner;


public class Sanpham {
    protected int maSanPham;
    protected String tenSanPham;
    protected String hangSanXuat;
    protected String ngayNhap;
    Scanner sc = new Scanner(System.in);
    
   
    public void nhap(){
        System.out.println("Nhap ma san pham:");
        maSanPham = sc.nextInt();
        sc.nextLine();
        System.out.println("Nhap ten san pham:");
        tenSanPham = sc.nextLine();
        System.out.println("Nhap hang san xuat:");
        hangSanXuat = sc.nextLine();
        System.out.println("Ngay nhap:");
        ngayNhap = sc.nextLine();
    }

    @Override
    public String toString() {
        return "Sanpham{" + "maSanPham=" + maSanPham + ", tenSanPham=" + tenSanPham + ", hangSanXuat=" + hangSanXuat + ", ngayNhap=" + ngayNhap + '}';
    }

    public int getMaSanPham() {
        return maSanPham;
    }

    public void setMaSanPham(int maSanPham) {
        this.maSanPham = maSanPham;
    }

    public String getHangSanXuat() {
        return hangSanXuat;
    }

    public void setHangSanXuat(String hangSanXuat) {
        this.hangSanXuat = hangSanXuat;
    }

    public String getNgayNhap() {
        return ngayNhap;
    }

    public void setNgayNhap(String ngayNhap) {
        this.ngayNhap = ngayNhap;
    }
    
}
