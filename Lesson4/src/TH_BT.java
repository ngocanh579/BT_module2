import java.util.Scanner;

public class TH_BT {

    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int luachon;
        do{
            System.out.println("------------Menu--------------");
            System.out.println("1. phuong trinh bac 2");
            System.out.println("2. Xay dung lop StopWatch");
            System.out.println("3. Xay dung lop Fan");
            System.out.println("0. thoat");
            System.out.print("nhap lua chon: ");
             luachon = Integer.parseInt(sc.nextLine());
            switch(luachon){
                case 1:
                    System.out.println("chuc nang phuong trinh bac 2");
                    PTB2 p = new PTB2();
                    p.nhap();
                    p.in();
                    p.inDelta();
                    break;
                case 2:
                    System.out.println("chuc nang xay dung lop StopWatch");
                    StopWatch sw = new StopWatch();
                    sw.start();
                    try {
                        Thread.sleep(2000); // giả lập trôi qua 2 giây
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    sw.stop();
                    System.out.println("thoi gian da troi qua: " + sw.getElapsedTime() + " ms");
                    break;
                case 3:
                    System.out.println("chuc nang xay dung lop Fan");
                    Fan f1 = new Fan();
                    f1.setSpeed(Fan.fast);
                    f1.setRadius(10);
                    f1.setColor("yellow");
                    f1.setOn( true);

                    Fan f2 = new Fan();
                    f2.setSpeed(Fan.medium);
                    f2.setRadius(5);
                    f2.setColor("blue");
                    f2.setOn(false);
                    System.out.println("F1 : " + f1);
                    System.out.println("f2 : " + f2);

                    break;

                case 0:
                    System.out.println("chao tac man hinh");
                    break;
                default:
                    System.out.println("chuc nang khong ton tai");
            }
        }
        while(luachon!=0);
    }
}
