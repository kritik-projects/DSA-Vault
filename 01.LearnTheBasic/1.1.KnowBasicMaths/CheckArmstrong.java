import java.util.*;

public class CheckArmstrong {

    public static boolean checkArmStrong(int n) {
        int originalNum = n, sum = 0;
        int length = String.valueOf(n).length();

        while (n > 0) {
            int ans = n % 10;
            sum += Math.pow(ans, length);
            n /= 10;
        }

        return sum == originalNum;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter some number:");
        int num = sc.nextInt();
        sc.close();

        boolean isArmstrong = checkArmStrong(num);
        System.out.println(isArmstrong ? "Number is a valid armstrong" : " Number is not a valid armstrong");

    }
}

// GFG Solution link:
// https://www.geeksforgeeks.org/problems/armstrong-numbers2727/1