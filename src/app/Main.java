package app;

import static app.CalculTOR.*;

public class Main {


        public static void main(String[] args) {
            int result;
            int firstNum = 8;
            int secondNum = 4;
            int thirdNum = 0;

            result = addNumbers(firstNum, secondNum);
            System.out.println(result);
            result = subNumbers(firstNum, secondNum);
            System.out.println(result);
            result = divNumbers(firstNum, secondNum);
            System.out.println(result);
            result = multiNumbers(firstNum, secondNum);
            System.out.println(result);
            result = divNumbers(firstNum, thirdNum);
            System.out.println(result);
        }

}
