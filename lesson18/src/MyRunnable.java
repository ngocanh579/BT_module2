//Tạo Thread bằng thực thi Runnable
class MyRunnable implements Runnable {
    public void run() {
        System.out.println("Hello from MyRunnable!");
    }

    public static void main(String[] args) {
        Thread thread = new Thread(new MyRunnable());
        thread.start();
    }
}
