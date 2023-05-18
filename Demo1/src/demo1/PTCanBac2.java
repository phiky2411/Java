package demo1;

import java.util.Scanner;

public class PTCanBac2 {

    public static void main(String[] args) {
        double a, b, c, x1, x2, delta;
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap he so bac 2, a=");
        a = sc.nextDouble();
        System.out.println("Nhap he so bac 2, b=");
        b = sc.nextDouble();
        System.out.println("Nhap he so bac 2, c=");
        c = sc.nextDouble();

        delta = Math.pow(b, 2) - 4 * a * c;
        if (delta < 0) {
            System.out.println("Phuong trinh vo nghiem");
        } else if (delta == 0) {
            x1 = -b / 2 * a;
            System.out.println("Phuong trinh co nghiem kep x1=x2=" + x1);

        }else if (delta > 0) {
            x1 = (-b + Math.sqrt(delta)) / (2 * a);
            x2 = (-b - Math.sqrt(delta)) / (2 * a);
            System.out.println("Phuong trinh co 2 nghiem:");
            System.out.println("x1=" + x1);
            System.out.println("x2=" + x2);

        }

    }

}
