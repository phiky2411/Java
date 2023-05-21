
package BTVN.BTVN4_2;

import java.util.Scanner;


public class SCHOOL {
    private String Name;
    private int Date;
    Scanner sc = new Scanner(System.in);
    
    public void inputSCHOOL(){
        System.out.println("Name:");
        Name = sc.nextLine();
        
        System.out.println("Date:");
        Date = sc.nextInt();
    }
    
    public void outputSCHOOL(){
        System.out.println("Name: "+ Name);
        System.out.println("Date: "+ Date);
    }
}
