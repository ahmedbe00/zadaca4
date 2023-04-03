public class Main {
    public static void main(String[] args) {
       //1.a
        Main main = new Main();

        int Result1 = main.sum1(31,4);
        System.out.println(Result1);

        int Result2 = main.sum2(313,13);
        System.out.println(Result2);

        int Result3 = main.sum3(6,4);
        System.out.println(Result3);

        int Result4 = main.sum4(90,9);
        System.out.println(Result4);
    }

    int sum1(int number1,int number2){
        int total1 = number1+number2;
        return total1;

    }
    int sum2(int number3,int number4){
        int total2 = (number3-number4);
        return total2;

    }
    int sum3(int number5,int number6){
        int total3 = number5*number6;
        return total3;

    }
    int sum4(int number7,int number8){
        int total4 = number7/number8;

        return total4;

    }
}