/**
 * Created by Dawid Kowalski on 09.11.2017.
 */
public class Converter {

    private double celsius, fahrenheit;
    private static final double fahrenheit_static = 1.8000;

    public void toCelsius(double fahrenheit){
        this.celsius = (fahrenheit - 32) / fahrenheit_static;

        System.out.print(fahrenheit+ " in Fahrenheit is equal to " + Math.round(this.celsius * 100.0) / 100.0 +
                " in Celsius");
    }

    public void toFahrenheit(double celsius){
        this.fahrenheit = (fahrenheit_static * celsius) + 32;

        System.out.print(celsius+ " in Celsius is equal to " + Math.round(this.fahrenheit * 100.0) / 100.0 +
                " in Fahrenheit");
    }

}
