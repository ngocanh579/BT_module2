import java.util.Stack;

public class Browser {
    private Stack<String> backStack = new Stack<>();
    private Stack<String> forwardStack = new Stack<>();
    private String currentPage;

    public Browser(String homepage) {
        this.currentPage = homepage;
    }

    public void visit(String url) {
        if (currentPage != null) {
            backStack.push(currentPage);
        }
        currentPage = url;
        forwardStack.clear();
        System.out.println("Đã truy cập: " + currentPage);
    }

    public void back() {
        if (backStack.isEmpty()) {
            System.out.println("Không thể quay lại. Đang ở trang đầu tiên.");
            return;
        }
        forwardStack.push(currentPage);
        currentPage = backStack.pop();
        System.out.println("Đã quay lại: " + currentPage);
    }

    public void forward() {
        if (forwardStack.isEmpty()) {
            System.out.println("Không thể tiến tới. Không có trang tiếp theo.");
            return;
        }
        backStack.push(currentPage);
        currentPage = forwardStack.pop();
        System.out.println("Đã tiến tới: " + currentPage);
    }

    public void printCurrentPage() {
        System.out.println("Trang hiện tại: " + currentPage);
    }
}
