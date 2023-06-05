package BTVN.BTVN5_4;

import java.util.Scanner;

public class Student {

    private String id;
    private String name;
    private String address;
    private int age;
    private float gpa;
    Scanner sc = new Scanner(System.in);

    public void input(){
        System.out.println("ENTER ID: ");
        id = sc.nextLine();
        System.out.println("ENTER STD NAME: ");
        name = sc.nextLine();
        System.out.println("ENTER STD ADDRESS:");
        address = sc.nextLine();
        System.out.println("ENTER STD AGE: ");
        age = sc.nextInt();
        System.out.println("ENTER STD GPA: ");
        gpa = sc.nextFloat();
    }
    public void output(){
        System.out.println("ID: "+ id);
        System.out.println("Name: "+ name);
        System.out.println("Address: "+ address);
        System.out.println("Age: "+ age);
        System.out.println("GPA: "+ gpa);
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
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
