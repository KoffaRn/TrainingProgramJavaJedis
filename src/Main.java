import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);
    static ArrayList<String> ovningar = new ArrayList<>();
    static HashMap<String, Integer> userProgram = new HashMap<>();
    static HashMap<String, Integer> userProgress = new HashMap<>();

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
                    // TODO
                    break;
                case (3):
                    // TODO
                    break;
                case (4):
                    // TODO
                    break;
                default:
                    System.out.println("Fel inmatning, försök igen.");
                    break;
            }
        }

        /*
         * 
         * public static void main(String[] args) {
         * ArrayList<String> ovningar = new ArrayList<>();
         * HashMap<String, Integer> userProgram = new HashMap<>();
         * HashMap<String, Integer> userProgress = new HashMap<>();
         * ovningar.add("Bänkpress");
         * ovningar.add("Marklyft");
         * ovningar.add("Knäböj");
         * ovningar.add("Chins");
         * ovningar.add("Curls");
         * ovningar.add("Dips");
         * 
         * /*
         * 
         * 
         * Metoder vi behöver:
         * Visa menyn, läs in användarens val, (avsluta) // Habib
         * 
         * Visa tillgängliga övningar (ovningar) // Habib
         * 
         * En metod för att lägga till övning och reps i userProgram / sluta lägga till
         * (klar med programmet) //Kristoffer
         * 
         * En metod för att visa userProgram //Ellen
         * 
         * En metod för att lägga till övningar man gjort i hashMap userProgress //
         * Sandra
         * 
         * " En metod för att skriva ut userProgress // Den som blir klar med sin metod
         * först (skriv på discord)
         * 
         * 
         * 
         * 
         * 
         * 
         * 
         * Pseudokod
         * Start:
         * Skapa en lista över tillgängliga övningar
         * Skapa en tom lista för användarens träningsprogram
         * Skapa en tom HashSet för att lagra användarens träningsframsteg
         * 
         * 
         * Skapa ett färdigt träningsprogram som ska föreslås för användaren.
         * 
         * Loop:
         * Skriv ut menyn med alternativ för användaren
         * Läs in användarens val
         * Om användaren väljer att avsluta:
         * Avsluta programmet
         * Om användaren väljer att visa tillgängliga övningar:
         * Skriv ut listan över tillgängliga övningar
         * Om användaren väljer att skapa ett nytt träningsprogram:
         * Skapa en ny lista för det anpassade träningsprogrammet
         * Loop:
         * Skriv ut listan över tillgängliga övningar
         * Läs in användarens val av övning
         * Läs in antalet repetitioner för övningen
         * Lägg till övningen i det anpassade träningsprogrammet
         * Fråga användaren om hen vill lägga till fler övningar
         * Om användaren väljer "Nej":
         * Bryt loopen
         * Lägg till det anpassade träningsprogrammet till användarens träningsprogram
         * 
         * Om användaren väljer att visa sitt träningsprogram:
         * Skriv ut listan över övningar i användarens träningsprogram
         * Om användaren väljer att registrera sina träningsframsteg:
         * Skriv ut en lista över övningar i användarens träningsprogram
         * Läs in användarens val av övning att registrera framsteg för
         * Läs in antalet repetitioner för övningen
         * Lägg till användarens träningsframsteg till HashSet för övningen
         * Om användaren väljer att visa sina träningsframsteg:
         * Skriv ut en sammanfattning av användarens träningsframsteg
         * Slut.
         * 
         */
    }

    static void addExercise(String name, int reps) {

    }
}