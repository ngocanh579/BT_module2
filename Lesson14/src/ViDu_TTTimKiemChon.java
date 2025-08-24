public class ViDu_TTTimKiemChon {
    public static void main(String[] args) {
        int[] a = {2, 9, 5, 4, 8, 1, 6};
        System.out.println("Mảng ban đầu là: ");
        inMang(a);
        TimKiemChon(a);
        System.out.println("Mảng sau khi sắp xếp là: ");
        inMang(a);
    }

    public static void inMang(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + (i < array.length - 1 ? ", " : ""));
        }
        System.out.println();
    }

    public static void TimKiemChon(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < array[minIndex]) {
                    minIndex = j;
                }
            }
            // Hoán đổi phần tử nhỏ nhất với phần tử đầu tiên trong phần chưa sắp xếp
            if (minIndex != i) {
                int temp = array[i];
                array[i] = array[minIndex];
                array[minIndex] = temp;
            }
            // Hiển thị mảng sau mỗi lần hoán đổi
            System.out.print("Lần " + (i + 1) + ": ");
            inMang(array);
        }
    }
}
