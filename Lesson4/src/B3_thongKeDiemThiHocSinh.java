import java.util.ArrayList;
import java.util.Scanner;

public class B3_thongKeDiemThiHocSinh {
    private String name ;
    private int grade ;
    private double diem;
    static Scanner sc = new Scanner(System.in);
    static int n;
    static ArrayList<B3_thongKeDiemThiHocSinh> ds = new ArrayList<>();

    public B3_thongKeDiemThiHocSinh(String name,  int grade,double diem) {
        this.name = name;
        this.grade = grade;
        this.diem = diem;
    }
    public B3_thongKeDiemThiHocSinh(){}
    public  void nhap(){
        System.out.print("nhap ten hoc sinh: ");
        this.name =sc.nextLine();
        System.out.print("nhap lop hoc sinh: ");
        this.grade =Integer.parseInt(sc.nextLine());
        System.out.print("nhap diem hoc sinh: ");
        this.diem = Double.parseDouble(sc.nextLine());

    }
    public void displayInfo(){
        System.out.println(" ten hoc sinh : " + this.name);
        System.out.println(" lop hoc sinh : " + this.grade);
        System.out.println(" diem hoc sinh : " + this.diem);
    }
    public static void indiem(double diemnhap){
        System.out.print("Danh sach sinh vien co diem > 8.0 la : " + diemnhap);
        for (B3_thongKeDiemThiHocSinh sv : ds){
            if(sv.diem >= diemnhap){
                System.out.println(" ");
                sv.displayInfo();
            }
        }
    }
    public static void dem(){
        int yeu = 0;
        int khaHoacGioi =0 ;
        int tb = 0;
        for (B3_thongKeDiemThiHocSinh sv : ds){
            if(sv.diem > 7.0){
                khaHoacGioi++;
            } else if(sv.diem > 5.0 && sv.diem < 7.0){
                tb++;
            }
            else{
                yeu++;
            }
        }
        System.out.println();
        System.out.print("Sinh vien yeu : " + yeu +"\n");
        System.out.print("Sinh vien sinh vien kha hoac gioi : " + khaHoacGioi +"\n");
        System.out.print("Sinh vien sinh vien tb : " + tb + "\n");
        System.out.println();

    }
    public static void main(String[] args) {
        System.out.print("nhap so luong hoc sinh : ");
         n = Integer.parseInt(sc.nextLine());
         for(int i=0; i<n; i++){
             B3_thongKeDiemThiHocSinh s = new B3_thongKeDiemThiHocSinh();
             System.out.println("sinh vien thu " + (i+1) + " : ");
             s.nhap();
             ds.add(s);
             System.out.println();
         }
        System.out.println("danh sach sinh vien la :");
         for(B3_thongKeDiemThiHocSinh sv : ds){
             sv.displayInfo();
             System.out.println(" ");
         }
        indiem(8.0);
         dem();
    }
}
