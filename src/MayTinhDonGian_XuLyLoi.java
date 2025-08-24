import java.util.InputMismatchException;
import java.util.Scanner;

public class MayTinhDonGian_XuLyLoi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);// nhập dl người dùng

        try{
            System.out.print("nhap so thu nhat: ");
            int num1=sc.nextInt();
            System.out.print("nhap so thu hai: ");
            int num2=sc.nextInt();
            System.out.print("nhap phep toan (+, -, *, /): ");
            char operator = sc.next().charAt(0);//charAt(0):lấy ký tự đầu tiên trong 1 chuỗi(String), 0:chỉ số ký tự muốn lấy
            int result;
            switch (operator) {//dùng để thực hiện các phép toán
                case '+':
                    result = num1 + num2;
                    System.out.println("ket qua: " + result);
                    break;
                case '-':
                    result = num1 - num2;
                    System.out.println("ket qua: " + result);
                    break;

                case '*':
                    result = num1 * num2;
                    System.out.println("ket qua: " + result);
                    break;
                case '/':
                    if(num2 == 0) {
                        throw new ArithmeticException("Loi ! khong the chia cho 0. ");
                    }
                    result = num1 / num2;
                    System.out.println("ket qua: " + result);
                    break;
                default:
                    System.out.println("phep toan khong hop le!");
                    break;
            }
        }
        catch (InputMismatchException e){//bắt lỗi khi nhập sai kiểu dl int
            System.out.println(" loi ! vui long nhap so nguyen ");
        }catch (ArithmeticException e){// bắt lỗi khi người dùng cố chia cho 0
            System.out.println(e.getMessage());
        }finally {// đảm bảo tb luôn được in ra
            System.out.println("Chuong trinh ket thuc");
            sc.close();// đóng chương trình
        }
    }
}
