package MiniProject;
import java.util.Scanner;

enum LengthUnit {
    KM, HM, DAM, M, DM, CM, MM;
}

public class MiniProjectUpgrade {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("            WELCOME TO            ");
        System.out.println("   LENGTH CONVERSION CALCULATOR   ");
        System.out.println("==================================");
        System.out.println("BY DIVANO N.A.");
        System.out.println("==================================");

        try {
            System.out.printf("%-20s : ", "Input Number");
            double number = input.nextDouble();
            input.nextLine();

            System.out.printf("%-20s : ", "Initial Length Unit");
            String initial = input.nextLine();

            System.out.printf("%-20s : ", "Convert To");
            String convert = input.nextLine();

            LengthUnit initialUnit = LengthUnit.valueOf(initial.toUpperCase());
            LengthUnit convertTo = LengthUnit.valueOf(convert.toUpperCase());
            double result = convertedNumber(number, initialUnit, convertTo);
            System.out.printf("%-20s : %f\n", "Result", result);
        } catch (Exception e) {
            System.out.println("ERROR! YOUR INPUT IS INCORRECT!");
            System.out.println(" PLEASE RUN THIS PROGRAM AGAIN ");
        }
        System.out.println("==================================");
        System.out.println("   THANKS FOR USING MY PROGRAM:)  ");
    }

    public static double convertedNumber(double number, LengthUnit initialLengthUnit, LengthUnit convertTo){
        double[] convertionFactors = {1, 10, 100, 1000, 10000, 100000, 1000000};
        int initialIndex = initialLengthUnit.ordinal();
        int convertToIndex = convertTo.ordinal();
        return number * convertionFactors[convertToIndex] / convertionFactors[initialIndex];
    }
}
