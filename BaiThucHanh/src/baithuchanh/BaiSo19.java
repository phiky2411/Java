
package baithuchanh;

import java.util.Scanner;


public class BaiSo19 {
    public static void main(String[] args) {
        int n;
        float S = 0;
        Scanner sc = new Scanner(System.in);
        do{
            System.out.println("Nhap n:");
            n = sc.nextInt();
        }while(n <= 0);
        Math.sqrt(n);
        for(int i = 1; i < n; i++){
            S = (float)Math.sqrt(2 + S);
        }
        System.out.println("S ="+ S);
    }
    
}
