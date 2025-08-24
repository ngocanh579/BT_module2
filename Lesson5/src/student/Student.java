package student;

public class Student {
    private String name;
    private int id;
    private static int nextID=1000;
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public static int getNextID() {
        return nextID;
    }

    public static void setNextID(int nextID) {
        Student.nextID = nextID;
    }
    public Student(String name){
        this.name = name;
        this.id = nextID;
        nextID ++;
    }

    void display(){
        System.out.println("Name: " +name);
        System.out.println("ID: " + id);;
    }
}
