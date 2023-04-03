import java.util.Arrays;
import java.util.Scanner;

public class task2 {
    public static <string> void main(String[] args) {

        Scanner reader = new Scanner(System.in);
        // System.out.println("Please type how many elements array will have :");
        //int numberOfElements = reader.nextInt();
        int[] myArray = new int[100];
        int i = 0;

        while (true) {
            System.out.println("Enter a element of array : ");
            int elementOfArray = reader.nextInt();
            if (elementOfArray == -10) {
                break;
            }
            myArray[i] = elementOfArray;
            i++;

        }
        System.out.println("You type this numbers");
        for (int j = 0; j < i; j++) {
            System.out.print( myArray[j] + " ");
        }
        System.out.println("\nDo you want to expand you array  y/n  ?");
        char answer = reader.next().charAt(0);
        if (answer == 'y') {
            while (true) {
                System.out.println("Enter a element of array : ");
                int elementOfArray = reader.nextInt();
                if (elementOfArray == -10) {
                    break;
                }
                myArray[i] = elementOfArray;
                i++;

            }
            System.out.print("You type this numbers: ");
            for (int j = 0; j < i; j++) {
                System.out.print(myArray[j] + " ");

            }
        }
        if (answer == 'n') {

        }

    }
}

