public class Student_xdlcgtJAVA {
    private String name = "John";

    public String getClasses() {
        return classes;
    }

    public void setClasses(String classes) {
        this.classes = classes;
    }

    public String getName() {
        return name;
    }
    // thay đổi public thành private -> báo lỗi vì private chỉ dùng trong chinh lop Studen_...
    // khong dùng ngoài lớp Student_... được
    //thay đổi public thành protected : chỉ các lớp con kế thừa và cùng packeage truy cập
    // public : ch0 phép truy cập : cùng class , cùng package , kế thừa (# package) ,# package(k kế thừa)
    // default :ch0 phép truy cập : cùng class , cùng package
    //protected : ch0 phép truy cập : cùng class , cùng package , kế thừa (# package)
    // private :ch0 phép truy cập : cùng class
    public void setName(String name) {
        this.name = name;
    }

    private  String classes ="C02";
    public Student_xdlcgtJAVA(String name, String classes){
        this.name = name;
        this.classes = classes;
    }
    public Student_xdlcgtJAVA(){}
    public void displayInfo(){
        System.out.println("Name: " + this.name);
        System.out.println("Class: " + this.classes);
    }
}
