package BTVN.BTVN4_2;

import java.util.Scanner;

public class School {

    private String name;
    private String date;
    Scanner sc = new Scanner(System.in);

    public void inputSchool() {
        System.out.println("Name:");
        name = sc.nextLine();

        System.out.println("Date:");
        date = sc.nextLine();
    }

    public void outputSchool() {
        System.out.println("Name: " + name);
        System.out.println("Date: " + date);
    }
}
