public class Student {
    private int rollno;
    private String name;
    private static String college = "BBDIT";
    public Student(int rollno, String name) {
        this.rollno = rollno;
        this.name = name;
    }
    static void changeCollege(){
        college = "CODEGYM";
    }
    public void displayInfo(){
        System.out.println("Roll no: " + this.rollno);
        System.out.println("Name: " + this.name);
        System.out.println("College: " + college);
    }
}
