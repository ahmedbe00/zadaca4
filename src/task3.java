import java.util.Arrays;
import java.util.Scanner;

public class task3 {
    public static void main(String[] args) {
        System.out.println("Type which one of these you want to run :\n");
        System.out.println("1. Is string a palindrome");
        System.out.println("2. Filter an Array");
        System.out.println("3. Is string a palindrome\n");
        System.out.print("Your option is : ");

        Scanner reader = new Scanner(System.in);
        int optionNumber=reader.nextInt();

        if (optionNumber==1){
            task3.polindrome();
        }
        if (optionNumber==2){
            task3.divisibleByX();
        }
        if (optionNumber==3){
            task3.removeNumbersFromArray();
        }


        task3 main = new task3();


    }


    static String polindrome() {
        System.out.println("Type your word");
        Scanner reader = new Scanner(System.in);
        String word = reader.nextLine();
        char[] wordChar = word.toCharArray();
        char[] reversedWordChar = new char[wordChar.length];
        for (int i = 0; i < wordChar.length; i++) {
            reversedWordChar[i] = wordChar[wordChar.length - i - 1];
        }
        for (int i = 0; i < wordChar.length; i++) {

            if (reversedWordChar[i] != wordChar[i]) {
                System.out.println("Word is not a polindrome");
                return word;
            }
        }
        System.out.println("Word is a polindrome");
        return word;
    }

    static int divisibleByX() {
        Scanner reader = new Scanner(System.in);
        System.out.println("Type your number :");
        int number = reader.nextInt();
        System.out.println(" Type the number you are dividing by ");
        int x = reader.nextInt();
        int result = number / x;
        if (number % x == 0) {

            System.out.println("The number " + number + " is divisble with number " + x);
        } else {
            System.out.println("The number " + number + " is NOT divisble with number " + x);
        }
        return result;
    }

    static void removeNumbersFromArray() {
        Scanner reader = new Scanner(System.in);
        System.out.println("Please type how many elements array will have :");
        int numberOfElements = reader.nextInt();
        System.out.println("Please type elements of array :");
        int[] myArray = new int[numberOfElements];

        for (int i = 0; i < numberOfElements; i++) {
            myArray[i] = reader.nextInt();

        }
        System.out.println("Type amount of numbers you want to delete from arrray");
        int amountOfNumberToDelete = reader.nextInt();


        for (int i = 0; i < amountOfNumberToDelete; i++) {
            System.out.println("Type a number you want to delete from array ");
            int numberToDelete = reader.nextInt();
            int index = -1;

            for (int j = 0; j < numberOfElements; j++) {
                if (myArray[j] == numberToDelete) {
                    index = j;
                    break;
                }
            }
            if (index != -1) {
                for (int k = index; k < numberOfElements - 1; k++) {
                    myArray[k] = myArray[k + 1];

                }
                numberOfElements--;

            }
        }

        System.out.println(Arrays.toString(myArray));
        //System.out.println("Array after deleting " + amountOfNumberToDelete + " numbers");
       // for (int i = 0; i < numberOfElements; i++) {
        //    System.out.print(myArray[i] + " ");
        
        }
    }







