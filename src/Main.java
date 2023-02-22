import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

import static java.lang.System.exit;
import static java.lang.System.in;

public class Main {
    static Scanner scanner = new Scanner(System.in);
    static ArrayList<String> ovningar = new ArrayList<>();
    static HashMap<String, Integer> userProgram = new HashMap<>();
    static HashMap<String, Integer> userProgress = new HashMap<>();


    static void createUserProgram() {
        while (true) {
            int index = 0;

            Scanner scanner = new Scanner(in);
            System.out.println("1. Lägg till övning");
            System.out.println("2. Ta bort övning");
            System.out.println("3. Visa program");
            System.out.println("4. Avsluta");
            int addChoice = scanner.nextInt();

            switch (addChoice) {
                case 1 -> {
                    System.out.println("Tillgängliga övningar: ");
                    for (String s : ovningar) {
                        System.out.println(index + 1 + ". " + s);
                        index++;
                    }
                    Scanner ovningScanner = new Scanner(in);
                    System.out.println("Vilken övning vill du lägga till?");
                    int excersiseChoice = ovningScanner.nextInt();
                    Scanner repScanner = new Scanner(in);
                    System.out.println("Hur många reps vill du lägga till?");
                    int repCount = repScanner.nextInt();
                    userProgram.put(ovningar.get(excersiseChoice - 1), repCount);
                }
                case 2 -> {
                    System.out.println("Vilken övning vill du ta bort?");
                    userProgram.forEach(
                            (key, value) -> System.out.println(key));
                    Scanner utilScanner = new Scanner(in);
                    String choice = utilScanner.nextLine();
                    if (userProgram.containsKey(choice)) {
                        userProgram.remove(choice);
                        System.out.println(choice + " togs bort.");
                    } else
                        System.out.println(choice + " finns inte i programmet.");
                }
                case 3 -> {
                    userProgram.forEach((key, value) -> System.out.println(key + ", " + value));
                }
                case 4 -> {
                    return;
                }
            }
        }
    }

    /**
     * printa ut huvudmenyn
     */
    public static void printMainMenu() {

        String[] mainMenuItems = new String[] { "Visa tillgängliga övningar", "Skapa ett nytt träningsprogram",
                "Starta ett träningspass", "Visa tidigare träningar", "Avsluta" };
        System.out.println("=====================");
        System.out.println("Välkommen till din träningsdagbok!");
        System.out.println("Välj ett alternativ:");
        for (int i = 0; i < mainMenuItems.length; i++) {
            System.out.println((i + 1) + ". " + mainMenuItems[i]);
        }
        System.out.println("=====================");
    }

    /**
     * läser in användarens val, endast numeriska inmatningar är tillåttna.
     * 
     * @return : returnerar användarens val av typen Integer
     */
    public static int readUserChoice(String message) {
        System.out.print(message);
        return scanner.nextInt();
    }

    /**
     * printar ut meny alternativ #1
     * Där användaren kan se olika övningar som är tillgängliga och kan eventuellt
     * välja bland dem.
     * 
     * @param exercises
     */
    public static void printExercises(ArrayList<String> exercises) {
        System.out.println("Tillgängliga övningar:");
        for (int i = 0; i < exercises.size(); i++) {
            System.out.println((i + 1) + ". " + exercises.get(i));
        }
    }

    public static void main(String[] args) {

        ovningar.add("Bänkpress");
        ovningar.add("Marklyft");
        ovningar.add("Knäböj");
        ovningar.add("Chins");
        ovningar.add("Curls");
        ovningar.add("Dips");

        boolean continueLoop = true;
        while (continueLoop) {
            printMainMenu();
            int userChoice = readUserChoice("Skriv ditt val: ");

            switch (userChoice) {
                case (0):
                    // om userChoice == 0: avsluta programmet.
                    continueLoop = false;
                    break;
                case (1):
                    printExercises(ovningar);
                    System.out.print("Skriv in ett tal: ");
                    scanner.nextInt();
                    break;
                case (2):
                    createUserProgram();
                    break;
                case (3):
                    // TODO
                    break;
                case (4):
                    // TODO
                    break;
                case (5):
                    System.exit(0);
                    break;
                default:
                    System.out.println("Fel inmatning, försök igen.");
                    break;
            }
        }
    }

}