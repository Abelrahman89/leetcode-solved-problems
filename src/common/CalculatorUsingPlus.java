package common;

public class CalculatorUsingPlus {
    static boolean isPostive = false;
    static int result = 0;

    public static void main(String[] args) {
//        System.out.println(multiply(-2, -5));
//        System.out.println(multiply(-2, 15));
//        System.out.println(multiply(-7, 8));
//        System.out.println(multiply(7, -8));
//        System.out.println(~7+1);
//        System.out.println(~1+1);

//        System.out.println(divideTwoNumbers(10, 2));
//        System.out.println(divideTwoNumbers(-10, 2));
//        System.out.println(divideTwoNumbers(10, -2));
//        System.out.println(divideTwoNumbers(-10, -2));
   //     System.out.println(divideTwoNumbers(-30, 5));
        //    System.out.println(divideTwoNumbers(-10, 0));
//         System.out.println(subtractTwoNumbers(8, 5));
//             System.out.println(subtractTwoNumbers(5, 8));
//
        System.out.println(subtractTwoNumbers(-20, 5));
         System.out.println(subtractTwoNumbers(-16, -10));
           System.out.println(subtractTwoNumbers(5,8));
    }

    public static int multiply(int firstNumber, int secondNumber) {
        if (firstNumber < 0 && secondNumber < 0) {
            isPostive = true;
            firstNumber = ~firstNumber + 1;
            secondNumber = ~secondNumber + 1;
        } else {
            if (firstNumber < 0) {
                firstNumber = ~firstNumber + 1;
                ;
                isPostive = false;
            }
            if (secondNumber < 0) {
                secondNumber = ~secondNumber + 1;
                isPostive = false;
            }
        }

        int max = secondNumber;
        int min = secondNumber;

        if (firstNumber > secondNumber) {

            max = firstNumber;
            min=secondNumber;

        }
        int result = 0;
        for (int i = 1; i <= max; i++) {
            result += min;
        }
        if (isPostive == false)
            result = ~result + 1;
        return result;
    }

    public static int sum(int firstNumber, int secondNumber) {
        return firstNumber + secondNumber;
    }

    //    public static int division(int firstNumber, int secondNumber) {
//        if (firstNumber < 0 && secondNumber < 0) {
//            isPostive = true;
//            firstNumber = -firstNumber;
//            secondNumber = -secondNumber;
//        }
//        if (firstNumber < 0)
//            // int result = 0;
//            for (int i = 1; i <= firstNumber; i++) {
//                result += secondNumber;
//                if (result == firstNumber)
//                    return i;
//            }
//        return result;
//    }
    public static int divideTwoNumbers(int a, int b) {
        if (b == 0) {
            throw new ArithmeticException(
                    "Division by 0 is undefined: " + a + "/" + b);
        }
        int sign = 1;
        if (a < 0) {
            a = ~a + 1;
            sign = ~sign + 1;
        }
        if (b < 0) {
            b = ~b + 1;
            sign = ~sign + 1;
        }
        int result = 0;
        while (a >= 0) {
            a = subtractTwoNumbers(a, b);
            result++;
        }
        result = subtractTwoNumbers(result, 1);
//        int x=subtractTwoNumbers(result,1);
//        result=x;
//        x=multiply(result,sign);
//        result=x;
        System.out.println(result);
        System.out.println(sign);
        return multiply(result, sign);
        // return (result ) * sign;
    }

    public static int subtractTwoNumbers(int firstNumber, int secondNumber) {
        //using two's complement
        secondNumber = ~secondNumber + 1;
        return firstNumber + secondNumber;
    }
//    public static int subtract(int firstNumber, int secondNumber) {
//        int max = secondNumber, result = firstNumber;
//        if (firstNumber > secondNumber) {
//            result = secondNumber;
//            max = firstNumber;
//
//        }
//
//        for (int i = 1; i <= max; i++) {
//            result++;
//            if (result == max)
//                return i;
//        }
//        return result;
//    }
}
