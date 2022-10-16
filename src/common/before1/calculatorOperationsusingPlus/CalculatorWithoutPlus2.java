package common.before1.calculatorOperationsusingPlus;

public class CalculatorWithoutPlus2 {
    public static void main(String[] args) {
                System.out.println(calculator(16,8,'/'));
        System.out.println(calculator(-50,-10,'/'));
        System.out.println(calculator(20,4,'/'));
        System.out.println(calculator(-15,3,'/'));

    }
public static int calculator(int firstNumber, int secondNumber, char operator){
        int result = 0;
        switch(operator){
            case '+':
                result =  addTwoNumbers(firstNumber, secondNumber);
                break;
            case '-':
                result =  subtractTwoNumbers(firstNumber, secondNumber);
                break;
            case '*':
                result =  multiplyTwoNumbers(firstNumber, secondNumber);
            break;
            case '/':
                result =  divideTwoNumbers(firstNumber, secondNumber);
            break;
            default:
                return 0;
        }
    return result;
}

    public static int addTwoNumbers(int firstNumber, int secondNumber) {
        return firstNumber + secondNumber;
    }

    public static int subtractTwoNumbers(int firstNumber, int secondNumber) {
        secondNumber = ~secondNumber + 1;
        return firstNumber + secondNumber;

    }


    public static int multiplyTwoNumbers(int firstNumber, int secondNumber) {
        int result = 0;
        boolean isPositive = true;

        if (firstNumber < 0 && secondNumber < 0) {
            firstNumber = ~firstNumber +1;
            secondNumber = ~secondNumber +1;

        } else if (firstNumber < 0 || secondNumber < 0) {
            isPositive = false;
            if (firstNumber < 0)
                firstNumber = ~firstNumber +1;
            if (secondNumber < 0)
                secondNumber = ~secondNumber +1;
        }

        for (int i = 1; i <= secondNumber; i++) {
            result += firstNumber;
        }
        if (isPositive == false)
            result = ~result +1;
        return result;

    }

    public static int divideTwoNumbers(int firstNumber, int secondNumber) {
        if (secondNumber == 0)
            throw new ArithmeticException(" divided by 0 not allowed");
        int result = 0;
        boolean isPositive = true;

        if (firstNumber < 0 && secondNumber < 0) {
            firstNumber = ~firstNumber +1;
            secondNumber = ~secondNumber +1;

        } else if (firstNumber < 0 || secondNumber < 0) {
            isPositive = false;
            if (firstNumber < 0)
                firstNumber = ~firstNumber +1;
            if (secondNumber < 0)
                secondNumber = ~secondNumber +1;
        }

        while (firstNumber > 0) {
            firstNumber = subtractTwoNumbers(firstNumber, secondNumber);
            result++;
        }
        if (isPositive == false)
            result = ~result+1;
        return result;

    }
}