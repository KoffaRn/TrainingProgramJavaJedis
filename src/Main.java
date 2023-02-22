import java.util.ArrayList;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        ArrayList<String> ovningar = new ArrayList<>();
        HashMap<String, Integer> userProgram = new HashMap<>();
        HashMap<String, Integer> userProgress = new HashMap<>();
        ovningar.add("Bänkpress");
        ovningar.add("Marklyft");
        ovningar.add("Knäböj");
        ovningar.add("Chins");
        ovningar.add("Curls");
        ovningar.add("Dips");

        var input = new Scanner(System.in);
        boolean loop = true;
        while (loop) {
            Methods.printMenu2();
            System.out.println("Skriv numret på önskat val");
            int choice = input.nextInt();
            if (choice == 1) {
                Methods.addExercise(input, ovningar, userProgress);
            } else if (choice == 2) {
                Methods.removeExercise(input, userProgress);
            } else if (choice == 3) {
                loop = false;
                break;
            }
        }

    }
}