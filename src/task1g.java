import java.util.Scanner;

public class task1g {
    public static <string> void main(String[] args) {

        int startingInteger=0;
        int total=0;

        Scanner reader=new Scanner(System.in);
        System.out.println("Did you defined a starting integer y/n ?");
        char answer=reader.next().charAt(0);

        if (answer=='n'){
            System.out.println("Enter the starting integer value:");
            startingInteger = reader.nextInt();
            total = startingInteger;
        }
        while(true) {

            System.out.println("Type a aritmetic operation you want ");
            char operation = reader.next().charAt(0);

            if (operation=='='){
                System.out.println("Calculator result is "+total);
                break;

            }
            System.out.println("Enter a integer");
            int number = reader.nextInt();

            if (operation=='+'){

                total=total+number;
            }
            if (operation=='-'){

                total=total-number;
            }
            if (operation=='/'){
                total= total/number ;
            }
            if (operation=='*'){
                total=total*number;
            }

        }

    }
}
