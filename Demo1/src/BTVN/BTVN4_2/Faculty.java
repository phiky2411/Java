package BTVN.BTVN4_2;

import BTVN.BTVN4_2.School;
import java.util.Scanner;

public class Faculty {

    private String name;
    private String date;
    private School x = new School();
    Scanner sc = new Scanner(System.in);

    public void inputFaculty() {
        System.out.println("Name:");
        name = sc.nextLine();
        System.out.println("Date:");
        date = sc.nextLine();
        System.out.println("School:");
        x.inputSchool();

    }

    public void outputFaculty() {
        System.out.println("Name: " + name);
        System.out.println("Date: " + date);
        System.out.println("School: ");
        x.outputSchool();
    }
}
