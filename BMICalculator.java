import java.util.Scanner;

public class BMICalculator{


    public static void main(String[] args) {

        System.out.println("This program calculate the BMI of a person");

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your height");

        double height = scanner.nextDouble();

        System.out.println("Enter your weight");

        double weight = scanner.nextDouble();

        double bmi = calculateBMI(height,weight);
        System.out.println("Your BMI is " + bmi);







    }

    public static double calculateBMI (double height, double weight){
        return weight / (height * height);
    }


}
