import java.lang.Thread; // Có thể thêm vào cho chắc chắn
class MyThread extends Thread {
    public void run() {
        System.out.println("Hello from MyThread!");
    }

    public static void main(String[] args) {
        MyThread t = new MyThread();
        t.start();
    }
}
