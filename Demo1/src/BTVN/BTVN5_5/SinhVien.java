
package BTVN.BTVN5_5;

import java.util.Scanner;

public class SinhVien extends Nguoi {
    private String maSV;
    private String nganh;
    private int khoaHoc;
    Scanner sc = new Scanner(System.in);
    
    public void nhapSV(){
        super.nhap();
        System.out.println("Nhap ma SV:");
        maSV = sc.nextLine();
        System.out.println("Nhap nganh:");
        nganh = sc.nextLine();
        System.out.println("Nhap khoa hoc:");
        khoaHoc = sc.nextInt();
    }
    public void xuatSV(){
        super.xuat();
        System.out.println("Ma SV: "+ maSV);
        System.out.println("Nganh: "+ nganh);
        System.out.println("Khoa hoc: "+ khoaHoc);
    }

    public String getMaSV() {
        return maSV;
    }

    public void setMaSV(String maSV) {
        this.maSV = maSV;
    }

    public String getNganh() {
        return nganh;
    }

    public void setNganh(String nganh) {
        this.nganh = nganh;
    }

    public int getKhoaHoc() {
        return khoaHoc;
    }

    public void setKhoaHoc(int khoaHoc) {
        this.khoaHoc = khoaHoc;
    }
    
}
