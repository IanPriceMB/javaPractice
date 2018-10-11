// everything in java must be inside a class
//the name of the class and file must match
public class HelloWorld {

    public static double fahrenheit(double x){
        double fahr = (x - 32) / 1.8;
        return fahr;
    };

    //this is the executeable portion of the class
    public static void main(String[] args){

        String helloWorld = "Hello, world!"; 
        int year = 2018;
        double pi = 3.14;
        int var = 1;
        boolean isRedditCool = true;



        //print the string to the console
        System.out.println(helloWorld);
        System.out.println("\n");
        // byte -> -128, 127
        // short
        // int -> -2147483648, 2147483647
        // long

        // double -> 12.3, 11.4123
        // float -> 12.3
        // //can only have one decimal after float

        // boolean -> false or true

        // char -> 'a', '3', '='

        // String is just an array of characters

        double degreesCelsius = 10;

        double degreesFahrenheit = (degreesCelsius - 32) / 1.8;

        System.out.println(degreesCelsius + "C is " + degreesFahrenheit + "F");
        System.out.printf("%.2fC is %.2fF", degreesCelsius, degreesFahrenheit);

        System.out.println("\n");

        if(degreesFahrenheit>100){
            System.out.println("it is really hot out there");
        } else {
            System.out.println("it is pretty chill");
        }
        
        System.out.println("\n");

        double degreesCelsiusInUSA = 0;
        double degreesCelsiusInEurope = 10;
        double degreesCelsiusinAntartica = -50;

        double degreesFahrenheitInUSA = fahrenheit(degreesCelsiusInUSA);
        double degreesFahrenheitInEurope = fahrenheit(degreesCelsiusInEurope);
        double degreesFahrenheitinAntartica = fahrenheit(degreesCelsiusinAntartica);

        System.out.printf("Fahrenheit in USA: %.2f\n", degreesFahrenheitInUSA );
        System.out.printf("Fahrenheit in Europe: %.2f\n",degreesFahrenheitInEurope);
        System.out.printf("Fahrenheit in Antartica: %.2f\n", degreesFahrenheitinAntartica);

        System.out.println("\n");
    }
}

//javac HelloWorld.java for complie
//java HelloWorld for running