import java.util.Scanner;

public class soDuong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int so ;

        do{
            System.out.println("nhap so duong( >0) : ");
            so = sc.nextInt();
            if(so <=0) System.out.println("Sai! vui long nhap lai.");
        }
        while(so <= 0);
        System.out.println("nhap lai so duong(> 0) : " + so);


        // while : kiem tra dieu kien truoc -> thuc thi
        // do-while : thuc thi truoc -> kiem tra dieu kien
    }
}
