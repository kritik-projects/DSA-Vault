import java.util.*;

public class CountDigits {
    public static int countNumber(int n){
        int num = Math.abs(n);

        return String.valueOf(num).length();
    }
       

    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);

       System.out.println("Enter a number to count:");
       int num = sc.nextInt();

       sc.close();;

       int count = countNumber(num);
       System.out.println("The number of digits are: "+ count);
    }
}
