
package baithuchanh;

import java.util.Scanner;


public class BaiSo18 {
    public static void main(String[] args) {
        int n;
        int maxOddDivisor = 1;
        Scanner sc = new Scanner(System.in);
        do{
            System.out.println("Nhap so nguyen n:");
            n = sc.nextInt();
        }while(n<=0);
        
        for(int i = 1; i <= n; i++){
            if(n%i == 0 && i%2 == 1 && maxOddDivisor < i){
            maxOddDivisor = i;
        }
        }
        System.out.println("Uoc so le lon nhat cua "+ n +" la:"+ maxOddDivisor);
    }
}
