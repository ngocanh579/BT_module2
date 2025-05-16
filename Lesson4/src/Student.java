public class Student {
    public String name ;
    public int age ;
    public String grade ;
    public Student(String name, int age, String grade) {
        this.name = name;
        this.age = age;
        this.grade = grade;
    }
    public void displayInfo(){
        System.out.println(" my name is : " + this.name);
        System.out.println(" my age is : " + this.age);
        System.out.println(" my grade is : " + this.grade);
    }
    public static void main(String[] args) {
        Student s = new Student("ngoc anh",24,"16");
        s.displayInfo();
    }
}
