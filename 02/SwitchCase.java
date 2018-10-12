import java.util.Scanner;

public class SwitchCase{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println("Please enter a command: ");
        String text = input.nextLine();

        switch(text){
            case "Start":
                System.out.println("Machine has started!");
                break;

            case "Stop":
                System.out.println("Machine has stopped.");
                break; 

            default:
                System.out.println("Unrecognized command");
                break;
        }

    }
}