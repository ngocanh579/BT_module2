public class Main {
    public static void main(String[] args) {
        Student s = new Student("ngoc anh",24,"16");
        s.displayInfo();

        System.out.println("-------------------------");

        Rectangle r = new Rectangle(10, 20);
        r.display();
        System.out.println("Area: " + r.getArea());
        System.out.println("Perimeter: " + r.getPerimeter());
    }
}
