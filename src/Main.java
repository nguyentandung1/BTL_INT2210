import java.util.Scanner;

public class Main {
//    public void printF(){
//        System.out.println("F");
//        printF();
//    }

    public static int GiaiThua(int n){
        //Bai toan co so
        if(n==0)  return 1;
        //Cong thuc quy nap
        int t = n * GiaiThua(n-1);
        return t;

    }
//    public static int UCLN(int a, int b){
//
//        if(a==b)  return a;
//        else {
//            if(a>b){
//                a = a - b;
//            }
//            else {
//                b = b - a;
//            }
//        }
//
//        return UCLN(a,b);
//    }

    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
////        int n = input.nextInt();
//        int a = input.nextInt();
//        int b = input.nextInt();
//        System.out.println(UCLN(a,b));
        int n=10;
        System.out.println(GiaiThua(n));
    }
}