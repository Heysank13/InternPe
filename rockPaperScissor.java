import java.util.*;

public class rockPaperScissor {

    public static void main(String args[]) {
        System.out.println("Enter the User Input:");
        Scanner sc = new Scanner(System.in);

        int userInput = sc.nextInt();

        Random rnd = new Random();
        int computerInput = rnd.nextInt(3);

        /*
         * rock = 0
         * paper = 1
         * scissor = 2
         */
        printUserInput();
        printComputerInput();

    }

    public static void printUserInput() {
        if (computerInput == userInput) {
            System.out.println("Draw or no one wins or no one lose");

        } else if (computerInput == 0 && userInput == 1 || computerInput == 1 && userInput == 2
                || computerInput == 2 && userInput == 0) {
            System.out.println("User Wins");

        } else {
            System.out.println("Computer Wins");
        }

        System.out.println("Computer choice is " + computerInput);
    }

    public static void printComputerInput() {

        if (computerInput == 0) {
            System.out.println("Computer choice is rock");

        } else if (computerInput == 1) {

            System.out.println("Computer choice is paper");
        } else {
            System.out.println("Computer choice is scissor");

        }
    }
}
