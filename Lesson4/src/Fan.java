public class Fan{
    public static final int slow = 1;
    public static final int medium = 2;
    public static final int fast = 3;

    public int speed ;
    public boolean on ;
    public int getSpeed() {
        return speed;
    }
    public void setSpeed(int speed) {
        this.speed = speed;
    }
    public boolean isOn() {
        return on;
    }
    public void setOn(boolean on) {
        this.on = on;
    }
    public double getRadius() {
        return radius;
    }
    public void setRadius(double radius) {
        this.radius = radius;
    }
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }
    private double radius;
    private String color;

    Fan(){}
    public String toString(){
        if(on)
            return "Fan is on with speed: " + speed + " and color: " + color +" and radius: " +radius;
        else
            return "Fan is off";
    }
}
