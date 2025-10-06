



import java.util.Scanner;

public class FactorialLoop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("How many entries?: ");
        int n =sc.nextInt();
        int[] numbers = new int[n];

        //1. Prompt user to input numbers
        for (int i = 0; i < n; i++) {
            System.out.print("Enter number " + (i+1) + ": ");
            numbers[i] = sc.nextInt();
}

        //2. Compute factorial using loops
        for (int i = 0; i < numbers.length; i++) {
            int num = numbers[i];
            long factorial = 1;

            for (int j = 1; j <=num; j++) {
                factorial *= j;
            }
        //3. Display results
            System.out.println("Factorial of " +num+ " = " + factorial);
        }
        sc.close();
    }
}