package pl.coderslab.day2;

import java.lang.reflect.Array;
import java.util.Arrays;

public class AdvancedCalculator extends Calculator {

    public static String[] globalOperations  = new String[0];

    static final double PI = 3.14159265;

    public void pow(int num1, int num2) {
        double result = Math.pow(num1, num2);
        addToHistory(
                "num1: " + num1 +
                        "num2: " + num2 + " = " +
                        result);
    }

    public void root(int num1, int num2) {
        double result = Math.pow(num1, 1.0 / num2);
        addToHistory(
                "num1: " + num1 +
                        "num2: " + num2 + " = " +
                        result);
    }

    static double computeCircleArea(int r) {
        double area = PI * r * r;
 globalOperations = Arrays.copyOf(globalOperations, globalOperations.length+1);
 globalOperations[globalOperations.length-1] = "Calculated area:"  + area;
        return area;
    }

    static void printGlobalOperations(){
        for (String globalOperation : globalOperations) {
            System.out.println(globalOperation);
        }
    }
}
