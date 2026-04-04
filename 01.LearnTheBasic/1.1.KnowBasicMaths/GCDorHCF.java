import java.util.Scanner;

public class GCDorHCF {
    public static int findGCD(int a, int b){
        while(b!=0){
            int temp = b;
            b = a% b;
            a = temp;
        }

        return Math.abs(a);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter first number:");
        int n1 = sc.nextInt();

        System.out.println("Enter second number:");
        int n2 = sc.nextInt();

        sc.close();;
 
        int GCD = findGCD(n1,n2);
        System.out.println("GCD  of " +n1 +" and "+ n2 + " : " + GCD);
    }
}
