import java.util.Scanner;

public class task1d {
    public static void main(String[] args) {
        System.out.println("Which operation do you want to use *,/,+,- ?\n");
        int total;

        do {
            Scanner reader = new Scanner(System.in);
            System.out.println("Type a number1 ");
            int number1 = reader.nextInt();
            System.out.println("Type a number2 ");
            int number2 = reader.nextInt();
            System.out.println("Type a aritmetic operation you want ");
            char operation = reader.next().charAt(0);
            if (operation=='+'){
                total=number1+number2;
                System.out.println("Total of "+number1+" and "+number2+" is "+total);
            }
            if (operation=='-'){
                total=number1-number2;
                System.out.println("Total of "+number1+" and "+number2+" is "+total);
            }
            if (operation=='/'){
                total=number1/number2;
                System.out.println("Total of "+number1+" and "+number2+" is "+total);
            }
            if (operation=='*'){
                total=number1*number2;
                System.out.println("Total of "+number1+" and "+number2+" is "+total);
            }

            break;
        }
        while (true);
    }
}
