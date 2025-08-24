public class ViDu_TTTimKiem_SapXepChen {
    public static void main(String[] args) {
        int[] a = {2, 9, 5, 4, 8, 1};
        System.out.println("Mảng ban đầu là: ");
        inMang(a);
        sapXepChen(a);
        System.out.println("Mảng sau khi sắp xếp là: ");
        inMang(a);
    }

    // Phương thức in mảng
    public static void inMang(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + (i < array.length - 1 ? ", " : ""));
        }
        System.out.println();
    }

    // Phương thức sắp xếp chèn
    public static void sapXepChen(int[] array) {
        // Duyệt qua từng phần tử trong mảng bắt đầu từ phần tử thứ hai
        for (int i = 1; i < array.length; i++) {
            int key = array[i]; // Lưu giá trị của phần tử hiện tại
            int j = i - 1; // Chỉ số của phần tử trước đó

            // Di chuyển các phần tử lớn hơn key sang bên phải
            while (j >= 0 && array[j] > key) {
                array[j + 1] = array[j]; // Di chuyển phần tử sang phải
                j--; // Giảm chỉ số j
            }
            // Chèn key vào vị trí đúng
            array[j + 1] = key;

            // Hiển thị mảng sau mỗi lần chèn
            System.out.print("Sau khi chèn phần tử " + key + ": ");
            inMang(array);
        }
    }
}
