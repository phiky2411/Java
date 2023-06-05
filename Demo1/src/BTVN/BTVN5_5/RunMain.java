
package BTVN.BTVN5_5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

class RunMain {
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        List<SinhVien> sv = new ArrayList<>();
        System.out.println("Nhap so SV:");
        n = sc.nextInt();
        
        for(int i = 0; i < n; i++){
            SinhVien a = new SinhVien();
            System.out.println("Nhap thong tin SV thu "+ (i+1));
            a.nhapSV();
            sv.add(a);
        }
        
        Collections.sort(sv, new Comparator<SinhVien>() {
            @Override
            public int compare(SinhVien o1, SinhVien o2) {
                return -o1.getHoTen().compareTo(o2.getHoTen());
            }
        });
        for(SinhVien a: sv)
            System.out.println(a);
    }
    
}
