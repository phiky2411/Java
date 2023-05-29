
package DemoArrayList;

import java.util.Scanner;


public class Person {
    private String name;
    private int age;
    Scanner sc = new Scanner(System.in);
    
    public void input(){
        System.out.println("Nhap ten:");
        name = sc.nextLine();
        System.out.println("Nhap tuoi:");
        age = sc.nextInt();
    }

    @Override
    public String toString() {
        return "Person{" + "age=" + age + ", name=" + name + '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
  
    
}
