import java.util.*;

public class Item1 {
    public static void main(String[] args) {
        Scanner sean = new Scanner(System.in);
            
        System.out.print("Enter number of numbers to get factorial: ");
        int numInput = sean.nextInt();
        System.out.println("You entered: " + numInput);

        int[] arrNumbers = new int[numInput];
        int[] factorialNumbers = new int[numInput];

        for(int i = 0; i < numInput; i++) {
            System.out.printf("Enter number %d: ", i + 1);
            arrNumbers[i] = sean.nextInt();
            factorialNumbers[i] = factorial(arrNumbers[i]);
        }

        for(int i = 0; i < numInput; i++) {
            System.out.printf("%d factorial is: %d\n", arrNumbers[i], factorialNumbers[i]);
        }
    }

    static int factorial(int n) {
        int result = 1;
        for(int i = 2; i <= n; i++) {
            result *= i;
        }
        return result;
    }
}
