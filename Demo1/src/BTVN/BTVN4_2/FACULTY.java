
package BTVN.BTVN4_2;

import BTVN.BTVN4_2.SCHOOL;
import java.util.Scanner;


public class FACULTY {
    private String Name;
    private int Date;
    private SCHOOL SCHOOLx = new SCHOOL();
    Scanner sc = new Scanner(System.in);
    
    public void inputFACULTY(){
        System.out.println("Name:");
        Name = sc.nextLine();
        System.out.println("Date:");
        Date = sc.nextInt();
        System.out.println("School:");
        SCHOOLx.inputSCHOOL();
        
    }
    
    public void outputFACULTY(){
        System.out.println("Name: "+ Name);
        System.out.println("Date: "+ Date);
        System.out.println("School: ");
        SCHOOLx.outputSCHOOL();
    }
}
