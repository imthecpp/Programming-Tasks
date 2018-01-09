import java.util.Scanner;

/**
 * Created by Dawid Kowalski on 09.11.2017.
 */
public class ConverterTester {

    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        Converter converter = new Converter();
        int choice = 0;
        double temperature = 0.0;

        System.out.print("1. Fahrenheit to Celsius");
        System.out.print("\t");
        System.out.println("2. Celsius to Fahrenheit");
        System.out.print("Type your choice: ");
        choice = input.nextInt();
        System.out.print("Type temperature: ");
        temperature = input.nextDouble();

        switch (choice){
            case 1: converter.toCelsius(temperature); break;
            case 2: converter.toFahrenheit(temperature);break;
            default: System.out.print("Wrong choice!");
        }




    }
}
