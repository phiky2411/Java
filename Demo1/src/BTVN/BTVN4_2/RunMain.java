package BTVN.BTVN4_2;

import java.util.Scanner;

public class RunMain {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n;
        System.out.println("Number of student:");
        n = sc.nextInt();
        Student[] students = new Student[n];
        
        for (int i = 0; i < n; i++) {
            students[i] = new Student();
            students[i].input();
            System.out.println("=========");
        }
        System.out.println("Information of student:");
        
        for (int i = 0; i < n; i++) {
            students[i].output();
        }
        
        for (int i = 0; i < n; i++) {
            if (students[i].getScore() > 8) {
                System.out.println("Student have score > 8:");
                students[i].output();
            }
        }

        float score_max = students[0].getScore();
        int index = 0;
        for (int i = 0; i < n; i++) {
            if (students[i].getScore() > score_max) {
                score_max = students[i].getScore();
                index = i;
            }
        }
        System.out.println("Student have highest score:");
        students[index].output();
    }

}
