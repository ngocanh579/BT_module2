import java.util.Scanner;

public class demo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
// phải khai báo số lượng phần tử
        int[] a = {1,2,3,4,5};
//        for (int i = 0; i < a.length; i++) {
//            if(a[i]%2!=0){
//                System.out.println("phan tu chua so le o vi tri "+ i + " la: "+ a[i]);
//            }
//        }
        // foreach
        for(int x : a){
            if(x%2!=0){
                System.out.println("phan tu chua so le o vi tri "+ x + " la: "+ x);
            }
        }
    }
}
