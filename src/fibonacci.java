public class fibonacci {
    public static int F(int n) {
    System.out.println("Tinh: F["+n+"]");
    if (n == 0) return 0;
    if (n == 1) return 1;
    return F(n-1) + F(n-2);}

    static int[] F = new int[1000];

    public static int F2(int n) {
        if(F[n] != 0)  return F[n];
        System.out.println("Tinh: F["+n+"]");
        if (n <= 2) {
            F[1] = 1;
            F[2] = 1;
            return 1;
        }

        F[n] = F2(n-1) + F2(n-2);
       return F[n];
    }

    public static void main(String[] args) {
        System.out.println(F2(10));
    }

}
