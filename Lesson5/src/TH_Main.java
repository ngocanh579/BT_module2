import java.util.Scanner;

public class TH_Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       int n;
       do{
           System.out.println("---------Menu----------");
           System.out.println("1. Access modifier ");
           System.out.println("2. static method ");
           System.out.println("3. Static Property");
           System.out.println("4. Xây dựng lớp chỉ ghi trong Java");
           System.out.println("0. Thoat");
           System.out.print("nhap lua chon n: ");
           n = Integer.parseInt(sc.nextLine());
           switch (n){
               case 1:
                   System.out.println("----------------Access modifier--------------");
                   Circle c = new Circle();
                   System.out.print("Radius: "+c.getRadius());
                   System.out.println("Area: "+c.getArea());

                   System.out.print("thay doi access modifier cho Radius va Area ");
                   c.setRadius(10);
                   System.out.print("Radius: "+c.getRadius());
                   System.out.print("Area: "+c.getArea());
                   System.out.println("------------------------------------------------");
                   System.out.println();
                   break;
               case 2:
                   System.out.println("----------------static method--------------");
                   Student.changeCollege();
                   Student s1 = new Student(111,"Hoang");
                   Student s2 = new Student(112,"Hien");
                   Student s3 = new Student(113,"Dao");
                   s1.displayInfo();
                   s2.displayInfo();
                   s3.displayInfo();
                   System.out.println("------------------------------------------------");
                   System.out.println();
                   break;
               case 3:
                   System.out.println("----------------Static Property--------------");
                   Car c1 = new Car("Mazda 3","Skyactiv 3");
                   System.out.println(Car.numberOfCars);
                   c1.displayInfo();
                   Car c2 = new Car("Mazda 6","Skyactiv 6");
                   System.out.println(Car.numberOfCars);
                   c2.displayInfo();
                   System.out.println("------------------------------------------------");
                   System.out.println();
                   break;
               case 4:
                   System.out.println("-------------Xây dựng lớp chỉ ghi trong Java----------");
                   Student_xdlcgtJAVA st = new Student_xdlcgtJAVA();
                   st.setName("hoa");
                   st.setClasses("C102");
                   st.displayInfo();
                   System.out.println("------------------------------------------------");
                   System.out.println();
                   break;
               case 0:
                   System.out.println("thoat");
                   break;
               default:
                   System.out.println("chuc nang khong ton tai");
           }
       }while(n!=0);
    }
}
