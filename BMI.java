public class BMI {

    public static double calc(double weight, double height){
        double BMI = 703 * weight / Math.pow(height, 2);
        return BMI;
    }

    public static void main(String[] args){
        System.out.printf("Your BMI is %.2f", calc(150, 70));
    }
}