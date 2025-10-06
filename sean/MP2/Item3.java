import java.util.*;

public class Item3 {
    public static void main(String[] args) {
        Scanner sean = new Scanner(System.in);

        System.out.print("Enter min range: ");
        int min = sean.nextInt();

        System.out.print("Enter max range: ");
        int max = sean.nextInt();

        int count = 0;

        System.out.printf("Prime numbers within %d-%d: ", min, max);

        for(int i = min; i < max; i++) {
            if(isPrime(i)) {
                System.out.printf("%d,", i);
                count++;
            }
        }
    }

    public static boolean isPrime(int n) {
        if(n <= 1) return false;
        for(int i = 2; i * i <= n; i++) {
            if(n % i == 0) return false;
        }
        return true;
    }
}