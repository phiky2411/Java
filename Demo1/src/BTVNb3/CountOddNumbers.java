
package BTVNb3;

import java.util.Scanner;



public class CountOddNumbers {
    public static void main(String[] args) {
        int n, count = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap gia tri mang :");
        n = sc.nextInt();
        int[] a = new int[n];
        
        for ( int i = 0; i < n; i++){
            System.out.println("Nhap a ["+ i +"] =");
            a[i] = sc.nextInt();
        }
        
        System.out.println("Mang vua nhap la :");
        for (int i = 0; i < n; i++){
            System.out.print(a[i] +" ");
        }
        
        for (int i = 0; i < n; i++){
            if (a[i] % 2 == 1){
                count++;
            }
        }
        System.out.println("\nSo luong so nguyen le la :"+ count);
    }
    
}
