public class Main {
    public static void main(String[] args) {
        Browser browser = new Browser("home.com");

        browser.printCurrentPage();     // home.com

        browser.visit("google.com");
        browser.visit("facebook.com");
        browser.visit("youtube.com");

        browser.back();                // Trở về facebook.com
        browser.back();                // Trở về google.com
        browser.forward();             // Tiến tới facebook.com
        browser.visit("github.com");   // Truy cập trang mới -> xóa forwardStack

        browser.back();                // Trở về facebook.com
        browser.printCurrentPage();    // facebook.com
    }
}
