/*
Body Mass Index (BMI) Calculator
 */

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("BMI Calculator");
        double wage = 0.0;
        double height = 0.0;

        Scanner sc = new Scanner(System.in);

        try{
            System.out.println("Put your wage: ");
            wage = sc.nextDouble();
            System.out.println("Put your height in cm: ");
            height = sc.nextDouble();
        }catch (InputMismatchException e){
            System.out.println("Wrong data format!. Try again");
        }

        double heightInMeters = height / 100;

        //System.out.println(heightInMeters);
        Calculation calculation = new Calculation();
        calculation.calcBMI(wage, heightInMeters);

        System.out.println(calculation.getBMI());
        if(calculation.getBMI() < 16){
            System.out.println("Severe Thinness");
        }else if(calculation.getBMI() >= 16 && calculation.getBMI() < 17){
            System.out.println("Moderate Thinness");
        }else if(calculation.getBMI() >= 17 && calculation.getBMI() < 18.5){
            System.out.println("Mild Thinness");
        }else if(calculation.getBMI() >= 18.5 && calculation.getBMI() < 25){
            System.out.println("Overweight");
        }else if(calculation.getBMI() >= 30 && calculation.getBMI() < 35){
            System.out.println("Obese Class I");
        }else if(calculation.getBMI() >= 35 && calculation.getBMI() < 40){
            System.out.println("Obese Class II");
        }else if(calculation.getBMI() >= 40){
            System.out.println("Obese Class III");
        }else {
            System.out.println("Out of scale! :oOo");
        }

    }
}
