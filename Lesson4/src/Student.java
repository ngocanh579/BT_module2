public class Student {
    private String name ;
    private int age ;
    private String grade ;

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

}
