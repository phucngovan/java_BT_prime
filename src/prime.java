import java.util.Scanner;

public class prime {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int x;
        System.out.println("nhập x:");
        x=sc.nextInt();
        if(isPrimeNumber(x)) {
            System.out.println(x+" :là số nguyên tố");
        }else {
            System.out.println(x +":không phải là số nguyên tố");
        }
    }
    public static boolean isPrimeNumber(int n) {
        if(n<2){
            return false;
        }
        int squareRoot= (int) Math.sqrt(n);
        for (int i=2;i<=squareRoot;i++) {
            if(n%i==0) {
                return false;
            }
        }return true;

    }
}
