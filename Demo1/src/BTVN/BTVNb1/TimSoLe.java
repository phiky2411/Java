package BTVN.BTVNb1;

import java.util.Scanner;

public class TimSoLe {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap so nguyen n:");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            if (i%2 ==1) {
                System.out.println("Vay cac so le la:"+i);
            }
           
        }

    }

}
