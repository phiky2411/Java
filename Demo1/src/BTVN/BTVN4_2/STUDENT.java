
package BTVN.BTVN4_2;

import BTVN.BTVN4_2.FACULTY;
import java.util.Scanner;


public class STUDENT {
    private FACULTY FACULTYy = new FACULTY();
    private String Class;
    private float Score;
    Scanner sc = new Scanner(System.in);
    
    public void input(){
        System.out.println("Faculty:");
        FACULTYy.inputFACULTY();
        System.out.println("Class:");
        Class = sc.nextLine();
        
        System.out.println("Score:");
        Score = sc.nextFloat();
    }
    
    public void output(){
        System.out.println("Faculty: ");
        FACULTYy.outputFACULTY();
        System.out.println("Class: "+ Class);
        System.out.println("Score: "+ Score);
    }
    
}
