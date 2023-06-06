package BTVN.BTVN5_4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class RunMain {

    public static void main(String[] args) {

        int choice;
        List<Student> students = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("===MENU===");
            System.out.println("1.Add student:");
            System.out.println("2.Edit student by ID:");
            System.out.println("3.Delete student by ID:");
            System.out.println("4.Sort student by GPA:");
            System.out.println("5.Sort student by name:");
            System.out.println("6.Show student:");
            System.out.println("0.Exit");
            System.out.println("Your choice:");
            choice = sc.nextInt();
            switch (choice) {
                case 0:
                    System.out.println("===THANK YOU===");
                    break;
                case 1:
                    Student a = new Student();
                    a.input();
                    students.add(a);
                    break;
                case 2:
                    System.out.println("Edit student by ID:");
                    String idEdit = sc.nextLine();
                    for (int i = 0; i < students.size(); i++) {
                        if (idEdit.equals(students.get(i).getId())) {
                            Student k = new Student();
                            System.out.println("ID edit:");
                            k.input();
                            students.remove(i);
                            students.add(i, k);
                        }
                    }
                    break;
                case 3:
                    System.out.println("Enter ID need to delete: ");
                    String idCheck = sc.nextLine();
                    for (int i = 0; i < students.size(); i++) {
                        if (idCheck.equals(students.get(i).getId())) {
                            students.remove(i);
                        }
                    }
                    System.out.println("DELETE");
                    break;
                case 4:
                    Collections.sort(students, new Comparator<Student>() {
                        @Override
                        public int compare(Student o1, Student o2) {
                            if (o1.getGpa() > o2.getGpa()) {
                                return 1;
                            }
                            return -1;
                        }
                    }
                    );

                    System.out.println("SORT BY GPA ALREADY");
                    break;
                case 5:
                    Collections.sort(students, new Comparator<Student>() {
                        @Override
                        public int compare(Student o1, Student o2) {
                            return -o1.getName().compareTo(o2.getName());
                        }
                    }
                    );
                    break;
                case 6:
                    System.out.println("===SHOW STUDENT===");
                    for (Student sv : students) {
                        sv.output();

                    }
                    break;

                default:
                    System.out.println("Chon sai");

            }

        } while (choice != 0);
    }
}
