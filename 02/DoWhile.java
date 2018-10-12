import java.util.Scanner; 

public class DoWhile {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int value = 0;
        do {
            System.out.println("Enter a Number");
            value = input.nextInt();
        } while (value != 5);
        System.out.println("5 has been entered");
    }
}