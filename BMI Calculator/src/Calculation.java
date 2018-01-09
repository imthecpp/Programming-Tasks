public class Calculation {

    private double BMI;


    public void calcBMI(double wage, double height){

        BMI = wage / Math.pow(height, 2);
    }

    public double getBMI() {
        return BMI;
    }
}
