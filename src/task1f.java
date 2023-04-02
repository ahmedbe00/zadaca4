import java.util.Scanner;

public class task1f {
    public static <string> void main(String[] args) {

        System.out.println("Which operation do you want to use *,/,+,- ?\n");
        int total=0;
        while(true) {
            Scanner reader = new Scanner(System.in);
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
