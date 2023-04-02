import java.util.Scanner;

public class task1b {
    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);
        int number;

        do {
            System.out.println("Please enter any integer :");
            number=reader.nextInt();
        }
        while (number!=-1000);
    }
}
