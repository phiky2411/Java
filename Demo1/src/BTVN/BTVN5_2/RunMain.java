
package BTVN.BTVN5_2;

public class RunMain {
    public static void main(String[] args) {
        SoPhuc p1 = new SoPhuc();
        SoPhuc p2 = new SoPhuc();
        System.out.println("Nhap so phuc 1:");
        p1.nhap();
        System.out.println("Nhap so phuc 2:");
        p2.nhap();
        System.out.println("Hai so phuc vua nhap la: ");
        p1.xuat();
        p2.xuat();
        System.out.println("Tong hai so phuc la: ");
        SoPhuc sum;
        sum = p1.Cong(p2);
        sum.xuat();
        System.out.println("Hieu hai so phuc la: ");
        SoPhuc tru;
        tru = p1.Tru(p2);
        tru.xuat();
    }
}
