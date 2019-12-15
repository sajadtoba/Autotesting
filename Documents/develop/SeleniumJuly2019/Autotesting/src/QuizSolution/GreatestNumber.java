package QuizSolution;

public class GreatestNumber {

    public static void main(String[] args) {
        int number1 = 35;
        int number2 = 78;
        int number3 = 87;
        if (number1 > number2 && number1 > number3) {
            System.out.println("The Greatest Number Is: " + number1);
        }
        if (number2 > number1 && number2 > number3) {
            System.out.println("The Greatest Number is:" + number2);
        } else {
            System.out.println("The Greatest Number is:" + number3);
        }
    }
}