package BTVN.BTVN5_4;

import java.util.ArrayList;
import java.util.Scanner;

public class RunMain {

    public static void main(String[] args) {

        int n, choice;
        ArrayList<Student> s = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("----------------------\n"
                    + "1.Add student\t"
                    + "2.Edit student by id\t"
                    + "3.Delete student by id\t"
                    + "4.Sort students by gpa\t"
                    + "5.Sort students by name\t"
                    + "6.Show students\t"
                    + "0.Exit\n"
                    + "----------------------\n"
                    + "Your choice: ");
            choice = sc.nextInt();
            switch (choice) {
                case 0:
                    System.out.println("WELCOME");
                    break;
                case 1:
                    System.out.println("HOW MANY STD: ");
                    n = sc.nextInt();
                    for (int i = 0; i < n; i++) {
                        Student k = new Student();
                        System.out.println("== ENTER THE " + (i + 1) + "th Student ==");
                        k.input();
                        s.add(k);
                    }
                    System.out.println("DONE");
                    break;
                case 2:
                    sc.nextLine();
                    int d = 0;
                    System.out.println("Enter ID need to Edit: ");
                    String idEdit = sc.nextLine();
                    for (int i = 0; i < s.size(); i++) {
                        if (idEdit.equals(s.get(i).getId())) {
                            Student k = new Student();
                            System.out.println("=====INFORMATION=====");
                            k.input();
                            s.remove(i);
                            s.add(i, k);
                            d++;
                        }
                    }
                    if (d == 0) {
                        System.out.println("ID WAS NOT FOUND");
                    } else {
                        System.out.println("ALREADY EDIT");
                    }
                    break;
                case 3:
                    sc.nextLine();
                    System.out.println("Enter ID need to delete: ");
                    String idCheck = sc.nextLine();
                    for (int i = 0; i < s.size(); i++) {
                        if (idCheck.equalsIgnoreCase(s.get(i).getId())) {
                            s.remove(i);
                        }
                    }
                    System.out.println("DELETE");
                    break;
                case 4:
                    for (int i = 0; i < s.size(); i++) {
                        for (int j = i + 1; j < s.size(); j++) {
                            if (s.get(i).getGpa() > s.get(j).getGpa()) {
                                Student temp = s.get(i);
                                s.set(i, s.get(j));
                                s.set(j, temp);
                            }
                        }
                    }
                    System.out.println("SORT BY GPA ALREADY");
                    break;
                case 5:
                    for (int i = 0; i < s.size(); i++) {
                        for (int j = i + 1; j < s.size(); j++) {
                            if (s.get(i).getName().compareToIgnoreCase(s.get(j).getName()) > 0) {
                                Student temp = s.get(i);
                                s.set(i, s.get(j));
                                s.set(j, temp);
                            }
                        }
                    }
                    System.out.println("SORT BY NAME ALREADY");
                    break;
                case 6:
                    System.out.println("===SHOW STUDENT===");
                    for (Student a : s) {
                        a.output();
                    }
            }
            break;

        } while (choice != 0);
    }
}
