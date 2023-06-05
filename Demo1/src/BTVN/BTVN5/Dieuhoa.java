
package BTVN.BTVN5;

import java.util.Scanner;


public class Dieuhoa extends Sanpham{
    private Sanpham sp = new Sanpham();
    private String congSuat;
    private Long giaBan;
    Scanner sc = new Scanner(System.in);
    
    public void nhap(){
        super.nhap();
        System.out.println("Nhap cong suat:");
        congSuat = sc.nextLine();
        System.out.println("Nhap gia ban:");
        giaBan = sc.nextLong();
    }

    @Override
    public String toString() {
        super.toString();
        return "Dieuhoa{" + "congSuat=" + congSuat + ", giaBan=" + giaBan + '}';
    }

    public String getCongSuat() {
        return congSuat;
    }

    public void setCongSuat(String congSuat) {
        this.congSuat = congSuat;
    }

    public Long getGiaBan() {
        return giaBan;
    }

    public void setGiaBan(Long giaBan) {
        this.giaBan = giaBan;
    }
    
    
}
