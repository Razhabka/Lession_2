public class Main {

    public static void main(String[] args) {

        printTree();
        checkSumSing();
        printColor();
        compareNumbers();
        System.out.println(withinNumbers(10, 7)+ "\n");
        positiveOrNegativeNum(-10);
        System.out.println(positiveOrNegativeNumBool(10));
    }


    public static void printTree(){

        System.out.println("Orange");
        System.out.println("Banana");
        System.out.println("Apple\n");

    }

    public static void checkSumSing(){

        int a = 23;
        int b = 78;

        if(a+b >= 0){
            System.out.println("Сумма положительная");
        }else {
            System.out.println("Сумма отрицательная");
        }

    }

    public static void printColor(){

        int value = 143;

        if (value == 0){
            System.out.println("\nКрасный\n");
        }else if ( value > 0 && value <= 100  ) {
            System.out.println("\nЖелтый\n");
        }else if (value > 100) {
            System.out.println("\nЗеленый\n");
        }
    }

    public static void compareNumbers(){

        int a = -10;
        int b = 34;

        if(a >= b){
            System.out.println("a >=b \n");
        }else {
            System.out.println("a < b \n");
        }

    }

    public static boolean withinNumbers (int num1, int num2){

        return num1 + num2 >=10 && num1+num2 <= 20;

    }

    public static void positiveOrNegativeNum(int num){

        if(num >= 0){
            System.out.println("Число положительное\n");
        }else {
            System.out.println("Число отрицательное\n");
        }

    }


    public static boolean positiveOrNegativeNumBool(int num){

        if(num >= 0){
            return false;
        }else {
            return true;
        }

    }



}
