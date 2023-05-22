
package BTVN.BTVNb4;

import java.util.Scanner;


public class NSX {
    private int maNsx;
    private String tenNsx;
    private String dcNsx;
    Scanner sc = new Scanner(System.in);
    
    public void nhapNSX(){
        System.out.println("Nhap ma nsx:");
        maNsx = sc.nextInt();
        System.out.println("Nhap ten nsx:");
        tenNsx = sc.nextLine();
        
        sc.nextLine();
        System.out.println("Nhap dia chi nsx:");
        dcNsx = sc.nextLine();
    }
    public void xuatNSX(){
        System.out.println(maNsx +" - "+ tenNsx +" - "+ dcNsx);
    }
}
