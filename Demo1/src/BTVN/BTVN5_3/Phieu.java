package BTVN.BTVN5_3;

import java.util.ArrayList;
import java.util.Scanner;

public class Phieu {

    private int maPhieu;
    private String tenPhieu;
    Scanner sc = new Scanner(System.in);
    DateTime a = new DateTime();
    ArrayList<SanPham> x = new ArrayList<>();
    int n;
    long sum = 0;

    public void inputPhieu() {
        System.out.println("Enter ticket code:");
        maPhieu = sc.nextInt();
        sc.nextLine();
        System.out.println("Enter ticket name:");
        tenPhieu = sc.nextLine();
        System.out.println("Enter DateTime:");
        a.inputDate();
        System.out.println("Enter Product number:");
        n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            SanPham p = new SanPham();
            System.out.println("Enter product number " + (i + 1));
            p.inputSP();
            sum += p.getDonGia() * p.getSoLuong();
            x.add(p);
        }
    }

    public void outputPhieu() {
        System.out.println("======TICKET" + tenPhieu + "=======");
        System.out.println("TICKET CODE: " + maPhieu);
        System.out.println("DATETIME: ");
        a.outputDate();
        System.out.println("BILL: ");
        for (SanPham sp : x) {
            sp.outputSP();
        }
        System.out.println("TOTAL PRICE: " + sum);
    }
}
