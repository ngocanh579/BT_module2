public class Car {
    private String name;

    public String getEngine() {
        return engine;
    }

    public void setEngine(String engine) {
        this.engine = engine;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static int getNumberOfCars() {
        return numberOfCars;
    }

    public static void setNumberOfCars(int numberOfCars) {
        Car.numberOfCars = numberOfCars;
    }

    private String engine;
    public static int numberOfCars;
    public Car(String name, String engine){
        this.name = name;
        this.engine = engine;
        numberOfCars++;
    }
    public Car(){}
    public void displayInfo(){
        System.out.println("Name: " + this.name);
        System.out.println("Engine: " + this.engine);
    }
}
