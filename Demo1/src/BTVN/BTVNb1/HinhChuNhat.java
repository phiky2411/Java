package BTVN.BTVNb1;

import java.util.Scanner;

public class HinhChuNhat {

    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap vao chieu dai HCN:");
        int dai = sc.nextInt();
        System.out.println("Nhap vao chieu rong HCN");
        int rong = sc.nextInt();
        int dientich = dai*rong;
        System.out.println("Dien tich HCN la:" +dientich);
        int chuvi = dai+rong;
        System.out.println("CHu vi HCN la:" +chuvi);
        
        
    }

}