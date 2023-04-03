import java.util.Scanner;

public class task1c {
    public static void main(String[] args) {

        do {
            Scanner reader=new Scanner(System.in);
            System.out.println("Type a number1");
            int number1=reader.nextInt();
            System.out.println("Type a number2");
            int number2=reader.nextInt();
            int total = number1+number2;
            System.out.println("Total is = "+total);
            break;

        }
        while (true);{

        }
    }
}
