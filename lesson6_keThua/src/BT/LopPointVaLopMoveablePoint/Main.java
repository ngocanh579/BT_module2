package BT.LopPointVaLopMoveablePoint;

public class Main {
    public static void main(String[] args) {
        Point point = new Point(2.5f, 3.5f);
        System.out.println(point);

        MoveablePoint moveablePoint = new MoveablePoint(1.0f, 1.0f, 0.5f, 0.5f);
        System.out.println("Before move: " + moveablePoint);
        moveablePoint.move();
        System.out.println("After move: " + moveablePoint);
    }
}
