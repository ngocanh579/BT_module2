import java.util.Scanner;

public class PTB2 {
    static Scanner sc = new Scanner(System.in);
    public double getA() {
        return a;
    }
    public void setA(double a) {
        this.a = a;
    }
    public double getB() {
        return b;
    }
    public void setB(double b) {
        this.b = b;
    }
    public double getC() {
        return c;
    }
    public void setC(double c) {
        this.c = c;
    }
    public double a;
    public double b;
    public double c;

    public double getDelta() {
        return delta;
    }

    public void setDelta(double delta) {
        this.delta = delta;
    }

    public double delta;
    public PTB2(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    public PTB2(){}
    public double  getDiscriminant(){
        double delta = b*b - 4*a*c;
        return delta;
    }
    public double getRoot1(){
        return (-b + Math.sqrt(getDiscriminant()))/(2*a);
    }
    public double getRoot2(){
        return (-b - Math.sqrt(getDiscriminant()))/(2*a);
    }
    public double x(){
        return (-b /(2*a));
    }
    public void nhap(){
        System.out.print("nhap a: ");
        a = Double.parseDouble(sc.nextLine());
        System.out.print("nhap b: ");
        b = Double.parseDouble(sc.nextLine());
        System.out.print("nhap c: ");
        c = Double.parseDouble(sc.nextLine());
    }
    public void in(){
        System.out.println("a = " + a + "\nb = " + b + "\nc = " + c);
    }

    public void inDelta(){
        if(getDiscriminant() < 0) System.out.println("phuong trinh vo nghiem");
        else if (getDiscriminant() == 0) System.out.println("phuong trinh co nghiem duy nhat: "+ x());
        else
            System.out.println("phuong trinh co 2 nghiem phan biet x1 = "+ getRoot1() + ", x2 = " + getRoot2());
    }
}
