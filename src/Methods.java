import java.util.*;
class Methods {

    public static void printMenu2() {
        //var input = new Scanner(System.in);
        //MethodS.printMenu2(input); Meny1 -> gör val 2 "skapa träningsprogram"
        var menu2 = new ArrayList<String>();
        menu2.add("Lägg till övningar");
        menu2.add("Ta bort övningar");
        menu2.add("Avsluta");
        for (int i = 0; i < menu2.size(); i++) {
            System.out.println(menu2.get(i));
        }
    }
    public static void addExercise(Scanner input, List<String> ovningar, Map<String, Integer> userProgress) {
        System.out.println("Skriv namnet på övningen samt antal reps eller \"avsluta\" för att sluta lägga in");
        while (input.hasNext()) {
            String exerc = input.next();
            int reps = input.nextInt();
            if (exerc.equalsIgnoreCase("avsluta")) {
                break;
            } else if (ovningar.contains(exerc)) {
                userProgress.put(exerc, reps);
            } else {
                System.out.println("Övningen finns inte. Försök igen");
            }
        }
    }

    public static void removeExercise(Scanner input, Map<String, Integer> userProgress) {
        System.out.println("Skriv namnet på övningen du vill ta bort");
        while (input.hasNext()) {
            String choiceE = input.next();
            userProgress.remove(choiceE);
        }
    }
}
