import java.util.*;
import java.io.*;


public class StringPractice {
    public static void main(String[] args) throws IOException {
        Scanner sean = new Scanner(System.in);
        BufferedReader buffread = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Enter a String to count its vowels: ");
        String stringInput = buffread.readLine();
        int vowelCount = 0;

        for(int i = 0; i < stringInput.length(); i++) {
            switch(stringInput.toLowerCase().charAt(i)) {
                case 'a':
                case 'e':
                case 'i':
                case 'o':
                case 'u':
                    System.out.printf("Found a vowel in position %d, %c: \n", i, stringInput.charAt(i));
                    vowelCount++;
            }
        }
g
        System.out.println("Total vowel count: " + vowelCount);
    }
}