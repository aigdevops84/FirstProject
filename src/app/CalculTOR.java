package app;
public class CalculTOR {

    public static int addNumbers(int numOne, int numTwo) {
        return numOne + numTwo;
    }

    public static int subNumbers(int numOne, int numTwo) {
        return numOne - numTwo;
    }

    public static int divNumbers(int numOne, int numTwo) {
        if (numTwo != 0) {
            return numOne / numTwo;
        }
        return -1;
    }

    public static int multiNumbers(int numOne, int numTwo) {
        return numOne * numTwo;
    }
}
