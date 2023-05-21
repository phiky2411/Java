
package BTVN.BTVNb4;

import java.util.Scanner;


public class NSX {
    private int Mansx;
    private String Tennsx;
    private String Dcnsx;
    Scanner sc = new Scanner(System.in);
    
    public void nhapNSX(){
        System.out.println("Nhap ma nsx:");
        Mansx = sc.nextInt();
        System.out.println("Nhap ten nsx:");
        Tennsx = sc.nextLine();
        
        sc.nextLine();
        System.out.println("Nhap dia chi nsx:");
        Dcnsx = sc.nextLine();
    }
    public void xuatNSX(){
        System.out.println(Mansx +" - "+ Tennsx +" - "+ Dcnsx);
    }
}
