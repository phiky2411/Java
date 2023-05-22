package BTVN.BTVN4_2;

import BTVN.BTVN4_2.Faculty;

import java.util.Scanner;

public class Student {

    private Faculty y = new Faculty();
    private String classes;
    private float score;
    Scanner sc = new Scanner(System.in);

    public void input() {
        System.out.println("Faculty:");
        y.inputFaculty();
        System.out.println("Class:");
        classes = sc.nextLine();

        System.out.println("Score:");
        score = sc.nextFloat();
    }

    public void output() {
        System.out.println("Faculty: ");
        y.outputFaculty();
        System.out.println("Class: " + classes);
        System.out.println("Score: " + score);
    }

    public float getScore() {
        return score;
    }

    public void setScore(float score) {
        this.score = score;
    }

}
