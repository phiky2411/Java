package baithuchanh;

import java.util.Scanner;

public class BaiSo1 {

    public static void main(String[] args) {
        int sum = 0;int n;
        Scanner sc = new Scanner(System.in);
        do{ System.out.println(" Nhap so nguyen n:");
        n = sc.nextInt();
        }while (n<=0);
        
    
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        System.out.println("Tong cac so tu 1 den +n+ la :" + sum);

    }

}
