
package BTVN.BTVN5_5;


import java.util.Scanner;

public class LopHoc {
    private String maLH;
    private String tenLH;
    private String ngayMo;
    private String giaoVien;
    Scanner sc = new Scanner(System.in);
    
    
    public void nhapLH(){
        System.out.println("Nhap ma LH:");
        maLH = sc.nextLine();
        System.out.println("Nhap ten LH:");
        tenLH = sc.nextLine();
        System.out.println("Nhap ngay mo:");
        ngayMo = sc.nextLine();
        System.out.println("Nhap giao vien:");
        giaoVien = sc.nextLine();
    }
        
    public void xuatLH(){
        System.out.println("Ma LH: "+ maLH);
        System.out.println("Ten LH: "+ tenLH);
        System.out.println("Ngay mo: "+ ngayMo);
        System.out.println("Giao vien: "+ giaoVien);
    }

    public String getMaLH() {
        return maLH;
    }

    public void setMaLH(String maLH) {
        this.maLH = maLH;
    }

    public String getTenLH() {
        return tenLH;
    }

    public void setTenLH(String tenLH) {
        this.tenLH = tenLH;
    }

    public String getNgayMo() {
        return ngayMo;
    }

    public void setNgayMo(String ngayMo) {
        this.ngayMo = ngayMo;
    }

    public String getGiaoVien() {
        return giaoVien;
    }

    public void setGiaoVien(String giaoVien) {
        this.giaoVien = giaoVien;
    }
    
}
