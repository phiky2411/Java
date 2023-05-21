
package BTVNb3;


public class RunMainb2 {
    public static void main(String[] args) {
        CanBo canBo = new CanBo();
        canBo.nhap();
        System.out.println("Thong tin vua nhap la:");
        System.out.println("Luong thuc nhan la:"+ canBo.TinhLuong());
        canBo.xuat();
    }
    
}
