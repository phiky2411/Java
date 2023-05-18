
package baithuchanh;

import java.util.Scanner;


public class BaiSo11 {
    public static void main(String[] args) {
        int n;long sum = 0;
        
        Scanner sc = new Scanner(System.in);
        
        do { System.out.println("Nhap n:");
        n = sc.nextInt();
            
        }
        while (n < 1);
        for(int i = 1; i < n; i++){
            sum += factorial (i);
        }
        System.out.println("Tong S = "+ sum);
    }
    static long factorial (int n){
        long sum = 1;
        for(int i = 1; i <= n; i++) {
            sum = sum * i;
        }
        return sum;
    }
    }


