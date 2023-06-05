
package BTVN.BTVN5_3;

import java.util.Scanner;

public class DateTime {
    private int day;
    private int month;
    private int year;
    Scanner sc = new Scanner(System.in);
    
    public void inputDate(){
        System.out.println("Enter day:");
        day = sc.nextInt();
        System.out.println("Enter month:");
        month = sc.nextInt();
        System.out.println("Enter year:");
        year = sc.nextInt();
    }
     public void outputDate(){
        System.out.printf("Day: "+ day);
        System.out.println("Month: "+ month);
        System.out.println("Year: "+ year);
     }
}
