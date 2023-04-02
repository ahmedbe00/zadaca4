import java.util.Scanner;

public class task1g {
    public static <string> void main(String[] args) {
        int number=0;
        int total=0;
        int startNumber;

        int startingInteger=0;
        while(true) {
            Scanner reader = new Scanner(System.in);


            System.out.println("Please enter a starting integer");
             number = reader.nextInt();
             total=number;

            System.out.println("Type a aritmetic operation you want ");
            char operation = reader.next().charAt(0);
            if (operation=='='){
                System.out.println("Calculator result is "+total);
                break;

            }


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
