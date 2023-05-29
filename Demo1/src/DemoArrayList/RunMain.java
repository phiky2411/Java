
package DemoArrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class RunMain {
    public static void main(String[] args) {
        List<Person> persons = new ArrayList<>();
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap so luong person:");
        n = sc.nextInt();

        for(int i = 0; i < n; i++){
            Person per = new Person();
            System.out.println("Nhap thong tin person thu "+ (i+1));
            per.input();
            persons.add(per);
        }
        
        Collections.sort(persons, new Comparator<Person>(){
            @Override
            public int compare(Person o1, Person o2) {
                return -o1.getName().compareTo(o2.getName());
            }  
        });
        
        for(Person p: persons){
            System.out.println(p);
        }
    }
    
}
