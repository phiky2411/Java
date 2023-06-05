
package BTVN.BTVN5_3;

import java.util.Scanner;

public class SanPham {
    private String maSP;
    private String tenSP;
    private int soLuong;
    private int donGia;
    Scanner sc = new Scanner(System.in);
    
    public void inputSP(){
        System.out.println("Enter product code:");
        maSP = sc.nextLine();
        System.out.println("Enter product name::");
        tenSP = sc.nextLine();
        System.out.println("Enter quantity:");
        soLuong = sc.nextInt();
        System.out.println("Enter price:");
        donGia = sc.nextInt();
    }
    public void outputSP(){
        System.out.println("Product code: "+ maSP);
        System.out.println("Product name: "+ tenSP);
        System.out.println("Quantity: "+ soLuong);
        System.out.println("Price: "+ donGia);
    }

    public String getMaSP() {
        return maSP;
    }

    public void setMaSP(String maSP) {
        this.maSP = maSP;
    }

    public String getTenSP() {
        return tenSP;
    }

    public void setTenSP(String tenSP) {
        this.tenSP = tenSP;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }

    public int getDonGia() {
        return donGia;
    }

    public void setDonGia(int donGia) {
        this.donGia = donGia;
    }
    
}
