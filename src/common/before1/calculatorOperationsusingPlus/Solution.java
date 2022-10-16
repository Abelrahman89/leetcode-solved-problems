package common.before1.calculatorOperationsusingPlus;

public class Solution {
//    int firstNumber = 5;
//    int secondNumber = 10;
//    char operator = '+';
//    boolean isPositive = true;

    public static void main(String[] args) {
//        System.out.println(calculator(5,8,'+'));
//        System.out.println(calculator(5,-8,'+'));
//        System.out.println(calculator(20,8,'+'));
//        System.out.println(calculator(-5,8,'+'));

        System.out.println(calculator(5,8,'-'));
        System.out.println(calculator(5,-8,'-'));
        System.out.println(calculator(20,8,'-'));
        System.out.println(calculator(-5,8,'-'));

//        System.out.println(calculator(5,8,'*'));
//        System.out.println(calculator(5,-8,'*'));
//        System.out.println(calculator(20,8,'*'));
//        System.out.println(calculator(10,12,'*'));
//        System.out.println(calculator(-5,8,'*'));

//        System.out.println(calculator(16,8,'/'));
//        System.out.println(calculator(-50,-10,'/'));
//        System.out.println(calculator(20,4,'/'));
//        System.out.println(calculator(-15,3,'/'));
    }

    public static int calculator(int firstNumber, int secondNumber, char operator) {
        int result = 0;
        switch (operator) {
            case '+':
                result = addTowNumbers(firstNumber, secondNumber);
                break;
            case '-':
                result = subtractTowNumbers(firstNumber, secondNumber);
                break;
            case '*':
                result = multiplyTowNumbers(firstNumber, secondNumber);
                break;
            case '/':
                result = divideTowNumbers(firstNumber, secondNumber);
                break;
            default:
                System.out.println("invalid operation");

                break;

        }
        return result;
    }

    public static int addTowNumbers(int firstNumber, int secondNumber) {
        return firstNumber + secondNumber;
    }

    public static int subtractTowNumbers(int firstNumber, int secondNumber) {
       // secondNumber = ~secondNumber + 1;
        secondNumber = - secondNumber ;
        return firstNumber + secondNumber;
    }

    public static int multiplyTowNumbers(int firstNumber, int secondNumber) {

        //check if any of   firstNumber or secondNumber is negative
        boolean isPositive = true;

    //   checkNegativNumbers(firstNumber, secondNumber, isPositive);
        if (firstNumber < 0 && secondNumber < 0) {
            firstNumber = ~firstNumber + 1;
            secondNumber = ~secondNumber + 1;
        } else if (firstNumber > 0 && secondNumber < 0) {
            secondNumber = ~secondNumber + 1;
            isPositive = false;
        } else if (firstNumber < 0 && secondNumber > 0) {
            firstNumber = ~firstNumber + 1;
            isPositive = false;
        }

        int result = 0;
        for (int i = 1; i <= secondNumber; i++) {
            result += firstNumber;
        }
        if (isPositive == false)
            result = ~result + 1;
        return result;
    }

    private static void checkNegativNumbers(int firstNumber, int secondNumber, boolean isPositive) {
        if (firstNumber < 0 && secondNumber < 0) {
            firstNumber = ~firstNumber + 1;
            secondNumber = ~secondNumber + 1;
        } else if (firstNumber > 0 && secondNumber < 0) {
            secondNumber = ~secondNumber + 1;
            isPositive = false;
        } else if (firstNumber < 0 && secondNumber > 0) {
            firstNumber = ~firstNumber + 1;
            isPositive = false;
        }
    }

    public static int divideTowNumbers(int firstNumber, int secondNumber) {
        if (secondNumber == 0)
            throw new ArithmeticException("division by 0 is not allowed");
        int result = 0;
        boolean isPositive = true;

        if (firstNumber < 0 && secondNumber < 0) {
            firstNumber = ~firstNumber + 1;
            secondNumber = ~secondNumber + 1;
        } else if (firstNumber > 0 && secondNumber < 0) {
            secondNumber = ~secondNumber + 1;
            isPositive = false;
        } else if (firstNumber < 0 && secondNumber > 0) {
            firstNumber = ~firstNumber + 1;
            isPositive = false;
        }

        while (firstNumber > 0) {
            firstNumber = subtractTowNumbers(firstNumber, secondNumber);
            result++;
        }


        if (isPositive == false)
            result = ~result + 1;
        return result;

    }

}
