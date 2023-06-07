package BTVN.BTVN5_4;

import java.util.Scanner;

public class Student {

    private int id;
    private String name;
    private String address;
    private int age;
    private float gpa;
    Scanner sc = new Scanner(System.in);

   
    public static int ID = 1;

    public void input() {
        this.id = ID;
        ID++;
        
        System.out.println("ENTER ID: ");
        id = sc.nextInt();
        sc.nextLine();
        System.out.println("ENTER STD NAME: ");
        name = sc.nextLine();
        System.out.println("ENTER STD ADDRESS:");
        address = sc.nextLine();
        System.out.println("ENTER STD AGE: ");
        age = sc.nextInt();
        System.out.println("ENTER STD GPA: ");
        gpa = sc.nextFloat();
    }

    public void output() {
        String line = String.format("%10d&20s&20s%10d%10f", id, name, address, age, gpa);
        System.out.println(line);
    }
    
    
    public int getId() {
        return id;
    }

    public void setId(String ID) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public float getGpa() {
        return gpa;
    }

    public void setGpa(float gpa) {
        this.gpa = gpa;
    }

}
