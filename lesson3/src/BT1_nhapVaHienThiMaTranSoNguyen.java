import java.util.Scanner;

public class BT1_nhapVaHienThiMaTranSoNguyen {
    public static void main(String[] args) {
        nhap();
        tongHangCot();
        maxmin();
    }
    static int nmax = 10;
    static int [][] a = new int[nmax][nmax];
    static int n ;
    static Scanner sc = new Scanner(System.in);
   public static void nhap(){
       System.out.print("nhap kich thuoc ma tra vuong nxn : ");
       n =sc.nextInt();
       a = new int[n][n];
       for(int i=0; i<n; i++){
           for(int j=0; j<n; j++){
               System.out.print("nhap phan tu a["+i+"]["+j+"] : ");
               a[i][j] = sc.nextInt();
           }
       }
       System.out.println("Ma tran la: ");
       for(int i=0; i<n; i++){
           for(int j=0; j<n; j++){
               System.out.print(a[i][j]+" ");
           }
           System.out.println();
       }
   }
   public static void tongHangCot(){
       for(int i=0; i<n; i++){
           int tonghang = 0;
           for(int j=0; j<n; j++){
               tonghang += a[i][j];

           }
           System.out.println(" tong hang thu " + i + " la : " + tonghang);
       }
       for(int j=0; j<n; j++){
           int tongCot = 0;
           for(int i=0; i<n; i++){
               tongCot += a[i][j];
           }
           System.out.println(" tong cot thu " + j + " la : " + tongCot);
       }
   }
   public static  void maxmin (){
       int max = a[0][0];
       int min = a[0][0];
          for(int i=0; i<n; i++){
              for(int j=0; j<n; j++){
                  if(a[i][j]>max){
                      max = a[i][j];
                  }
                  if(a[i][j]<min){
                      min = a[i][j];
                  }
              }
          }
       System.out.println("max la : " + max + " \nmin la : " + min);

    }
}
