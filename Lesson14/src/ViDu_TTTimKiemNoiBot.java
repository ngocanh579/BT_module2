public class ViDu_TTTimKiemNoiBot {
    public static void main(String[] args) {
        int[] a = {2, 9, 5, 4, 8, 1};
        System.out.println("Mảng ban đầu là: ");
        inMang(a);
        TimKiemNoiBot(a);
        System.out.println("Mảng sau khi sắp xếp là: ");
        inMang(a);
    }

    public static void inMang(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + (i < array.length - 1 ? ", " : ""));
        }
        System.out.println();
    }

    public static void TimKiemNoiBot(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = array.length - 1; j > i; j--) {
                if (array[j] < array[j - 1]) {
                    // Hoán đổi
                    int temp = array[j];
                    array[j] = array[j - 1];
                    array[j - 1] = temp;
                }
            }
        }
    }
}

