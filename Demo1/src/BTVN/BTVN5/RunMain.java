package BTVN.BTVN5;

import java.util.ArrayList;
import java.util.Scanner;

public class RunMain {

    public static void main(String[] args) {
        ArrayList<Dieuhoa> dieuhoas = new ArrayList<>();
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap so luong dieu hoa:");
        n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            Dieuhoa d = new Dieuhoa();
            System.out.println("Nhap thong tin san pham thu " + (i + 1));
            d.nhap();
            dieuhoas.add(d);
        }
        System.out.println("Nhung DH hang Electroluc va gia re nhat:");
        for (Dieuhoa d: dieuhoas){
            d.xuatDH();
        }
        int d = 0;
        long min = dieuhoas.get(0).getGiaBan();
        for (int i = 1; i < n; i++) {
            if (min > dieuhoas.get(i).getGiaBan()) {
                min = dieuhoas.get(i).getGiaBan();
            }
        }
        for (int i = 0; i < n; i++) {
            if ("Ele".equalsIgnoreCase(dieuhoas.get(i).getHangSanXuat()) && dieuhoas.get(i).getGiaBan() == min) {
                dieuhoas.get(i).xuatDH();
                d++;
            }

        }
        if (d == 0){ 
            System.out.println("Ko co SP nao");
        }
        
    }

}
