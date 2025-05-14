import java.util.Scanner;

public class TH_hienThiLoiChao {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("nhập tên : ");
        String name = sc.nextLine();
        // System.out.println("Xin chào :" + name);
        System.out.printf("Xin chao ,%S\n", name);
        do {
            System.out.print("Mời nhập lại tên : ");
            name = sc.nextLine();
            if (!name.equals("q")) {
                System.out.printf("Xin chao ,%S\n", name);
            } else {
                System.out.println("Tạm biệt");
            }
        } while (!name.equals("q"));

    }
}
