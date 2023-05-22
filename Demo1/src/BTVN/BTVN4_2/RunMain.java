package BTVN.BTVN4_2;

import java.util.Scanner;

public class RunMain {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n;
        System.out.println("Number of student:");
        n = sc.nextInt();
        Student[] Students = new Student[n];
        for (int i = 0; i < n; i++) {
            Students[i] = new Student();
            Students[i].input();
            System.out.println("=========");
        }
        System.out.println("Information of student:");
        for (int i = 0; i < n; i++) {
            Students[i].output();
        }
        int score;
        for(int i = 0; i < n; i++){
            if (Students[i].getScore() > 8){
                System.out.println("Student have score > 8:");
                Students[i].output();
            }
        }
        System.out.println("");
           
        float score_max = Students[0].getScore();
        int index = 0;
        for (int i = 0; i < n; i++){
            if (Students[i].getScore() > score_max){
            score_max = Students[i].getScore();
            index = i;
            }
        }
        System.out.println("Student have highest score:");
        Students[index].output();
    }
            
}
