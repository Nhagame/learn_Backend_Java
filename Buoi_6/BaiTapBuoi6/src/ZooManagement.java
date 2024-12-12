import java.util.ArrayList;
import java.util.Scanner;
public class ZooManagement {
    public static void main(String[] args) {
        ManagerAnimal manager = new ManagerAnimal();
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("1. Add Lion");
            System.out.println("2. Add Elephant");
            System.out.println("3. Add Monkey");
            System.out.println("4. Stop Adding");
            System.out.println("Enter your choice:");
            choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    System.out.println("Enter name and age of Lion:");
                    String lionName = scanner.nextLine();
                    int lionAge = scanner.nextInt();
                    scanner.nextLine();
                    manager.addAnimal(new Lion(lionName, lionAge));
                    break;
                case 2:
                    System.out.println("Enter name and age of Elephant:");
                    String elephantName = scanner.nextLine();
                    int elephantAge = scanner.nextInt();
                    scanner.nextLine();
                    manager.addAnimal(new Elephant(elephantName, elephantAge));
                    break;
                case 3:
                    System.out.println("Enter name and age of Monkey:");
                    String monkeyName = scanner.nextLine();
                    int monkeyAge = scanner.nextInt();
                    scanner.nextLine();
                    manager.addAnimal(new Monkey(monkeyName, monkeyAge));
                    break;
                case 4:
                    System.out.println("Stopping input...");
                    break;
                default:
                    System.out.println("Invalid choice.");
            }
        } while (choice != 4);

        // Menu options
        int option;
        do {
            System.out.println("\nZoo Management Options:");
            System.out.println("1. Display All Animals");
            System.out.println("2. Search Animal By Name");
            System.out.println("3. Remove Animal By Name");
            System.out.println("4. Exit");
            System.out.println("Enter your option:");
            option = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (option) {
                case 1:
                    manager.displayAllAnimals();
                    break;
                case 2:
                    System.out.println("Enter animal name to search:");
                    String searchName = scanner.nextLine();
                    manager.searchAnimalByName(searchName);
                    break;
                case 3:
                    System.out.println("Enter animal name to remove:");
                    String removeName = scanner.nextLine();
                    manager.removeAnimalByName(removeName);
                    break;
                case 4:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid option.");
            }
        } while (option != 4);

        scanner.close();
    }
}