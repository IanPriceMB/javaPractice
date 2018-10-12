import java.util.Scanner;

public class UserInput {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        System.out.println("Please enter some text: ");

        String line = input.nextLine();

        System.out.println("You entered: " + line);
    }
}