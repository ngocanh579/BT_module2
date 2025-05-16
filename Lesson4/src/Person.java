public class Person {
    public String name ;// khai bao thuoc tinh
    public int age;// dùng public , bên ngoài được truy cập age
    // ham tao : gọi lần đầu tiên khi thực thi
    // ham khoi tao co tham so
    public Person (String name, int age){
        // phươn thức khởi tạo được thực thi 1 lần ngay khi khởi động tạo đối tượng
        System.out.println("lop person da duoc khoi tao .");
        this.name = name;// gan gia tri cho thuoc tinh
        this.age = age;
    }
    // ham khoi tao khong tham si
    public Person (){}
    public void sayHello(){
        System.out.println("Hello, my name is " + this.name);
        // co 2 cach
        // dùng trức tiếp thuộc tính
        // dùng this (ưu tiên)
    }
}
 class Program{
    // main duoc goi dau tien
    public static void main(String[] args) {
        Person p = new Person("ngoc anh",24);// p là biến tham chiều đến đối tượng kiểu Person
        p.sayHello();
        Person hoa = new Person();
        hoa.sayHello();
    }
}
